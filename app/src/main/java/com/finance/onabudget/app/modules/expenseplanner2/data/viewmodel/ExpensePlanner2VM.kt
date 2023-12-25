package com.finance.onabudget.app.modules.expenseplanner2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.expenseplanner2.`data`.model.ExpensePlanner2Model
import com.finance.onabudget.app.modules.expenseplanner2.`data`.model.Listgroupeightyfour1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExpensePlanner2VM : ViewModel(), KoinComponent {
  val expensePlanner2Model: MutableLiveData<ExpensePlanner2Model> =
      MutableLiveData(ExpensePlanner2Model())

  var navArguments: Bundle? = null

  val listgroupeightyfourList: MutableLiveData<MutableList<Listgroupeightyfour1RowModel>> =
      MutableLiveData(mutableListOf())
}
