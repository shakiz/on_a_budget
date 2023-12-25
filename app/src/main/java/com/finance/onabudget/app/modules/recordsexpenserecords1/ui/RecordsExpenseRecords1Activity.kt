package com.finance.onabudget.app.modules.recordsexpenserecords1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.appcomponents.views.DatePickerFragment
import com.finance.onabudget.app.databinding.ActivityRecordsExpenseRecords1Binding
import com.finance.onabudget.app.modules.editrecords.ui.EditRecordsActivity
import com.finance.onabudget.app.modules.loading1.ui.Loading1Activity
import com.finance.onabudget.app.modules.recordsexpenserecords.ui.RecordsExpenseRecordsActivity
import com.finance.onabudget.app.modules.recordsexpenserecords1.`data`.viewmodel.RecordsExpenseRecords1VM
import com.finance.onabudget.app.modules.recordssavingsrecords.ui.RecordsSavingsRecordsActivity
import java.util.Date
import kotlin.String
import kotlin.Unit

class RecordsExpenseRecords1Activity :
    BaseActivity<ActivityRecordsExpenseRecords1Binding>(R.layout.activity_records_expense_records1)
    {
  private val viewModel: RecordsExpenseRecords1VM by viewModels<RecordsExpenseRecords1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recordsExpenseRecords1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearInputarea.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearInputarea(selectedDate)
      }
    }
    binding.linearInputarea1.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearInputarea1(selectedDate)
      }
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = Loading1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearInputarea2.setOnClickListener {
      val destIntent = RecordsExpenseRecordsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSavingsRecordsOne.setOnClickListener {
      val destIntent = RecordsSavingsRecordsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnEdit.setOnClickListener {
      val destIntent = EditRecordsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun onDateSelectedLinearInputarea(selectedDate: Date): Unit {
  }

  private fun onDateSelectedLinearInputarea1(selectedDate: Date): Unit {
  }

  companion object {
    const val TAG: String = "RECORDS_EXPENSE_RECORDS1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecordsExpenseRecords1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
