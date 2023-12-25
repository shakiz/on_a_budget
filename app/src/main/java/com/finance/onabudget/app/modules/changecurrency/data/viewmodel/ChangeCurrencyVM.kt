package com.finance.onabudget.app.modules.changecurrency.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.changecurrency.`data`.model.ChangeCurrencyModel
import org.koin.core.KoinComponent

class ChangeCurrencyVM : ViewModel(), KoinComponent {
  val changeCurrencyModel: MutableLiveData<ChangeCurrencyModel> =
      MutableLiveData(ChangeCurrencyModel())

  var navArguments: Bundle? = null
}
