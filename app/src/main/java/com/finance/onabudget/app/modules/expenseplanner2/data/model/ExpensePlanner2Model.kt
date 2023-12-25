package com.finance.onabudget.app.modules.expenseplanner2.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class ExpensePlanner2Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtExpenseplanner: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_expense_planner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_100002)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_100003)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt10of10000: String? = MyApp.getInstance().resources.getString(R.string.msg_10_of_1_00_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpendCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_spend_10_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemain90000: String? = MyApp.getInstance().resources.getString(R.string.lbl_remain_90_000)
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
