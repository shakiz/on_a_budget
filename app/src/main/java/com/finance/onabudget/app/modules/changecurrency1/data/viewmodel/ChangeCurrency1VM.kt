package com.finance.onabudget.app.modules.changecurrency1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.changecurrency1.`data`.model.ChangeCurrency1Model
import org.koin.core.KoinComponent

class ChangeCurrency1VM : ViewModel(), KoinComponent {
  val changeCurrency1Model: MutableLiveData<ChangeCurrency1Model> =
      MutableLiveData(ChangeCurrency1Model())

  var navArguments: Bundle? = null
}
