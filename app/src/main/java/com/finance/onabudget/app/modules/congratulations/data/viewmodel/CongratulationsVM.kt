package com.finance.onabudget.app.modules.congratulations.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.congratulations.`data`.model.CongratulationsModel
import org.koin.core.KoinComponent

class CongratulationsVM : ViewModel(), KoinComponent {
  val congratulationsModel: MutableLiveData<CongratulationsModel> =
      MutableLiveData(CongratulationsModel())

  var navArguments: Bundle? = null
}
