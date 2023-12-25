package com.finance.onabudget.app.modules.expenseplanner5.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListgroupeightyfour3Binding
import com.finance.onabudget.app.modules.expenseplanner5.`data`.model.Listgroupeightyfour3RowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupeightyfourAdapter(
  var list: List<Listgroupeightyfour3RowModel>
) : RecyclerView.Adapter<ListgroupeightyfourAdapter.RowListgroupeightyfour3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupeightyfour3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroupeightyfour3,parent,false)
    return RowListgroupeightyfour3VH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupeightyfour3VH, position: Int) {
    val listgroupeightyfour3RowModel = Listgroupeightyfour3RowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupeightyfour3RowModel = list[position]
    holder.binding.listgroupeightyfour3RowModel = listgroupeightyfour3RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroupeightyfour3RowModel>) {
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
      item: Listgroupeightyfour3RowModel
    ) {
    }
  }

  inner class RowListgroupeightyfour3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupeightyfour3Binding = RowListgroupeightyfour3Binding.bind(itemView)
  }
}
