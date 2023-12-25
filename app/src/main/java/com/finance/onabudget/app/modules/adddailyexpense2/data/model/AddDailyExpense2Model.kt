package com.finance.onabudget.app.modules.adddailyexpense2.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class AddDailyExpense2Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdddailyexpen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_daily_expen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouaregoingt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_are_going_t2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectdate: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputarea: String? = MyApp.getInstance().resources.getString(R.string.lbl_02)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputareaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_02)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddnoteOptio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_note_optio)
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
  var etZipcodeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputareaTwoValue: String? = null
)
