package com.finance.onabudget.app.modules.adddailyexpense.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.adddailyexpense.`data`.model.AddDailyExpenseModel
import com.finance.onabudget.app.modules.adddailyexpense.`data`.model.Listgroupeightyfour4RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AddDailyExpenseVM : ViewModel(), KoinComponent {
  val addDailyExpenseModel: MutableLiveData<AddDailyExpenseModel> =
      MutableLiveData(AddDailyExpenseModel())

  var navArguments: Bundle? = null

  val listgroupeightyfourList: MutableLiveData<MutableList<Listgroupeightyfour4RowModel>> =
      MutableLiveData(mutableListOf())
}
