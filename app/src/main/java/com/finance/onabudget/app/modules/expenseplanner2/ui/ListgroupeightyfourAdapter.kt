package com.finance.onabudget.app.modules.expenseplanner2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListgroupeightyfour1Binding
import com.finance.onabudget.app.modules.expenseplanner2.`data`.model.Listgroupeightyfour1RowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupeightyfourAdapter(
  var list: List<Listgroupeightyfour1RowModel>
) : RecyclerView.Adapter<ListgroupeightyfourAdapter.RowListgroupeightyfour1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupeightyfour1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroupeightyfour1,parent,false)
    return RowListgroupeightyfour1VH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupeightyfour1VH, position: Int) {
    val listgroupeightyfour1RowModel = Listgroupeightyfour1RowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupeightyfour1RowModel = list[position]
    holder.binding.listgroupeightyfour1RowModel = listgroupeightyfour1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroupeightyfour1RowModel>) {
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
      item: Listgroupeightyfour1RowModel
    ) {
    }
  }

  inner class RowListgroupeightyfour1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupeightyfour1Binding = RowListgroupeightyfour1Binding.bind(itemView)
  }
}
