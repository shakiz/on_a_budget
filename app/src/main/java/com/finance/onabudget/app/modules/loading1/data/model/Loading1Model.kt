package com.finance.onabudget.app.modules.loading1.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class Loading1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecords: String? = MyApp.getInstance().resources.getString(R.string.lbl_records)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleasewaitwe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_wait_we)
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
