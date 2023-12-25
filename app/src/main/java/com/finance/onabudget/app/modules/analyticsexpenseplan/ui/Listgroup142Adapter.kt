package com.finance.onabudget.app.modules.analyticsexpenseplan.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListgroup142Binding
import com.finance.onabudget.app.modules.analyticsexpenseplan.`data`.model.Listgroup142RowModel
import kotlin.Int
import kotlin.collections.List

class Listgroup142Adapter(
  var list: List<Listgroup142RowModel>
) : RecyclerView.Adapter<Listgroup142Adapter.RowListgroup142VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroup142VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroup142,parent,false)
    return RowListgroup142VH(view)
  }

  override fun onBindViewHolder(holder: RowListgroup142VH, position: Int) {
    val listgroup142RowModel = Listgroup142RowModel()
    // TODO uncomment following line after integration with data source
    // val listgroup142RowModel = list[position]
    holder.binding.listgroup142RowModel = listgroup142RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroup142RowModel>) {
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
      item: Listgroup142RowModel
    ) {
    }
  }

  inner class RowListgroup142VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroup142Binding = RowListgroup142Binding.bind(itemView)
  }
}
