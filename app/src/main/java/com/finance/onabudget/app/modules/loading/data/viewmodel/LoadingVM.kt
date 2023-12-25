package com.finance.onabudget.app.modules.loading.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.loading.`data`.model.LoadingModel
import org.koin.core.KoinComponent

class LoadingVM : ViewModel(), KoinComponent {
  val loadingModel: MutableLiveData<LoadingModel> = MutableLiveData(LoadingModel())

  var navArguments: Bundle? = null
}
