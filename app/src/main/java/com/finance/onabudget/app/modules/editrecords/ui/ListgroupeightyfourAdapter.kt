package com.finance.onabudget.app.modules.editrecords.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListgroupeightyfourBinding
import com.finance.onabudget.app.modules.editrecords.`data`.model.ListgroupeightyfourRowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupeightyfourAdapter(
  var list: List<ListgroupeightyfourRowModel>
) : RecyclerView.Adapter<ListgroupeightyfourAdapter.RowListgroupeightyfourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupeightyfourVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroupeightyfour,parent,false)
    return RowListgroupeightyfourVH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupeightyfourVH, position: Int) {
    val listgroupeightyfourRowModel = ListgroupeightyfourRowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupeightyfourRowModel = list[position]
    holder.binding.listgroupeightyfourRowModel = listgroupeightyfourRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListgroupeightyfourRowModel>) {
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
      item: ListgroupeightyfourRowModel
    ) {
    }
  }

  inner class RowListgroupeightyfourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupeightyfourBinding = RowListgroupeightyfourBinding.bind(itemView)
  }
}
