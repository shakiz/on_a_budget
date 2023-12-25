package com.finance.onabudget.app.modules.expenseplanner1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityExpensePlanner1Binding
import com.finance.onabudget.app.modules.analyticssavingsplan1.ui.AnalyticsSavingsPlan1Activity
import com.finance.onabudget.app.modules.expenseplanner1.`data`.viewmodel.ExpensePlanner1VM
import kotlin.String
import kotlin.Unit

class ExpensePlanner1Activity :
    BaseActivity<ActivityExpensePlanner1Binding>(R.layout.activity_expense_planner1) {
  private val viewModel: ExpensePlanner1VM by viewModels<ExpensePlanner1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.expensePlanner1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = AnalyticsSavingsPlan1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EXPENSE_PLANNER1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExpensePlanner1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
