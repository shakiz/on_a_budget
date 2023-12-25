package com.finance.onabudget.app.modules.setpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivitySetPasswordBinding
import com.finance.onabudget.app.modules.setpassword.`data`.viewmodel.SetPasswordVM
import com.finance.onabudget.app.modules.signin.ui.SignInActivity
import kotlin.String
import kotlin.Unit

class SetPasswordActivity : BaseActivity<ActivitySetPasswordBinding>(R.layout.activity_set_password)
    {
  private val viewModel: SetPasswordVM by viewModels<SetPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.setPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSetNewPasswordOne.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SET_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SetPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
