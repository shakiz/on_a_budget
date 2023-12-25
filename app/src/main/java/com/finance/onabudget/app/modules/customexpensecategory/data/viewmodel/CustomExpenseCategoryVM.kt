package com.finance.onabudget.app.modules.customexpensecategory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.customexpensecategory.`data`.model.CustomExpenseCategoryModel
import org.koin.core.KoinComponent

class CustomExpenseCategoryVM : ViewModel(), KoinComponent {
  val customExpenseCategoryModel: MutableLiveData<CustomExpenseCategoryModel> =
      MutableLiveData(CustomExpenseCategoryModel())

  var navArguments: Bundle? = null
}
