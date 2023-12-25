package com.finance.onabudget.app.modules.editdailyexpense.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListgroupfiftyfiveBinding
import com.finance.onabudget.app.modules.editdailyexpense.`data`.model.ListgroupfiftyfiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupfiftyfiveAdapter(
  var list: List<ListgroupfiftyfiveRowModel>
) : RecyclerView.Adapter<ListgroupfiftyfiveAdapter.RowListgroupfiftyfiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupfiftyfiveVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroupfiftyfive,parent,false)
    return RowListgroupfiftyfiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupfiftyfiveVH, position: Int) {
    val listgroupfiftyfiveRowModel = ListgroupfiftyfiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupfiftyfiveRowModel = list[position]
    holder.binding.listgroupfiftyfiveRowModel = listgroupfiftyfiveRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListgroupfiftyfiveRowModel>) {
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
      item: ListgroupfiftyfiveRowModel
    ) {
    }
  }

  inner class RowListgroupfiftyfiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupfiftyfiveBinding = RowListgroupfiftyfiveBinding.bind(itemView)
  }
}
