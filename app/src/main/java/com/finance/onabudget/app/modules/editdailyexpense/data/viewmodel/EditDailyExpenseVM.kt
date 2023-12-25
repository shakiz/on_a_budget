package com.finance.onabudget.app.modules.editdailyexpense.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finance.onabudget.app.modules.editdailyexpense.`data`.model.EditDailyExpenseModel
import com.finance.onabudget.app.modules.editdailyexpense.`data`.model.ListgroupfiftyfiveRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditDailyExpenseVM : ViewModel(), KoinComponent {
  val editDailyExpenseModel: MutableLiveData<EditDailyExpenseModel> =
      MutableLiveData(EditDailyExpenseModel())

  var navArguments: Bundle? = null

  val listgroupfiftyfiveList: MutableLiveData<MutableList<ListgroupfiftyfiveRowModel>> =
      MutableLiveData(mutableListOf())
}
