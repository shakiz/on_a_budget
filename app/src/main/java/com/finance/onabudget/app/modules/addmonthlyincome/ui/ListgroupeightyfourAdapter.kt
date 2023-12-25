package com.finance.onabudget.app.modules.addmonthlyincome.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListgroupeightyfour2Binding
import com.finance.onabudget.app.modules.addmonthlyincome.`data`.model.Listgroupeightyfour2RowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupeightyfourAdapter(
  var list: List<Listgroupeightyfour2RowModel>
) : RecyclerView.Adapter<ListgroupeightyfourAdapter.RowListgroupeightyfour2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupeightyfour2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroupeightyfour2,parent,false)
    return RowListgroupeightyfour2VH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupeightyfour2VH, position: Int) {
    val listgroupeightyfour2RowModel = Listgroupeightyfour2RowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupeightyfour2RowModel = list[position]
    holder.binding.listgroupeightyfour2RowModel = listgroupeightyfour2RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroupeightyfour2RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Listgroupeightyfour2RowModel
    ) {
    }
  }

  inner class RowListgroupeightyfour2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupeightyfour2Binding = RowListgroupeightyfour2Binding.bind(itemView)
  }
}
