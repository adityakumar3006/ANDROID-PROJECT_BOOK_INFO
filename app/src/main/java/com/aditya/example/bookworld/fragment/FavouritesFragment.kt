package com.aditya.example.bookworld.fragment

import android.content.Context
import android.os.AsyncTask
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.RelativeLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.aditya.example.bookworld.R
import com.aditya.example.bookworld.adapter.Favouriterecycleradapter
import com.aditya.example.bookworld.database.BookDatabase
import com.aditya.example.bookworld.database.BookEntity

class FavouritesFragment : Fragment() {
    lateinit var recyclerFavourites:RecyclerView
    lateinit var progressLayout:RelativeLayout
    lateinit var progressBar:ProgressBar
    lateinit var layoutManager:RecyclerView.LayoutManager
    lateinit var recyclerAdapter:Favouriterecycleradapter
    var dbbooklist=listOf<BookEntity>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_favourites, container, false)

        recyclerFavourites=view.findViewById(R.id.recyclerfavourites)
        progressLayout=view.findViewById(R.id.progresslayout)
        progressBar=view.findViewById(R.id.progressbar)

        layoutManager=GridLayoutManager(activity as Context,2)
        dbbooklist=RetrieveFavourites(activity as Context).execute().get()

        if(activity!=null)
        {
            progressLayout.visibility=View.GONE
            recyclerAdapter=Favouriterecycleradapter(activity as Context,dbbooklist)
            recyclerFavourites.adapter=recyclerAdapter
            recyclerFavourites.layoutManager=layoutManager
        }
        return view
    }

class RetrieveFavourites(val context: Context): AsyncTask<Void, Void, List<BookEntity>>()
{
    override fun doInBackground(vararg params: Void?): List<BookEntity> {
        val db=Room.databaseBuilder(context,BookDatabase::class.java,"books-db").build()
        return db.bookDao().getallbooks()
    }

}
}