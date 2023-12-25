package com.finance.onabudget.app.modules.recordssavingsrecords1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityRecordsSavingsRecords1Binding
import com.finance.onabudget.app.modules.recordssavingsrecords.ui.RecordsSavingsRecordsActivity
import com.finance.onabudget.app.modules.recordssavingsrecords1.`data`.viewmodel.RecordsSavingsRecords1VM
import kotlin.String
import kotlin.Unit

class RecordsSavingsRecords1Activity :
    BaseActivity<ActivityRecordsSavingsRecords1Binding>(R.layout.activity_records_savings_records1)
    {
  private val viewModel: RecordsSavingsRecords1VM by viewModels<RecordsSavingsRecords1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recordsSavingsRecords1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = RecordsSavingsRecordsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RECORDS_SAVINGS_RECORDS1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecordsSavingsRecords1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
