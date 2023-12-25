package com.finance.onabudget.app.modules.expenseplanner2.ui

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityExpensePlanner2Binding
import com.finance.onabudget.app.modules.editexpenseplan.ui.EditExpensePlanActivity
import com.finance.onabudget.app.modules.expenseplanner.ui.ExpensePlannerActivity
import com.finance.onabudget.app.modules.expenseplanner2.`data`.model.Listgroupeightyfour1RowModel
import com.finance.onabudget.app.modules.expenseplanner2.`data`.viewmodel.ExpensePlanner2VM
import com.google.android.gms.auth.api.phone.SmsRetriever
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExpensePlanner2Activity :
    BaseActivity<ActivityExpensePlanner2Binding>(R.layout.activity_expense_planner2) {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null


  val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
  ActivityResultCallback {
    val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
    getOtpFromMessage(message!!)
    })


    private val viewModel: ExpensePlanner2VM by viewModels<ExpensePlanner2VM>()

    override fun onInitialized(): Unit {
      viewModel.navArguments = intent.extras?.getBundle("bundle")
      startSmartUserConsent()
      val listgroupeightyfourAdapter =
      ListgroupeightyfourAdapter(viewModel.listgroupeightyfourList.value?:mutableListOf())
      binding.recyclerListgroupeightyfour.adapter = listgroupeightyfourAdapter
      listgroupeightyfourAdapter.setOnItemClickListener(
      object : ListgroupeightyfourAdapter.OnItemClickListener {
        override fun onItemClick(view:View, position:Int, item : Listgroupeightyfour1RowModel) {
          onClickRecyclerListgroupeightyfour(view, position, item)
        }
      }
      )
      viewModel.listgroupeightyfourList.observe(this) {
        listgroupeightyfourAdapter.updateData(it)
      }
      binding.expensePlanner2VM = viewModel
    }

    override fun onStop(): Unit {
      super.onStop()
      unregisterReceiver(otpViewOtpviewBroadcastReceiver)
    }

    override fun onStart(): Unit {
      super.onStart()
      registerBroadcastReceiver()
    }

    override fun setUpClicks(): Unit {
      binding.btnSelectExpenseCategory.setOnClickListener {
        val destIntent = ExpensePlannerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnEditExpensePlanOne.setOnClickListener {
        val destIntent = EditExpensePlanActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    private fun startSmartUserConsent(): Unit {
      val client = SmsRetriever.getClient(this)
      client.startSmsUserConsent(null)
    }

    private fun registerBroadcastReceiver(): Unit {
      otpViewOtpviewBroadcastReceiver = OtpViewOtpviewBroadcastReceiver()
      otpViewOtpviewBroadcastReceiver?.otpBroadcastReceiverListener =
      object : OtpViewOtpviewBroadcastReceiver.OtpBroadcastListener {
        override fun onSuccess(intent: Intent?) {
          getActivityResult.launch(intent)
        }
        override fun onFailure() {

        }
      }
      val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
      registerReceiver(otpViewOtpviewBroadcastReceiver, intentFilter)
    }

    private fun getOtpFromMessage(message: String): Unit {
      val otpPattern: Pattern = Pattern.compile("(|^)\\d{4}")
      val matcher: Matcher = otpPattern.matcher(message)
      if (matcher.find()) {
        binding.otpViewOtpview?.setText(matcher.group(0))
      }
    }

    fun onClickRecyclerListgroupeightyfour(
      view: View,
      position: Int,
      item: Listgroupeightyfour1RowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "EXPENSE_PLANNER2ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ExpensePlanner2Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
