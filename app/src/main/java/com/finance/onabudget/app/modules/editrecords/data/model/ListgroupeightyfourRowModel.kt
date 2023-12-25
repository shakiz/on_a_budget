package com.finance.onabudget.app.modules.editrecords.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class ListgroupeightyfourRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEightyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEightyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEightySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_6)

)
