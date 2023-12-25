package com.finance.onabudget.app.modules.addmonthlyincome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.addmonthlyincome.`data`.model.AddMonthlyIncomeModel
import com.finance.onabudget.app.modules.addmonthlyincome.`data`.model.Listgroupeightyfour2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AddMonthlyIncomeVM : ViewModel(), KoinComponent {
  val addMonthlyIncomeModel: MutableLiveData<AddMonthlyIncomeModel> =
      MutableLiveData(AddMonthlyIncomeModel())

  var navArguments: Bundle? = null

  val listgroupeightyfourList: MutableLiveData<MutableList<Listgroupeightyfour2RowModel>> =
      MutableLiveData(mutableListOf())
}
