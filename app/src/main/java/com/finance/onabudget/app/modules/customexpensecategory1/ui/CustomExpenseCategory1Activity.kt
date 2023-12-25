package com.finance.onabudget.app.modules.customexpensecategory1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityCustomExpenseCategory1Binding
import com.finance.onabudget.app.modules.analyticssavingsplan1.ui.AnalyticsSavingsPlan1Activity
import com.finance.onabudget.app.modules.customexpensecategory1.`data`.viewmodel.CustomExpenseCategory1VM
import kotlin.String
import kotlin.Unit

class CustomExpenseCategory1Activity :
    BaseActivity<ActivityCustomExpenseCategory1Binding>(R.layout.activity_custom_expense_category1)
    {
  private val viewModel: CustomExpenseCategory1VM by viewModels<CustomExpenseCategory1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.customExpenseCategory1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = AnalyticsSavingsPlan1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CUSTOM_EXPENSE_CATEGORY1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CustomExpenseCategory1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
