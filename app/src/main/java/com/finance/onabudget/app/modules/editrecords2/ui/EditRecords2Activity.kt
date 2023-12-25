package com.finance.onabudget.app.modules.editrecords2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityEditRecords2Binding
import com.finance.onabudget.app.modules.editrecords2.`data`.viewmodel.EditRecords2VM
import com.finance.onabudget.app.modules.recordsexpenserecords1.ui.RecordsExpenseRecords1Activity
import kotlin.String
import kotlin.Unit

class EditRecords2Activity :
    BaseActivity<ActivityEditRecords2Binding>(R.layout.activity_edit_records2) {
  private val viewModel: EditRecords2VM by viewModels<EditRecords2VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editRecords2VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = RecordsExpenseRecords1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_RECORDS2ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditRecords2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
