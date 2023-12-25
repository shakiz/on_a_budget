package com.finance.onabudget.app.modules.opps.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.opps.`data`.model.OppsModel
import org.koin.core.KoinComponent

class OppsVM : ViewModel(), KoinComponent {
  val oppsModel: MutableLiveData<OppsModel> = MutableLiveData(OppsModel())

  var navArguments: Bundle? = null
}
