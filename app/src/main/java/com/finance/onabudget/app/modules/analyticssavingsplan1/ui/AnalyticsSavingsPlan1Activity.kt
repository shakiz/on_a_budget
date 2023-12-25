package com.finance.onabudget.app.modules.analyticssavingsplan1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityAnalyticsSavingsPlan1Binding
import com.finance.onabudget.app.modules.addmonthlyincome.ui.AddMonthlyIncomeActivity
import com.finance.onabudget.app.modules.analyticssavingsplan1.`data`.model.Listgroup466RowModel
import com.finance.onabudget.app.modules.analyticssavingsplan1.`data`.viewmodel.AnalyticsSavingsPlan1VM
import com.finance.onabudget.app.modules.expenseplanner2.ui.ExpensePlanner2Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AnalyticsSavingsPlan1Activity :
    BaseActivity<ActivityAnalyticsSavingsPlan1Binding>(R.layout.activity_analytics_savings_plan1) {
  private val viewModel: AnalyticsSavingsPlan1VM by viewModels<AnalyticsSavingsPlan1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgroup466Adapter =
    Listgroup466Adapter(viewModel.listgroup466List.value?:mutableListOf())
    binding.recyclerListgroup466.adapter = listgroup466Adapter
    listgroup466Adapter.setOnItemClickListener(
    object : Listgroup466Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listgroup466RowModel) {
        onClickRecyclerListgroup466(view, position, item)
      }
    }
    )
    viewModel.listgroup466List.observe(this) {
      listgroup466Adapter.updateData(it)
    }
    binding.analyticsSavingsPlan1VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListgroup466(
    view: View,
    position: Int,
    item: Listgroup466RowModel
  ): Unit {
    when(view.id) {
      R.id.linearInfobar -> {
        onClickRecyclerListgroup466LinearInfobar(view, position, item)
      }
    }
  }

  fun onClickRecyclerListgroup466LinearInfobar(
    view: View,
    position: Int,
    item: Listgroup466RowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = AddMonthlyIncomeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = ExpensePlanner2Activity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "ANALYTICS_SAVINGS_PLAN1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AnalyticsSavingsPlan1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
