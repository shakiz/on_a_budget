package com.finance.onabudget.app.modules.loading1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityLoading1Binding
import com.finance.onabudget.app.modules.loading1.`data`.viewmodel.Loading1VM
import kotlin.String
import kotlin.Unit

class Loading1Activity : BaseActivity<ActivityLoading1Binding>(R.layout.activity_loading1) {
  private val viewModel: Loading1VM by viewModels<Loading1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loading1VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOADING1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Loading1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
