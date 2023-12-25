package com.finance.onabudget.app.modules.expenseplanner.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityExpensePlannerBinding
import com.finance.onabudget.app.modules.customexpensecategory.ui.CustomExpenseCategoryActivity
import com.finance.onabudget.app.modules.expenseplanner.`data`.model.GridthumbsupTwoRowModel
import com.finance.onabudget.app.modules.expenseplanner.`data`.viewmodel.ExpensePlannerVM
import com.finance.onabudget.app.modules.expenseplanner3.ui.ExpensePlanner3Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExpensePlannerActivity :
    BaseActivity<ActivityExpensePlannerBinding>(R.layout.activity_expense_planner) {
  private val viewModel: ExpensePlannerVM by viewModels<ExpensePlannerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridthumbsupTwoAdapter =
    GridthumbsupTwoAdapter(viewModel.gridthumbsupTwoList.value?:mutableListOf())
    binding.recyclerGridthumbsupTwo.adapter = gridthumbsupTwoAdapter
    gridthumbsupTwoAdapter.setOnItemClickListener(
    object : GridthumbsupTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridthumbsupTwoRowModel) {
        onClickRecyclerGridthumbsupTwo(view, position, item)
      }
    }
    )
    viewModel.gridthumbsupTwoList.observe(this) {
      gridthumbsupTwoAdapter.updateData(it)
    }
    binding.expensePlannerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAddCustomExpenseCategory.setOnClickListener {
      val destIntent = CustomExpenseCategoryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridthumbsupTwo(
    view: View,
    position: Int,
    item: GridthumbsupTwoRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnthumbsup ->  {
        val destIntent = ExpensePlanner3Activity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "EXPENSE_PLANNER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExpensePlannerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
