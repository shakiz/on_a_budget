package com.finance.onabudget.app.modules.expenseplanner7.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.expenseplanner7.`data`.model.ExpensePlanner7Model
import org.koin.core.KoinComponent

class ExpensePlanner7VM : ViewModel(), KoinComponent {
  val expensePlanner7Model: MutableLiveData<ExpensePlanner7Model> =
      MutableLiveData(ExpensePlanner7Model())

  var navArguments: Bundle? = null
}
