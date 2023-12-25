package com.finance.onabudget.app.modules.addmonthlyincome.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class AddMonthlyIncomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddmonthlyinc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_monthly_inc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt100000: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_00_000)
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
