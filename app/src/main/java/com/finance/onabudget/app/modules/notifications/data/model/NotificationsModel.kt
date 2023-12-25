package com.finance.onabudget.app.modules.notifications.`data`.model

import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeareshowing: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_are_showing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLimitationisc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_limitation_is_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratulation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLimitationiscOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_limitation_is_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratulationOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLimitationiscTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_limitation_is_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratulationTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLimitationiscThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_limitation_is_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratulationThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLimitationiscFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_limitation_is_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratulationFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNinetyOneValue: String? = null
)
