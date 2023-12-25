package com.finance.onabudget.app.modules.expenseplanner6.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.expenseplanner6.`data`.model.ExpensePlanner6Model
import org.koin.core.KoinComponent

class ExpensePlanner6VM : ViewModel(), KoinComponent {
  val expensePlanner6Model: MutableLiveData<ExpensePlanner6Model> =
      MutableLiveData(ExpensePlanner6Model())

  var navArguments: Bundle? = null
}
