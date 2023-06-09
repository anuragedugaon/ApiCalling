package com.fameouscoder.buttonshett

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CutomeListViewAdpater(val context: Context,val  data:List<DataModel>):BaseAdapter(){
    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Any {
        return  data[position]
    }

    override fun getItemId(position: Int): Long {
        return data.size.toLong()
    }

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = LayoutInflater.from(context).inflate(R.layout.listviewdesing, parent, false)


      val name=   rowView.findViewById<TextView>(R.id.name)
      val title=   rowView.findViewById<TextView>(R.id.title)
        name.text=data[position].name
        title.text=data[position].bio
        return  rowView


    }
}