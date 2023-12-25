package com.finance.onabudget.app.modules.expenseplanner.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finance.onabudget.app.R
import com.finance.onabudget.app.databinding.RowGridthumbsupTwoBinding
import com.finance.onabudget.app.modules.expenseplanner.`data`.model.GridthumbsupTwoRowModel
import kotlin.Int
import kotlin.collections.List

class GridthumbsupTwoAdapter(
  var list: List<GridthumbsupTwoRowModel>
) : RecyclerView.Adapter<GridthumbsupTwoAdapter.RowGridthumbsupTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridthumbsupTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridthumbsup_two,parent,false)
    return RowGridthumbsupTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowGridthumbsupTwoVH, position: Int) {
    val gridthumbsupTwoRowModel = GridthumbsupTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val gridthumbsupTwoRowModel = list[position]
    holder.binding.gridthumbsupTwoRowModel = gridthumbsupTwoRowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridthumbsupTwoRowModel>) {
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
      item: GridthumbsupTwoRowModel
    ) {
    }
  }

  inner class RowGridthumbsupTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridthumbsupTwoBinding = RowGridthumbsupTwoBinding.bind(itemView)
    init {
      binding.linearColumnthumbsup.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, GridthumbsupTwoRowModel())
      }
    }
  }
}
