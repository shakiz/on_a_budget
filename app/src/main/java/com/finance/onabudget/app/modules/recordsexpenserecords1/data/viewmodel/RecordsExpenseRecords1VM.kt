package com.finance.onabudget.app.modules.recordsexpenserecords1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.recordsexpenserecords1.`data`.model.RecordsExpenseRecords1Model
import org.koin.core.KoinComponent

class RecordsExpenseRecords1VM : ViewModel(), KoinComponent {
  val recordsExpenseRecords1Model: MutableLiveData<RecordsExpenseRecords1Model> =
      MutableLiveData(RecordsExpenseRecords1Model())

  var navArguments: Bundle? = null
}
