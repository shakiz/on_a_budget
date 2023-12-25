package com.finance.onabudget.app.modules.adddailyexpense.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListgroupeightyfour4Binding
import com.finance.onabudget.app.modules.adddailyexpense.`data`.model.Listgroupeightyfour4RowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupeightyfourAdapter(
  var list: List<Listgroupeightyfour4RowModel>
) : RecyclerView.Adapter<ListgroupeightyfourAdapter.RowListgroupeightyfour4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupeightyfour4VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroupeightyfour4,parent,false)
    return RowListgroupeightyfour4VH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupeightyfour4VH, position: Int) {
    val listgroupeightyfour4RowModel = Listgroupeightyfour4RowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupeightyfour4RowModel = list[position]
    holder.binding.listgroupeightyfour4RowModel = listgroupeightyfour4RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroupeightyfour4RowModel>) {
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
      item: Listgroupeightyfour4RowModel
    ) {
    }
  }

  inner class RowListgroupeightyfour4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupeightyfour4Binding = RowListgroupeightyfour4Binding.bind(itemView)
  }
}
