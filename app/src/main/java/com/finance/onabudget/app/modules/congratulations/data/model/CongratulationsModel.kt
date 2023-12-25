package com.finance.onabudget.app.modules.congratulations.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class CongratulationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratulationsOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratulationsThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulations6)
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

)
