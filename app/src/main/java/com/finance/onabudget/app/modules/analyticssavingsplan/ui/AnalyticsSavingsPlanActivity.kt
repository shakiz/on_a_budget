package com.finance.onabudget.app.modules.analyticssavingsplan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityAnalyticsSavingsPlanBinding
import com.finance.onabudget.app.modules.analyticsexpenseplan.ui.AnalyticsExpensePlanActivity
import com.finance.onabudget.app.modules.analyticssavingsplan.`data`.model.Listgroup109RowModel
import com.finance.onabudget.app.modules.analyticssavingsplan.`data`.viewmodel.AnalyticsSavingsPlanVM
import com.finance.onabudget.app.modules.analyticssavingsplan1.ui.AnalyticsSavingsPlan1Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AnalyticsSavingsPlanActivity :
    BaseActivity<ActivityAnalyticsSavingsPlanBinding>(R.layout.activity_analytics_savings_plan) {
  private val viewModel: AnalyticsSavingsPlanVM by viewModels<AnalyticsSavingsPlanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgroup109Adapter =
    Listgroup109Adapter(viewModel.listgroup109List.value?:mutableListOf())
    binding.recyclerListgroup109.adapter = listgroup109Adapter
    listgroup109Adapter.setOnItemClickListener(
    object : Listgroup109Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listgroup109RowModel) {
        onClickRecyclerListgroup109(view, position, item)
      }
    }
    )
    viewModel.listgroup109List.observe(this) {
      listgroup109Adapter.updateData(it)
    }
    binding.analyticsSavingsPlanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnlaptop.setOnClickListener {
      val destIntent = AnalyticsSavingsPlan1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnTargetedExpensePlan.setOnClickListener {
      val destIntent = AnalyticsExpensePlanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListgroup109(
    view: View,
    position: Int,
    item: Listgroup109RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ANALYTICS_SAVINGS_PLAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AnalyticsSavingsPlanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
