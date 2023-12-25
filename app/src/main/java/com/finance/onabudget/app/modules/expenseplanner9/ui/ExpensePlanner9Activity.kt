package com.finance.onabudget.app.modules.expenseplanner9.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityExpensePlanner9Binding
import com.finance.onabudget.app.modules.editdailyexpense.ui.EditDailyExpenseActivity
import com.finance.onabudget.app.modules.expenseplanner9.`data`.viewmodel.ExpensePlanner9VM
import kotlin.String
import kotlin.Unit

class ExpensePlanner9Activity :
    BaseActivity<ActivityExpensePlanner9Binding>(R.layout.activity_expense_planner9) {
  private val viewModel: ExpensePlanner9VM by viewModels<ExpensePlanner9VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.expensePlanner9VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = EditDailyExpenseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EXPENSE_PLANNER9ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExpensePlanner9Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
