package com.finance.onabudget.app.modules.congratulations.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityCongratulationsBinding
import com.finance.onabudget.app.modules.analyticssavingsplan.ui.AnalyticsSavingsPlanActivity
import com.finance.onabudget.app.modules.congratulations.`data`.viewmodel.CongratulationsVM
import kotlin.String
import kotlin.Unit

class CongratulationsActivity :
    BaseActivity<ActivityCongratulationsBinding>(R.layout.activity_congratulations) {
  private val viewModel: CongratulationsVM by viewModels<CongratulationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.congratulationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = AnalyticsSavingsPlanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CONGRATULATIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CongratulationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
