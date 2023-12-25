package com.finance.onabudget.app.modules.expenseplanner3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityExpensePlanner3Binding
import com.finance.onabudget.app.modules.expenseplanner1.ui.ExpensePlanner1Activity
import com.finance.onabudget.app.modules.expenseplanner3.`data`.viewmodel.ExpensePlanner3VM
import kotlin.String
import kotlin.Unit

class ExpensePlanner3Activity :
    BaseActivity<ActivityExpensePlanner3Binding>(R.layout.activity_expense_planner3) {
  private val viewModel: ExpensePlanner3VM by viewModels<ExpensePlanner3VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.expensePlanner3VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSetExpenseBudget.setOnClickListener {
      val destIntent = ExpensePlanner1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EXPENSE_PLANNER3ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExpensePlanner3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
