package com.finance.onabudget.app.modules.adddailyexpense2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityAddDailyExpense2Binding
import com.finance.onabudget.app.modules.adddailyexpense2.`data`.viewmodel.AddDailyExpense2VM
import com.finance.onabudget.app.modules.expenseplanner7.ui.ExpensePlanner7Activity
import kotlin.String
import kotlin.Unit

class AddDailyExpense2Activity :
    BaseActivity<ActivityAddDailyExpense2Binding>(R.layout.activity_add_daily_expense2) {
  private val viewModel: AddDailyExpense2VM by viewModels<AddDailyExpense2VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addDailyExpense2VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAdd.setOnClickListener {
      val destIntent = ExpensePlanner7Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_DAILY_EXPENSE2ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddDailyExpense2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
