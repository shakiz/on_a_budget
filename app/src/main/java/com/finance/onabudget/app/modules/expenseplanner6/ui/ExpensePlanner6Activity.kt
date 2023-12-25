package com.finance.onabudget.app.modules.expenseplanner6.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityExpensePlanner6Binding
import com.finance.onabudget.app.modules.analyticssavingsplan1.ui.AnalyticsSavingsPlan1Activity
import com.finance.onabudget.app.modules.expenseplanner6.`data`.viewmodel.ExpensePlanner6VM
import kotlin.String
import kotlin.Unit

class ExpensePlanner6Activity :
    BaseActivity<ActivityExpensePlanner6Binding>(R.layout.activity_expense_planner6) {
  private val viewModel: ExpensePlanner6VM by viewModels<ExpensePlanner6VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.expensePlanner6VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = AnalyticsSavingsPlan1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EXPENSE_PLANNER6ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExpensePlanner6Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
