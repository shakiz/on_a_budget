package com.finance.onabudget.app.modules.expenseplanner5.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.expenseplanner5.`data`.model.ExpensePlanner5Model
import com.finance.onabudget.app.modules.expenseplanner5.`data`.model.Listgroupeightyfour3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExpensePlanner5VM : ViewModel(), KoinComponent {
  val expensePlanner5Model: MutableLiveData<ExpensePlanner5Model> =
      MutableLiveData(ExpensePlanner5Model())

  var navArguments: Bundle? = null

  val listgroupeightyfourList: MutableLiveData<MutableList<Listgroupeightyfour3RowModel>> =
      MutableLiveData(mutableListOf())
}
