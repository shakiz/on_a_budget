package com.finance.onabudget.app.modules.recordsexpenserecords.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityRecordsExpenseRecordsBinding
import com.finance.onabudget.app.modules.recordsexpenserecords.`data`.viewmodel.RecordsExpenseRecordsVM
import com.finance.onabudget.app.modules.recordsexpenserecords1.ui.RecordsExpenseRecords1Activity
import kotlin.String
import kotlin.Unit

class RecordsExpenseRecordsActivity :
    BaseActivity<ActivityRecordsExpenseRecordsBinding>(R.layout.activity_records_expense_records) {
  private val viewModel: RecordsExpenseRecordsVM by viewModels<RecordsExpenseRecordsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recordsExpenseRecordsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = RecordsExpenseRecords1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RECORDS_EXPENSE_RECORDS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecordsExpenseRecordsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
