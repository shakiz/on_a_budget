package com.finance.onabudget.app.modules.notifications.ui

import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityNotificationsBinding
import com.finance.onabudget.app.modules.congratulations.ui.CongratulationsActivity
import com.finance.onabudget.app.modules.notifications.`data`.viewmodel.NotificationsVM
import com.finance.onabudget.app.modules.opps.ui.OppsActivity
import kotlin.String
import kotlin.Unit

class NotificationsActivity :
    BaseActivity<ActivityNotificationsBinding>(R.layout.activity_notifications) {
  private val viewModel: NotificationsVM by viewModels<NotificationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtCongratulationOne.setOnClickListener {
      val destIntent = CongratulationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowlimitationisc.setOnClickListener {
      val destIntent = OppsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtCongratulation.setOnClickListener {
      val destIntent = CongratulationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLimitationiscTwo.setOnClickListener {
      val destIntent = OppsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtCongratulationTwo.setOnClickListener {
      val destIntent = CongratulationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtCongratulationFour.setOnClickListener {
      val destIntent = CongratulationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLimitationiscOne.setOnClickListener {
      val destIntent = OppsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtCongratulationThree.setOnClickListener {
      val destIntent = CongratulationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLimitationiscFour.setOnClickListener {
      val destIntent = OppsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLimitationiscThree.setOnClickListener {
      val destIntent = OppsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_ACTIVITY"

  }
}
