package com.finance.onabudget.app.modules.loading.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityLoadingBinding
import com.finance.onabudget.app.modules.loading.`data`.viewmodel.LoadingVM
import kotlin.String
import kotlin.Unit

class LoadingActivity : BaseActivity<ActivityLoadingBinding>(R.layout.activity_loading) {
  private val viewModel: LoadingVM by viewModels<LoadingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loadingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOADING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoadingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
