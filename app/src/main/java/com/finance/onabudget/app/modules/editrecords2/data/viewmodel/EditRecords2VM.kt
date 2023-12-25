package com.finance.onabudget.app.modules.editrecords2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.editrecords2.`data`.model.EditRecords2Model
import org.koin.core.KoinComponent

class EditRecords2VM : ViewModel(), KoinComponent {
  val editRecords2Model: MutableLiveData<EditRecords2Model> = MutableLiveData(EditRecords2Model())

  var navArguments: Bundle? = null
}
