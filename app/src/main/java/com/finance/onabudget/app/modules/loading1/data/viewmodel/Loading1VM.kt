package com.finance.onabudget.app.modules.loading1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.loading1.`data`.model.Loading1Model
import org.koin.core.KoinComponent

class Loading1VM : ViewModel(), KoinComponent {
  val loading1Model: MutableLiveData<Loading1Model> = MutableLiveData(Loading1Model())

  var navArguments: Bundle? = null
}
