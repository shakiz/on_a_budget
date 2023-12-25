package com.finance.onabudget.app.modules.changecurrency.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityChangeCurrencyBinding
import com.finance.onabudget.app.modules.changecurrency.`data`.viewmodel.ChangeCurrencyVM
import com.finance.onabudget.app.modules.changecurrency1.ui.ChangeCurrency1Activity
import kotlin.String
import kotlin.Unit

class ChangeCurrencyActivity :
    BaseActivity<ActivityChangeCurrencyBinding>(R.layout.activity_change_currency) {
  private val viewModel: ChangeCurrencyVM by viewModels<ChangeCurrencyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.changeCurrencyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = ChangeCurrency1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHANGE_CURRENCY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChangeCurrencyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
