package com.finance.onabudget.app.modules.changecurrency1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityChangeCurrency1Binding
import com.finance.onabudget.app.modules.analyticssavingsplan.ui.AnalyticsSavingsPlanActivity
import com.finance.onabudget.app.modules.changecurrency1.`data`.viewmodel.ChangeCurrency1VM
import kotlin.String
import kotlin.Unit

class ChangeCurrency1Activity :
    BaseActivity<ActivityChangeCurrency1Binding>(R.layout.activity_change_currency1) {
  private val viewModel: ChangeCurrency1VM by viewModels<ChangeCurrency1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.changeCurrency1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = AnalyticsSavingsPlanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHANGE_CURRENCY1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChangeCurrency1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
