package com.finance.onabudget.app.modules.adddailyexpense1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityAddDailyExpense1Binding
import com.finance.onabudget.app.modules.adddailyexpense1.`data`.model.GridthumbsupTwo1RowModel
import com.finance.onabudget.app.modules.adddailyexpense1.`data`.viewmodel.AddDailyExpense1VM
import com.finance.onabudget.app.modules.adddailyexpense2.ui.AddDailyExpense2Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AddDailyExpense1Activity :
    BaseActivity<ActivityAddDailyExpense1Binding>(R.layout.activity_add_daily_expense1) {
  private val viewModel: AddDailyExpense1VM by viewModels<AddDailyExpense1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridthumbsupTwoAdapter =
    GridthumbsupTwoAdapter(viewModel.gridthumbsupTwoList.value?:mutableListOf())
    binding.recyclerGridthumbsupTwo.adapter = gridthumbsupTwoAdapter
    gridthumbsupTwoAdapter.setOnItemClickListener(
    object : GridthumbsupTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridthumbsupTwo1RowModel) {
        onClickRecyclerGridthumbsupTwo(view, position, item)
      }
    }
    )
    viewModel.gridthumbsupTwoList.observe(this) {
      gridthumbsupTwoAdapter.updateData(it)
    }
    binding.addDailyExpense1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsettings.setOnClickListener {
      val destIntent = AddDailyExpense2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridthumbsupTwo(
    view: View,
    position: Int,
    item: GridthumbsupTwo1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ADD_DAILY_EXPENSE1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddDailyExpense1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
