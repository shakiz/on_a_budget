package com.finance.onabudget.app.modules.navigation.ui

import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityNavigationBinding
import com.finance.onabudget.app.modules.changecurrency.ui.ChangeCurrencyActivity
import com.finance.onabudget.app.modules.navigation.`data`.viewmodel.NavigationVM
import com.finance.onabudget.app.modules.recordsexpenserecords1.ui.RecordsExpenseRecords1Activity
import kotlin.String
import kotlin.Unit

class NavigationActivity : BaseActivity<ActivityNavigationBinding>(R.layout.activity_navigation) {
  private val viewModel: NavigationVM by viewModels<NavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.navigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnRecords.setOnClickListener {
      val destIntent = RecordsExpenseRecords1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnChangeCurrencyOne.setOnClickListener {
      val destIntent = ChangeCurrencyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NAVIGATION_ACTIVITY"

  }
}
