package com.finance.onabudget.app.modules.expenseplanner.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.expenseplanner.`data`.model.ExpensePlannerModel
import com.finance.onabudget.app.modules.expenseplanner.`data`.model.GridthumbsupTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExpensePlannerVM : ViewModel(), KoinComponent {
  val expensePlannerModel: MutableLiveData<ExpensePlannerModel> =
      MutableLiveData(ExpensePlannerModel())

  var navArguments: Bundle? = null

  val gridthumbsupTwoList: MutableLiveData<MutableList<GridthumbsupTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
