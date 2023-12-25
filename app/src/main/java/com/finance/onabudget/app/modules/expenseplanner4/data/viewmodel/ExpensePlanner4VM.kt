package com.finance.onabudget.app.modules.expenseplanner4.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.expenseplanner4.`data`.model.ExpensePlanner4Model
import org.koin.core.KoinComponent

class ExpensePlanner4VM : ViewModel(), KoinComponent {
  val expensePlanner4Model: MutableLiveData<ExpensePlanner4Model> =
      MutableLiveData(ExpensePlanner4Model())

  var navArguments: Bundle? = null
}
