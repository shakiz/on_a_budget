package com.finance.onabudget.app.modules.expenseplanner1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.expenseplanner1.`data`.model.ExpensePlanner1Model
import org.koin.core.KoinComponent

class ExpensePlanner1VM : ViewModel(), KoinComponent {
  val expensePlanner1Model: MutableLiveData<ExpensePlanner1Model> =
      MutableLiveData(ExpensePlanner1Model())

  var navArguments: Bundle? = null
}
