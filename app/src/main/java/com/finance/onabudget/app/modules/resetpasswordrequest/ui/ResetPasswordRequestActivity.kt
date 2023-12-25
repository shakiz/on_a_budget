package com.finance.onabudget.app.modules.resetpasswordrequest.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityResetPasswordRequestBinding
import com.finance.onabudget.app.modules.otp.ui.OtpActivity
import com.finance.onabudget.app.modules.resetpasswordrequest.`data`.viewmodel.ResetPasswordRequestVM
import kotlin.String
import kotlin.Unit

class ResetPasswordRequestActivity :
    BaseActivity<ActivityResetPasswordRequestBinding>(R.layout.activity_reset_password_request) {
  private val viewModel: ResetPasswordRequestVM by viewModels<ResetPasswordRequestVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.resetPasswordRequestVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSendOtp.setOnClickListener {
      val destIntent = OtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RESET_PASSWORD_REQUEST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ResetPasswordRequestActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
