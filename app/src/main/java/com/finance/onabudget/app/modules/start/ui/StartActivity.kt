package com.finance.onabudget.app.modules.start.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityStartBinding
import com.finance.onabudget.app.modules.adddailyexpense3.ui.AddDailyExpense3Activity
import com.finance.onabudget.app.modules.signin.ui.SignInActivity
import com.finance.onabudget.app.modules.start.`data`.viewmodel.StartVM
import kotlin.String
import kotlin.Unit

class StartActivity : BaseActivity<ActivityStartBinding>(R.layout.activity_start) {
  private val viewModel: StartVM by viewModels<StartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.startVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = AddDailyExpense3Activity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnLetsGo.setOnClickListener {
        val destIntent = SignInActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "START_ACTIVITY"

    }
  }
