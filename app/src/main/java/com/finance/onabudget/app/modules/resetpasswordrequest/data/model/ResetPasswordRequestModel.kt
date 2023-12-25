package com.finance.onabudget.app.modules.resetpasswordrequest.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class ResetPasswordRequestModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtResetpassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null
)
