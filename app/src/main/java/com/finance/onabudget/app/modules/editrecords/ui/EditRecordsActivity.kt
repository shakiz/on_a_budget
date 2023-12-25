package com.finance.onabudget.app.modules.editrecords.ui

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
import com.finance.onabudget.app.databinding.ActivityEditRecordsBinding
import com.finance.onabudget.app.modules.editrecords.`data`.model.ListgroupeightyfourRowModel
import com.finance.onabudget.app.modules.editrecords.`data`.viewmodel.EditRecordsVM
import com.finance.onabudget.app.modules.editrecords1.ui.EditRecords1Activity
import com.google.android.gms.auth.api.phone.SmsRetriever
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditRecordsActivity : BaseActivity<ActivityEditRecordsBinding>(R.layout.activity_edit_records)
    {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null


  val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
  ActivityResultCallback {
    val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
    getOtpFromMessage(message!!)
    })


    private val viewModel: EditRecordsVM by viewModels<EditRecordsVM>()

    override fun onInitialized(): Unit {
      viewModel.navArguments = intent.extras?.getBundle("bundle")
      startSmartUserConsent()
      val listgroupeightyfourAdapter =
      ListgroupeightyfourAdapter(viewModel.listgroupeightyfourList.value?:mutableListOf())
      binding.recyclerListgroupeightyfour.adapter = listgroupeightyfourAdapter
      listgroupeightyfourAdapter.setOnItemClickListener(
      object : ListgroupeightyfourAdapter.OnItemClickListener {
        override fun onItemClick(view:View, position:Int, item : ListgroupeightyfourRowModel) {
          onClickRecyclerListgroupeightyfour(view, position, item)
        }
      }
      )
      viewModel.listgroupeightyfourList.observe(this) {
        listgroupeightyfourAdapter.updateData(it)
      }
      binding.editRecordsVM = viewModel
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
        val destIntent = EditRecords1Activity.getIntent(this, null)
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
      item: ListgroupeightyfourRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "EDIT_RECORDS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, EditRecordsActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
