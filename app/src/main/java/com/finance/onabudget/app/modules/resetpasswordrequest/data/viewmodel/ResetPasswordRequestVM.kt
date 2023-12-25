package com.finance.onabudget.app.modules.resetpasswordrequest.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.resetpasswordrequest.`data`.model.ResetPasswordRequestModel
import org.koin.core.KoinComponent

class ResetPasswordRequestVM : ViewModel(), KoinComponent {
  val resetPasswordRequestModel: MutableLiveData<ResetPasswordRequestModel> =
      MutableLiveData(ResetPasswordRequestModel())

  var navArguments: Bundle? = null
}
