package com.finance.onabudget.app.modules.adddailyexpense2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.adddailyexpense2.`data`.model.AddDailyExpense2Model
import org.koin.core.KoinComponent

class AddDailyExpense2VM : ViewModel(), KoinComponent {
  val addDailyExpense2Model: MutableLiveData<AddDailyExpense2Model> =
      MutableLiveData(AddDailyExpense2Model())

  var navArguments: Bundle? = null
}
