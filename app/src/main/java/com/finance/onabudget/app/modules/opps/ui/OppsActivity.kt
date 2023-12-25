package com.finance.onabudget.app.modules.opps.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityOppsBinding
import com.finance.onabudget.app.modules.analyticssavingsplan.ui.AnalyticsSavingsPlanActivity
import com.finance.onabudget.app.modules.opps.`data`.viewmodel.OppsVM
import kotlin.String
import kotlin.Unit

class OppsActivity : BaseActivity<ActivityOppsBinding>(R.layout.activity_opps) {
  private val viewModel: OppsVM by viewModels<OppsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.oppsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = AnalyticsSavingsPlanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OPPS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OppsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
