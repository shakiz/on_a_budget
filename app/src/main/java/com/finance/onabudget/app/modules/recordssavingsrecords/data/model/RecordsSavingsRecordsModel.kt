package com.finance.onabudget.app.modules.recordssavingsrecords.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class RecordsSavingsRecordsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecords: String? = MyApp.getInstance().resources.getString(R.string.lbl_records)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStartDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_start_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEndDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_end_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownload: String? = MyApp.getInstance().resources.getString(R.string.lbl_download)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_congratulations2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_savings_in_last)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResultsShowin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_results_showin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpenseOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_expense)
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
