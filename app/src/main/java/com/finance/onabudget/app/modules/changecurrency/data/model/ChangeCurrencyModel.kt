package com.finance.onabudget.app.modules.changecurrency.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class ChangeCurrencyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangecurrency: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_currency)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourcurrencyi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_currency_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangecurrencyOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_currency)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpense: String? = MyApp.getInstance().resources.getString(R.string.lbl_expense)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnalytics: String? = MyApp.getInstance().resources.getString(R.string.lbl_analytics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlanner: String? = MyApp.getInstance().resources.getString(R.string.lbl_planner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputareaValue: String? = null
)
