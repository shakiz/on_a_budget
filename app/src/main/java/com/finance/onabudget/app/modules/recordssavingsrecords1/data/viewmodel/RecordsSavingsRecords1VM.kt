package com.finance.onabudget.app.modules.recordssavingsrecords1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.recordssavingsrecords1.`data`.model.RecordsSavingsRecords1Model
import org.koin.core.KoinComponent

class RecordsSavingsRecords1VM : ViewModel(), KoinComponent {
  val recordsSavingsRecords1Model: MutableLiveData<RecordsSavingsRecords1Model> =
      MutableLiveData(RecordsSavingsRecords1Model())

  var navArguments: Bundle? = null
}
