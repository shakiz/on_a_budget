package com.finance.onabudget.app.modules.analyticssavingsplan1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowListgroup466Binding
import com.finance.onabudget.app.modules.analyticssavingsplan1.`data`.model.Listgroup466RowModel
import kotlin.Int
import kotlin.collections.List

class Listgroup466Adapter(
  var list: List<Listgroup466RowModel>
) : RecyclerView.Adapter<Listgroup466Adapter.RowListgroup466VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroup466VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroup466,parent,false)
    return RowListgroup466VH(view)
  }

  override fun onBindViewHolder(holder: RowListgroup466VH, position: Int) {
    val listgroup466RowModel = Listgroup466RowModel()
    // TODO uncomment following line after integration with data source
    // val listgroup466RowModel = list[position]
    holder.binding.listgroup466RowModel = listgroup466RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroup466RowModel>) {
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
      item: Listgroup466RowModel
    ) {
    }
  }

  inner class RowListgroup466VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroup466Binding = RowListgroup466Binding.bind(itemView)
    init {
      binding.btnAddMonthlyIncome.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listgroup466RowModel())
      }
      binding.linearInfobar.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listgroup466RowModel())
      }
    }
  }
}
