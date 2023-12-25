package com.finance.onabudget.app.modules.editexpenseplan.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListgroupsixBinding
import com.finance.onabudget.app.modules.editexpenseplan.`data`.model.ListgroupsixRowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupsixAdapter(
  var list: List<ListgroupsixRowModel>
) : RecyclerView.Adapter<ListgroupsixAdapter.RowListgroupsixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupsixVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroupsix,parent,false)
    return RowListgroupsixVH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupsixVH, position: Int) {
    val listgroupsixRowModel = ListgroupsixRowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupsixRowModel = list[position]
    holder.binding.listgroupsixRowModel = listgroupsixRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListgroupsixRowModel>) {
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
      item: ListgroupsixRowModel
    ) {
    }
  }

  inner class RowListgroupsixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupsixBinding = RowListgroupsixBinding.bind(itemView)
    init {
      binding.btnEdit.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListgroupsixRowModel())
      }
    }
  }
}
