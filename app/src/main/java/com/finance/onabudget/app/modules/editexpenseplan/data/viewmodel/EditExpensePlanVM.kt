package com.finance.onabudget.app.modules.editexpenseplan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.editexpenseplan.`data`.model.EditExpensePlanModel
import com.finance.onabudget.app.modules.editexpenseplan.`data`.model.ListgroupsixRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditExpensePlanVM : ViewModel(), KoinComponent {
  val editExpensePlanModel: MutableLiveData<EditExpensePlanModel> =
      MutableLiveData(EditExpensePlanModel())

  var navArguments: Bundle? = null

  val listgroupsixList: MutableLiveData<MutableList<ListgroupsixRowModel>> =
      MutableLiveData(mutableListOf())
}
