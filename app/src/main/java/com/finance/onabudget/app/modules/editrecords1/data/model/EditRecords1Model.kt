package com.finance.onabudget.app.modules.editrecords1.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class EditRecords1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditRecords: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_records)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouareupdatin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_are_updatin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangedate: String? = MyApp.getInstance().resources.getString(R.string.lbl_change_date)
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
  var txtEditnoteOpti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_note_opti)
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
