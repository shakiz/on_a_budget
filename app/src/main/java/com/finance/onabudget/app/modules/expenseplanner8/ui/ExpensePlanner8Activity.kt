package com.finance.onabudget.app.modules.expenseplanner8.ui

import android.content.Intent
import android.content.IntentFilter
import android.view.View
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.finance.onabudget.app.R
import com.finance.onabudget.app.appcomponents.base.BaseActivity
import com.finance.onabudget.app.databinding.ActivityExpensePlanner8Binding
import com.finance.onabudget.app.modules.adddailyexpense3.ui.AddDailyExpense3Activity
import com.finance.onabudget.app.modules.expenseplanner8.`data`.model.Listgroupeightyfour5RowModel
import com.finance.onabudget.app.modules.expenseplanner8.`data`.viewmodel.ExpensePlanner8VM
import com.google.android.gms.auth.api.phone.SmsRetriever
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExpensePlanner8Activity :
    BaseActivity<ActivityExpensePlanner8Binding>(R.layout.activity_expense_planner8) {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null


  val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
  ActivityResultCallback {
    val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
    getOtpFromMessage(message!!)
    })


    private val viewModel: ExpensePlanner8VM by viewModels<ExpensePlanner8VM>()

    override fun onInitialized(): Unit {
      viewModel.navArguments = intent.extras?.getBundle("bundle")
      startSmartUserConsent()
      val listgroupeightyfourAdapter =
      ListgroupeightyfourAdapter(viewModel.listgroupeightyfourList.value?:mutableListOf())
      binding.recyclerListgroupeightyfour.adapter = listgroupeightyfourAdapter
      listgroupeightyfourAdapter.setOnItemClickListener(
      object : ListgroupeightyfourAdapter.OnItemClickListener {
        override fun onItemClick(view:View, position:Int, item : Listgroupeightyfour5RowModel) {
          onClickRecyclerListgroupeightyfour(view, position, item)
        }
      }
      )
      viewModel.listgroupeightyfourList.observe(this) {
        listgroupeightyfourAdapter.updateData(it)
      }
      binding.expensePlanner8VM = viewModel
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
      binding.btnNext.setOnClickListener {
        val destIntent = AddDailyExpense3Activity.getIntent(this, null)
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
      item: Listgroupeightyfour5RowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "EXPENSE_PLANNER8ACTIVITY"

    }
  }
