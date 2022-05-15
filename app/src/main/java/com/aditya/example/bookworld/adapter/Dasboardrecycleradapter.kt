package com.aditya.example.bookworld.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.aditya.example.bookworld.R
import com.aditya.example.bookworld.activity.DescriptionActivity
import com.aditya.example.bookworld.modals.Book
import com.squareup.picasso.Picasso

class Dasboardrecycleradapter(val context: Context, val itemlist: ArrayList<Book>):RecyclerView.Adapter<Dasboardrecycleradapter.DashboardViewHolder>(){
    class DashboardViewHolder(view: View): RecyclerView.ViewHolder(view) {
       val txtbookname: TextView = view.findViewById(R.id.txtBookName)
        val txtbookauthor: TextView = view.findViewById(R.id.txtBookAuthor)
        val txtbookprice: TextView = view.findViewById(R.id.txtBookPrice)
        val txtbookrating: TextView = view.findViewById(R.id.txtBookRating)
        val imgbook: ImageView = view.findViewById(R.id.imgBookImage)
        val llcontent: LinearLayout =view.findViewById(R.id.llcontent)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        val view=
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_single_row,parent,false)
        return DashboardViewHolder(view)
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val book = itemlist[position]
        holder.txtbookname.text = book.bookName
        holder.txtbookauthor.text = book.bookAuthor
        holder.txtbookprice.text = book.bookPrice
        holder.txtbookrating.text = book.bookRating
        Picasso.get().load(book.bookImage).error(R.mipmap.defaultbook).into(holder.imgbook)
        holder.llcontent.setOnClickListener {
            val intent= Intent(context, DescriptionActivity::class.java)
            intent.putExtra("book_id",book.bookId)
            context.startActivity(intent)


        }
    }

    override fun getItemCount(): Int {
    return itemlist.size
    }
}