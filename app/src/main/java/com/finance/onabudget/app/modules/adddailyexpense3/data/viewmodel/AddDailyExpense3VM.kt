package com.finance.onabudget.app.modules.adddailyexpense3.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.adddailyexpense3.`data`.model.AddDailyExpense3Model
import org.koin.core.KoinComponent

class AddDailyExpense3VM : ViewModel(), KoinComponent {
  val addDailyExpense3Model: MutableLiveData<AddDailyExpense3Model> =
      MutableLiveData(AddDailyExpense3Model())

  var navArguments: Bundle? = null
}
