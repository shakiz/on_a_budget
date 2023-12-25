package com.finance.onabudget.app.modules.adddailyexpense3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityAddDailyExpense3Binding
import com.finance.onabudget.app.modules.adddailyexpense3.`data`.viewmodel.AddDailyExpense3VM
import com.finance.onabudget.app.modules.expenseplanner9.ui.ExpensePlanner9Activity
import kotlin.String
import kotlin.Unit

class AddDailyExpense3Activity :
    BaseActivity<ActivityAddDailyExpense3Binding>(R.layout.activity_add_daily_expense3) {
  private val viewModel: AddDailyExpense3VM by viewModels<AddDailyExpense3VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addDailyExpense3VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = ExpensePlanner9Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_DAILY_EXPENSE3ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddDailyExpense3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
