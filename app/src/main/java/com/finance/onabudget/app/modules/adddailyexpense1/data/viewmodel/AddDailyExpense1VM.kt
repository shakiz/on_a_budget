package com.finance.onabudget.app.modules.adddailyexpense1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.adddailyexpense1.`data`.model.AddDailyExpense1Model
import com.finance.onabudget.app.modules.adddailyexpense1.`data`.model.GridthumbsupTwo1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AddDailyExpense1VM : ViewModel(), KoinComponent {
  val addDailyExpense1Model: MutableLiveData<AddDailyExpense1Model> =
      MutableLiveData(AddDailyExpense1Model())

  var navArguments: Bundle? = null

  val gridthumbsupTwoList: MutableLiveData<MutableList<GridthumbsupTwo1RowModel>> =
      MutableLiveData(mutableListOf())
}
