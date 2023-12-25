package com.finance.onabudget.app.modules.expenseplanner4.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class ExpensePlanner4Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddmonthlyinc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_monthly_inc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulations9)
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
