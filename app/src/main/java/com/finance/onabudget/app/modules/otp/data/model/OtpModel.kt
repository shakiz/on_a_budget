package com.finance.onabudget.app.modules.otp.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class OtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOTP: String? = MyApp.getInstance().resources.getString(R.string.lbl_otp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSendOTPagain: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_send_otp_again)

)
