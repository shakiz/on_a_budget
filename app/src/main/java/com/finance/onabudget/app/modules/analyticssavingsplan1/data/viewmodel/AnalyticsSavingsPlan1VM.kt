package com.finance.onabudget.app.modules.analyticssavingsplan1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.analyticssavingsplan1.`data`.model.AnalyticsSavingsPlan1Model
import com.finance.onabudget.app.modules.analyticssavingsplan1.`data`.model.Listgroup466RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AnalyticsSavingsPlan1VM : ViewModel(), KoinComponent {
  val analyticsSavingsPlan1Model: MutableLiveData<AnalyticsSavingsPlan1Model> =
      MutableLiveData(AnalyticsSavingsPlan1Model())

  var navArguments: Bundle? = null

  val listgroup466List: MutableLiveData<MutableList<Listgroup466RowModel>> =
      MutableLiveData(mutableListOf())
}
