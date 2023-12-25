package com.finance.onabudget.app.modules.editdailyexpense.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityEditDailyExpenseBinding
import com.finance.onabudget.app.modules.adddailyexpense.ui.AddDailyExpenseActivity
import com.finance.onabudget.app.modules.editdailyexpense.`data`.model.ListgroupfiftyfiveRowModel
import com.finance.onabudget.app.modules.editdailyexpense.`data`.viewmodel.EditDailyExpenseVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditDailyExpenseActivity :
    BaseActivity<ActivityEditDailyExpenseBinding>(R.layout.activity_edit_daily_expense) {
  private val viewModel: EditDailyExpenseVM by viewModels<EditDailyExpenseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgroupfiftyfiveAdapter =
    ListgroupfiftyfiveAdapter(viewModel.listgroupfiftyfiveList.value?:mutableListOf())
    binding.recyclerListgroupfiftyfive.adapter = listgroupfiftyfiveAdapter
    listgroupfiftyfiveAdapter.setOnItemClickListener(
    object : ListgroupfiftyfiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListgroupfiftyfiveRowModel) {
        onClickRecyclerListgroupfiftyfive(view, position, item)
      }
    }
    )
    viewModel.listgroupfiftyfiveList.observe(this) {
      listgroupfiftyfiveAdapter.updateData(it)
    }
    binding.editDailyExpenseVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAddDailyExpenseOne.setOnClickListener {
      val destIntent = AddDailyExpenseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListgroupfiftyfive(
    view: View,
    position: Int,
    item: ListgroupfiftyfiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EDIT_DAILY_EXPENSE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditDailyExpenseActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
