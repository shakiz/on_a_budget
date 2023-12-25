package com.finance.onabudget.app.modules.recordssavingsrecords.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.appcomponents.views.DatePickerFragment
import com.finance.onabudget.app.databinding.ActivityRecordsSavingsRecordsBinding
import com.finance.onabudget.app.modules.loading.ui.LoadingActivity
import com.finance.onabudget.app.modules.recordsexpenserecords1.ui.RecordsExpenseRecords1Activity
import com.finance.onabudget.app.modules.recordssavingsrecords.`data`.model.ListmonthRowModel
import com.finance.onabudget.app.modules.recordssavingsrecords.`data`.viewmodel.RecordsSavingsRecordsVM
import com.finance.onabudget.app.modules.recordssavingsrecords1.ui.RecordsSavingsRecords1Activity
import java.util.Date
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecordsSavingsRecordsActivity :
    BaseActivity<ActivityRecordsSavingsRecordsBinding>(R.layout.activity_records_savings_records) {
  private val viewModel: RecordsSavingsRecordsVM by viewModels<RecordsSavingsRecordsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmonthAdapter = ListmonthAdapter(viewModel.listmonthList.value?:mutableListOf())
    binding.recyclerListmonth.adapter = listmonthAdapter
    listmonthAdapter.setOnItemClickListener(
    object : ListmonthAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmonthRowModel) {
        onClickRecyclerListmonth(view, position, item)
      }
    }
    )
    viewModel.listmonthList.observe(this) {
      listmonthAdapter.updateData(it)
    }
    binding.recordsSavingsRecordsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = LoadingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearInputarea1.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearInputarea1(selectedDate)
      }
    }
    binding.linearInputarea2.setOnClickListener {
      val destIntent = RecordsSavingsRecords1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearInputarea.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearInputarea(selectedDate)
      }
    }
    binding.btnExpenseRecordsOne.setOnClickListener {
      val destIntent = RecordsExpenseRecords1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListmonth(
    view: View,
    position: Int,
    item: ListmonthRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun onDateSelectedLinearInputarea1(selectedDate: Date): Unit {
  }

  private fun onDateSelectedLinearInputarea(selectedDate: Date): Unit {
  }

  companion object {
    const val TAG: String = "RECORDS_SAVINGS_RECORDS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecordsSavingsRecordsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
