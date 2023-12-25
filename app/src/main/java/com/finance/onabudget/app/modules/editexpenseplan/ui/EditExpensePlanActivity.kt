package com.finance.onabudget.app.modules.editexpenseplan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityEditExpensePlanBinding
import com.finance.onabudget.app.modules.analyticssavingsplan1.ui.AnalyticsSavingsPlan1Activity
import com.finance.onabudget.app.modules.editexpenseplan.`data`.model.ListgroupsixRowModel
import com.finance.onabudget.app.modules.editexpenseplan.`data`.viewmodel.EditExpensePlanVM
import com.finance.onabudget.app.modules.expenseplanner2.ui.ExpensePlanner2Activity
import com.finance.onabudget.app.modules.expenseplanner5.ui.ExpensePlanner5Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditExpensePlanActivity :
    BaseActivity<ActivityEditExpensePlanBinding>(R.layout.activity_edit_expense_plan) {
  private val viewModel: EditExpensePlanVM by viewModels<EditExpensePlanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgroupsixAdapter =
    ListgroupsixAdapter(viewModel.listgroupsixList.value?:mutableListOf())
    binding.recyclerListgroupsix.adapter = listgroupsixAdapter
    listgroupsixAdapter.setOnItemClickListener(
    object : ListgroupsixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListgroupsixRowModel) {
        onClickRecyclerListgroupsix(view, position, item)
      }
    }
    )
    viewModel.listgroupsixList.observe(this) {
      listgroupsixAdapter.updateData(it)
    }
    binding.editExpensePlanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAddToExpensePlan.setOnClickListener {
      val destIntent = ExpensePlanner2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnlaptop.setOnClickListener {
      val destIntent = AnalyticsSavingsPlan1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListgroupsix(
    view: View,
    position: Int,
    item: ListgroupsixRowModel
  ): Unit {
    when(view.id) {
      R.id.btnEdit -> {
        onClickRecyclerListgroupsixBtnEdit(view, position, item)
      }
    }
  }

  fun onClickRecyclerListgroupsixBtnEdit(
    view: View,
    position: Int,
    item: ListgroupsixRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = ExpensePlanner5Activity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = ExpensePlanner5Activity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 -> {
        val destIntent = ExpensePlanner5Activity.getIntent(this, null)
        startActivity(destIntent)
      }
      3 -> {
        val destIntent = ExpensePlanner5Activity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "EDIT_EXPENSE_PLAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditExpensePlanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
