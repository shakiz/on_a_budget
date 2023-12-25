package com.finance.onabudget.app.modules.analyticsexpenseplan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityAnalyticsExpensePlanBinding
import com.finance.onabudget.app.modules.analyticsexpenseplan.`data`.model.Listgroup142RowModel
import com.finance.onabudget.app.modules.analyticsexpenseplan.`data`.viewmodel.AnalyticsExpensePlanVM
import com.finance.onabudget.app.modules.analyticssavingsplan.ui.AnalyticsSavingsPlanActivity
import com.finance.onabudget.app.modules.analyticssavingsplan1.ui.AnalyticsSavingsPlan1Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AnalyticsExpensePlanActivity :
    BaseActivity<ActivityAnalyticsExpensePlanBinding>(R.layout.activity_analytics_expense_plan) {
  private val viewModel: AnalyticsExpensePlanVM by viewModels<AnalyticsExpensePlanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgroup142Adapter =
    Listgroup142Adapter(viewModel.listgroup142List.value?:mutableListOf())
    binding.recyclerListgroup142.adapter = listgroup142Adapter
    listgroup142Adapter.setOnItemClickListener(
    object : Listgroup142Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listgroup142RowModel) {
        onClickRecyclerListgroup142(view, position, item)
      }
    }
    )
    viewModel.listgroup142List.observe(this) {
      listgroup142Adapter.updateData(it)
    }
    binding.analyticsExpensePlanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowtargetedSavingsPlan.setOnClickListener {
      val destIntent = AnalyticsSavingsPlanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnlaptop.setOnClickListener {
      val destIntent = AnalyticsSavingsPlan1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListgroup142(
    view: View,
    position: Int,
    item: Listgroup142RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ANALYTICS_EXPENSE_PLAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AnalyticsExpensePlanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
