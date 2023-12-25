package com.finance.onabudget.app.modules.expenseplanner.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class GridthumbsupTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtClothing: String? = MyApp.getInstance().resources.getString(R.string.lbl_clothing)

)
