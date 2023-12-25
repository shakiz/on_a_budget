package com.finance.onabudget.app.modules.expenseplanner9.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.expenseplanner9.`data`.model.ExpensePlanner9Model
import org.koin.core.KoinComponent

class ExpensePlanner9VM : ViewModel(), KoinComponent {
  val expensePlanner9Model: MutableLiveData<ExpensePlanner9Model> =
      MutableLiveData(ExpensePlanner9Model())

  var navArguments: Bundle? = null
}
