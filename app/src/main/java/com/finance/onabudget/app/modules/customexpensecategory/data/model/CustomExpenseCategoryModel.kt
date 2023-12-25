package com.finance.onabudget.app.modules.customexpensecategory.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class CustomExpenseCategoryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtExpenseplanner: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_expense_planner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterthename: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_the_name)
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
  var etLanguageValue: String? = null
)
