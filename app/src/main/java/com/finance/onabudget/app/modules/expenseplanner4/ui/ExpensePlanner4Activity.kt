package com.finance.onabudget.app.modules.expenseplanner4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityExpensePlanner4Binding
import com.finance.onabudget.app.modules.analyticssavingsplan1.ui.AnalyticsSavingsPlan1Activity
import com.finance.onabudget.app.modules.expenseplanner4.`data`.viewmodel.ExpensePlanner4VM
import kotlin.String
import kotlin.Unit

class ExpensePlanner4Activity :
    BaseActivity<ActivityExpensePlanner4Binding>(R.layout.activity_expense_planner4) {
  private val viewModel: ExpensePlanner4VM by viewModels<ExpensePlanner4VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.expensePlanner4VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = AnalyticsSavingsPlan1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EXPENSE_PLANNER4ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExpensePlanner4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
