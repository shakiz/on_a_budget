package com.finance.onabudget.app.modules.analyticsexpenseplan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.analyticsexpenseplan.`data`.model.AnalyticsExpensePlanModel
import com.finance.onabudget.app.modules.analyticsexpenseplan.`data`.model.Listgroup142RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AnalyticsExpensePlanVM : ViewModel(), KoinComponent {
  val analyticsExpensePlanModel: MutableLiveData<AnalyticsExpensePlanModel> =
      MutableLiveData(AnalyticsExpensePlanModel())

  var navArguments: Bundle? = null

  val listgroup142List: MutableLiveData<MutableList<Listgroup142RowModel>> =
      MutableLiveData(mutableListOf())
}
