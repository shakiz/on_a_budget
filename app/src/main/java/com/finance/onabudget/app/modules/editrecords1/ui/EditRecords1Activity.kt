package com.finance.onabudget.app.modules.editrecords1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityEditRecords1Binding
import com.finance.onabudget.app.modules.editrecords1.`data`.viewmodel.EditRecords1VM
import com.finance.onabudget.app.modules.editrecords2.ui.EditRecords2Activity
import kotlin.String
import kotlin.Unit

class EditRecords1Activity :
    BaseActivity<ActivityEditRecords1Binding>(R.layout.activity_edit_records1) {
  private val viewModel: EditRecords1VM by viewModels<EditRecords1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editRecords1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = EditRecords2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_RECORDS1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditRecords1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
