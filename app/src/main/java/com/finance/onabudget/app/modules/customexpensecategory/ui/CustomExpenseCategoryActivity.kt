package com.finance.onabudget.app.modules.customexpensecategory.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityCustomExpenseCategoryBinding
import com.finance.onabudget.app.modules.customexpensecategory.`data`.viewmodel.CustomExpenseCategoryVM
import com.finance.onabudget.app.modules.customexpensecategory1.ui.CustomExpenseCategory1Activity
import kotlin.String
import kotlin.Unit

class CustomExpenseCategoryActivity :
    BaseActivity<ActivityCustomExpenseCategoryBinding>(R.layout.activity_custom_expense_category) {
  private val viewModel: CustomExpenseCategoryVM by viewModels<CustomExpenseCategoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.customExpenseCategoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = CustomExpenseCategory1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CUSTOM_EXPENSE_CATEGORY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CustomExpenseCategoryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
