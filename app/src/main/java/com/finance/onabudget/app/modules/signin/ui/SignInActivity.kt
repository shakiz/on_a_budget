package com.finance.onabudget.app.modules.signin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivitySignInBinding
import com.finance.onabudget.app.modules.analyticssavingsplan.ui.AnalyticsSavingsPlanActivity
import com.finance.onabudget.app.modules.resetpasswordrequest.ui.ResetPasswordRequestActivity
import com.finance.onabudget.app.modules.signin.`data`.viewmodel.SignInVM
import com.finance.onabudget.app.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
  private val viewModel: SignInVM by viewModels<SignInVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtConfirmation.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtForgetpassword.setOnClickListener {
      val destIntent = ResetPasswordRequestActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignIn.setOnClickListener {
      val destIntent = AnalyticsSavingsPlanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_IN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignInActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
