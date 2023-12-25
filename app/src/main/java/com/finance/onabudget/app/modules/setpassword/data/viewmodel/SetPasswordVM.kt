package com.finance.onabudget.app.modules.setpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.setpassword.`data`.model.SetPasswordModel
import org.koin.core.KoinComponent

class SetPasswordVM : ViewModel(), KoinComponent {
  val setPasswordModel: MutableLiveData<SetPasswordModel> = MutableLiveData(SetPasswordModel())

  var navArguments: Bundle? = null
}
