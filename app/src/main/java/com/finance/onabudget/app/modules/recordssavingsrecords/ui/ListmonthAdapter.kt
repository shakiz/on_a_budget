package com.finance.onabudget.app.modules.recordssavingsrecords.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListmonthBinding
import com.finance.onabudget.app.modules.recordssavingsrecords.`data`.model.ListmonthRowModel
import kotlin.Int
import kotlin.collections.List

class ListmonthAdapter(
  var list: List<ListmonthRowModel>
) : RecyclerView.Adapter<ListmonthAdapter.RowListmonthVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmonthVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmonth,parent,false)
    return RowListmonthVH(view)
  }

  override fun onBindViewHolder(holder: RowListmonthVH, position: Int) {
    val listmonthRowModel = ListmonthRowModel()
    // TODO uncomment following line after integration with data source
    // val listmonthRowModel = list[position]
    holder.binding.listmonthRowModel = listmonthRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmonthRowModel>) {
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
      item: ListmonthRowModel
    ) {
    }
  }

  inner class RowListmonthVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmonthBinding = RowListmonthBinding.bind(itemView)
  }
}
