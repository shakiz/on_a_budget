package com.finance.onabudget.app.modules.expenseplanner7.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityExpensePlanner7Binding
import com.finance.onabudget.app.modules.analyticsexpenseplan.ui.AnalyticsExpensePlanActivity
import com.finance.onabudget.app.modules.expenseplanner7.`data`.viewmodel.ExpensePlanner7VM
import kotlin.String
import kotlin.Unit

class ExpensePlanner7Activity :
    BaseActivity<ActivityExpensePlanner7Binding>(R.layout.activity_expense_planner7) {
  private val viewModel: ExpensePlanner7VM by viewModels<ExpensePlanner7VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.expensePlanner7VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = AnalyticsExpensePlanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EXPENSE_PLANNER7ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExpensePlanner7Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
