package com.finance.onabudget.app.modules.adddailyexpense1.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class AddDailyExpense1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdddailyexpen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_daily_expen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectexpense: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_expense)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt10000: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBaby: String? = MyApp.getInstance().resources.getString(R.string.lbl_baby)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeauty: String? = MyApp.getInstance().resources.getString(R.string.lbl_beauty)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBills: String? = MyApp.getInstance().resources.getString(R.string.lbl_bills)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCarOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_car)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShopping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSocial: String? = MyApp.getInstance().resources.getString(R.string.lbl_social)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSports: String? = MyApp.getInstance().resources.getString(R.string.lbl_sports)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTax: String? = MyApp.getInstance().resources.getString(R.string.lbl_tax)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTelephone: String? = MyApp.getInstance().resources.getString(R.string.lbl_telephone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTranspora: String? = MyApp.getInstance().resources.getString(R.string.lbl_transpora)
  ,
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
  var txtSpendCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_spend_3_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemain1000: String? = MyApp.getInstance().resources.getString(R.string.lbl_remain_1_000)
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
