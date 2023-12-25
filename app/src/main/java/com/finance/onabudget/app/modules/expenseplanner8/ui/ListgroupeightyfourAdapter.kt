package com.finance.onabudget.app.modules.expenseplanner8.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListgroupeightyfour5Binding
import com.finance.onabudget.app.modules.expenseplanner8.`data`.model.Listgroupeightyfour5RowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupeightyfourAdapter(
  var list: List<Listgroupeightyfour5RowModel>
) : RecyclerView.Adapter<ListgroupeightyfourAdapter.RowListgroupeightyfour5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupeightyfour5VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroupeightyfour5,parent,false)
    return RowListgroupeightyfour5VH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupeightyfour5VH, position: Int) {
    val listgroupeightyfour5RowModel = Listgroupeightyfour5RowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupeightyfour5RowModel = list[position]
    holder.binding.listgroupeightyfour5RowModel = listgroupeightyfour5RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroupeightyfour5RowModel>) {
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
      item: Listgroupeightyfour5RowModel
    ) {
    }
  }

  inner class RowListgroupeightyfour5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupeightyfour5Binding = RowListgroupeightyfour5Binding.bind(itemView)
  }
}
