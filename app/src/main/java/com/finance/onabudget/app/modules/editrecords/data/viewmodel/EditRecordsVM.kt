package com.finance.onabudget.app.modules.editrecords.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.editrecords.`data`.model.EditRecordsModel
import com.finance.onabudget.app.modules.editrecords.`data`.model.ListgroupeightyfourRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditRecordsVM : ViewModel(), KoinComponent {
  val editRecordsModel: MutableLiveData<EditRecordsModel> = MutableLiveData(EditRecordsModel())

  var navArguments: Bundle? = null

  val listgroupeightyfourList: MutableLiveData<MutableList<ListgroupeightyfourRowModel>> =
      MutableLiveData(mutableListOf())
}
