package com.finance.onabudget.app.modules.adddailyexpense1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowGridthumbsupTwo1Binding
import com.finance.onabudget.app.modules.adddailyexpense1.`data`.model.GridthumbsupTwo1RowModel
import kotlin.Int
import kotlin.collections.List

class GridthumbsupTwoAdapter(
  var list: List<GridthumbsupTwo1RowModel>
) : RecyclerView.Adapter<GridthumbsupTwoAdapter.RowGridthumbsupTwo1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridthumbsupTwo1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridthumbsup_two1,parent,false)
    return RowGridthumbsupTwo1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridthumbsupTwo1VH, position: Int) {
    val gridthumbsupTwo1RowModel = GridthumbsupTwo1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridthumbsupTwo1RowModel = list[position]
    holder.binding.gridthumbsupTwo1RowModel = gridthumbsupTwo1RowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridthumbsupTwo1RowModel>) {
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
      item: GridthumbsupTwo1RowModel
    ) {
    }
  }

  inner class RowGridthumbsupTwo1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridthumbsupTwo1Binding = RowGridthumbsupTwo1Binding.bind(itemView)
  }
}
