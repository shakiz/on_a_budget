package com.finance.onabudget.app.modules.analyticssavingsplan.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class Listgroup109RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_expense2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt60of10000: String? = MyApp.getInstance().resources.getString(R.string.msg_60_of_1_00_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt60000: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpendCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_spend_10_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemain30000: String? = MyApp.getInstance().resources.getString(R.string.lbl_remain_30_000)

)
