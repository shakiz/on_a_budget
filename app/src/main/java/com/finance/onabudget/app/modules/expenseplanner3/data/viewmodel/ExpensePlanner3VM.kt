package com.finance.onabudget.app.modules.expenseplanner3.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.expenseplanner3.`data`.model.ExpensePlanner3Model
import org.koin.core.KoinComponent

class ExpensePlanner3VM : ViewModel(), KoinComponent {
  val expensePlanner3Model: MutableLiveData<ExpensePlanner3Model> =
      MutableLiveData(ExpensePlanner3Model())

  var navArguments: Bundle? = null
}
