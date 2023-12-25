package com.finance.onabudget.app.modules.analyticssavingsplan.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListgroup109Binding
import com.finance.onabudget.app.modules.analyticssavingsplan.`data`.model.Listgroup109RowModel
import kotlin.Int
import kotlin.collections.List

class Listgroup109Adapter(
  var list: List<Listgroup109RowModel>
) : RecyclerView.Adapter<Listgroup109Adapter.RowListgroup109VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroup109VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroup109,parent,false)
    return RowListgroup109VH(view)
  }

  override fun onBindViewHolder(holder: RowListgroup109VH, position: Int) {
    val listgroup109RowModel = Listgroup109RowModel()
    // TODO uncomment following line after integration with data source
    // val listgroup109RowModel = list[position]
    holder.binding.listgroup109RowModel = listgroup109RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroup109RowModel>) {
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
      item: Listgroup109RowModel
    ) {
    }
  }

  inner class RowListgroup109VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroup109Binding = RowListgroup109Binding.bind(itemView)
  }
}
