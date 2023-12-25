package com.finance.onabudget.app.modules.setpassword.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class SetPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtResetpassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputOneValue: String? = null
)
