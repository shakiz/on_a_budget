package com.finance.onabudget.app.modules.start.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class StartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBudgetMan: String? = MyApp.getInstance().resources.getString(R.string.lbl_budgetman)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_budgetman_is_a)

)
