package com.finance.onabudget.app.modules.expenseplanner8.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.expenseplanner8.`data`.model.ExpensePlanner8Model
import com.finance.onabudget.app.modules.expenseplanner8.`data`.model.Listgroupeightyfour5RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExpensePlanner8VM : ViewModel(), KoinComponent {
  val expensePlanner8Model: MutableLiveData<ExpensePlanner8Model> =
      MutableLiveData(ExpensePlanner8Model())

  var navArguments: Bundle? = null

  val listgroupeightyfourList: MutableLiveData<MutableList<Listgroupeightyfour5RowModel>> =
      MutableLiveData(mutableListOf())
}
