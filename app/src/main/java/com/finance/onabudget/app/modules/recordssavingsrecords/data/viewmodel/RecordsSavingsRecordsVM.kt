package com.finance.onabudget.app.modules.recordssavingsrecords.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.recordssavingsrecords.`data`.model.ListmonthRowModel
import com.finance.onabudget.app.modules.recordssavingsrecords.`data`.model.RecordsSavingsRecordsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecordsSavingsRecordsVM : ViewModel(), KoinComponent {
  val recordsSavingsRecordsModel: MutableLiveData<RecordsSavingsRecordsModel> =
      MutableLiveData(RecordsSavingsRecordsModel())

  var navArguments: Bundle? = null

  val listmonthList: MutableLiveData<MutableList<ListmonthRowModel>> =
      MutableLiveData(mutableListOf())
}
