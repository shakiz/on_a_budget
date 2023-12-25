package com.finance.onabudget.app.modules.analyticssavingsplan.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class AnalyticsSavingsPlanModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAnalytics: String? = MyApp.getInstance().resources.getString(R.string.lbl_analytics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMarchCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_march_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_days)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt100000: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_00_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalincome: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_income)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSavingsplan: String? = MyApp.getInstance().resources.getString(R.string.lbl_savings_plan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpenseplan: String? = MyApp.getInstance().resources.getString(R.string.lbl_expense_plan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixty: String? = MyApp.getInstance().resources.getString(R.string.lbl_60)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFigureMarchTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_figure_march_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpenseupdate: String? =
      MyApp.getInstance().resources.getString(R.string.msg_expense_update)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpense: String? = MyApp.getInstance().resources.getString(R.string.lbl_expense)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnalyticsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_analytics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnalyticsTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_analytics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlanner: String? = MyApp.getInstance().resources.getString(R.string.lbl_planner)

)
