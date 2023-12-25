package com.finance.onabudget.app.modules.analyticsexpenseplan.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class Listgroup142RowModel(
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
  var txt5000: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpendCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_spend_4_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemain1000: String? = MyApp.getInstance().resources.getString(R.string.lbl_remain_1_000)

)
