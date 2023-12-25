package com.finance.onabudget.app.modules.editrecords1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.editrecords1.`data`.model.EditRecords1Model
import org.koin.core.KoinComponent

class EditRecords1VM : ViewModel(), KoinComponent {
  val editRecords1Model: MutableLiveData<EditRecords1Model> = MutableLiveData(EditRecords1Model())

  var navArguments: Bundle? = null
}
