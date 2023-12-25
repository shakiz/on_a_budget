package com.finance.onabudget.app.modules.recordsexpenserecords.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.recordsexpenserecords.`data`.model.RecordsExpenseRecordsModel
import org.koin.core.KoinComponent

class RecordsExpenseRecordsVM : ViewModel(), KoinComponent {
  val recordsExpenseRecordsModel: MutableLiveData<RecordsExpenseRecordsModel> =
      MutableLiveData(RecordsExpenseRecordsModel())

  var navArguments: Bundle? = null
}
