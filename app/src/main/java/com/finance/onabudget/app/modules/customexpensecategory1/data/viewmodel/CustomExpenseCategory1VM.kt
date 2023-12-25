package com.finance.onabudget.app.modules.customexpensecategory1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.customexpensecategory1.`data`.model.CustomExpenseCategory1Model
import org.koin.core.KoinComponent

class CustomExpenseCategory1VM : ViewModel(), KoinComponent {
  val customExpenseCategory1Model: MutableLiveData<CustomExpenseCategory1Model> =
      MutableLiveData(CustomExpenseCategory1Model())

  var navArguments: Bundle? = null
}
