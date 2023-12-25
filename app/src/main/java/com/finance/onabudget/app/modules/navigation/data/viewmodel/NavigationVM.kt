package com.finance.onabudget.app.modules.navigation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.navigation.`data`.model.NavigationModel
import org.koin.core.KoinComponent

class NavigationVM : ViewModel(), KoinComponent {
  val navigationModel: MutableLiveData<NavigationModel> = MutableLiveData(NavigationModel())

  var navArguments: Bundle? = null
}
