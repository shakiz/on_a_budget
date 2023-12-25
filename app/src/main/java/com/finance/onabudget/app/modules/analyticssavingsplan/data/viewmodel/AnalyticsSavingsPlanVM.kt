package com.finance.onabudget.app.modules.analyticssavingsplan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.analyticssavingsplan.`data`.model.AnalyticsSavingsPlanModel
import com.finance.onabudget.app.modules.analyticssavingsplan.`data`.model.Listgroup109RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AnalyticsSavingsPlanVM : ViewModel(), KoinComponent {
  val analyticsSavingsPlanModel: MutableLiveData<AnalyticsSavingsPlanModel> =
      MutableLiveData(AnalyticsSavingsPlanModel())

  var navArguments: Bundle? = null

  val listgroup109List: MutableLiveData<MutableList<Listgroup109RowModel>> =
      MutableLiveData(mutableListOf())
}
