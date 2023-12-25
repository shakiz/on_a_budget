package com.finance.onabudget.app.modules.analyticssavingsplan1.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class AnalyticsSavingsPlan1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlanner: String? = MyApp.getInstance().resources.getString(R.string.lbl_planner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMakeproperpla: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_proper_pla)
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
  var txtPlannerOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_planner)

)
