package com.finance.onabudget.app.modules.expenseplanner5.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class ExpensePlanner5Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditexpensepl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_expense_pl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5000: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_baby2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5of100000: String? = MyApp.getInstance().resources.getString(R.string.msg_5_of_1_00_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5000One: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_000)
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
