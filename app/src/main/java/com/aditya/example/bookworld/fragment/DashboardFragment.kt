package com.aditya.example.bookworld.fragment

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aditya.example.bookworld.R
import com.aditya.example.bookworld.adapter.Dasboardrecycleradapter
import com.aditya.example.bookworld.modals.Book
import com.aditya.example.bookworld.util.ConnectionManger
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import java.util.*
import kotlin.Comparator
import kotlin.collections.HashMap


class DashboardFragment : Fragment() {
lateinit var  recyclerdashboard:RecyclerView
lateinit var layoutmanager:RecyclerView.LayoutManager

    lateinit var recyleradapter: Dasboardrecycleradapter
    lateinit var progresslayout: RelativeLayout
    lateinit var progressbar: ProgressBar
    val bookinfolist=arrayListOf<Book>()
       /* Book("the salesman","aditya singh","RS.200","4.0",R.mipmap.salesman),
        Book("last lesson","aditi","RS 500","4.5",R.mipmap.lastlesson),
        Book("the book","Shikhar","RS 270","5",R.mipmap.book),
        Book("music","sonu","RS 400","5",R.mipmap.music),
        Book("war","muskan","RS 410","4.8",R.mipmap.war),
        Book("poet","ayush","RS 170","5",R.mipmap.poet),
        Book("king of pirates","shikha","RS 800","4.2",R.mipmap.kingpirates))
*/
    var ratingcomparator=Comparator<Book> { book1, book2 ->
           if (book1.bookRating.compareTo(book2.bookRating, true) == 0) {
               // sort according to name
               book1.bookName.compareTo(book2.bookName, true)

           } else {
               book1.bookRating.compareTo(book2.bookRating, true)
           }
       }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_dashboard, container, false)

        recyclerdashboard=view.findViewById(R.id.recyclerdashboard)
           setHasOptionsMenu(true)
           progresslayout=view.findViewById(R.id.progresslayout)
           progressbar=view.findViewById(R.id.progressbar)
           progresslayout.visibility=View.VISIBLE

        layoutmanager=LinearLayoutManager(activity)

        val queue= Volley.newRequestQueue(activity as Context)// to create the request queue
        val url="http://13.235.250.119/v1/book/fetch_books/"

           if (ConnectionManger().checkconnectivity(activity as Context)) {
               val jsonObjectRequest=object : JsonObjectRequest(Request.Method.GET,url,null, Response.Listener {

// it will handle the response)


                   try{
                       progresslayout.visibility=View.GONE
                       val success = it.getBoolean("success")
                       if (success) {
                           val data = it.getJSONArray("data")
                           for (i in 0 until data.length()) {
                               val bookjsonobject = data.getJSONObject(i)
                               val bookobject = Book(
                                   bookjsonobject.getString("book_id"),
                                   bookjsonobject.getString("name"),
                                   bookjsonobject.getString("author"),
                                   bookjsonobject.getString("rating"),
                                   bookjsonobject.getString("price"),
                                   bookjsonobject.getString("image")
                               )
                               bookinfolist.add(bookobject)
                               recyleradapter=Dasboardrecycleradapter(activity as Context,bookinfolist)
                               recyclerdashboard.adapter=recyleradapter
                               recyclerdashboard.layoutManager=layoutmanager
                           }
                       }
                       else{
                           Toast.makeText(activity as Context,"some error!!", Toast.LENGTH_SHORT).show()
                       }


                   }
                   catch (e:JSONException)
                   {
                       Toast.makeText(activity as Context,"some error!!", Toast.LENGTH_SHORT).show()
                   }

               },
                   Response.ErrorListener{
                       //println("error is $it")
                       if(activity!=null) {
                           Toast.makeText(activity as Context, "VOLLEY error!!", Toast.LENGTH_SHORT)
                               .show()
                       }
                   }) {
                   override fun getHeaders(): MutableMap<String, String> {
                       val headers = HashMap<String, String>()
                       headers["Content-type"] = "application/json"
                       headers["token"] = "f9dabf3fafdca7"
                       return headers
                   }
               }
               queue.add(jsonObjectRequest)

           }
           else{
               val dialog= android.app.AlertDialog.Builder(activity as Context)
               dialog.setTitle("FAILED")
               dialog.setMessage("Internet Connectivity Not Found")
               dialog.setPositiveButton("Open settings"){text,Listener->
                   val settingIntent= Intent(Settings.ACTION_WIFI_SETTINGS)
                   startActivity(settingIntent)
                   activity?.finish()

               }
               dialog.setNegativeButton("Exit"){text,Listener->
                   ActivityCompat.finishAffinity(activity as Activity) // this will close the app
               }
               dialog.create()
               dialog.show()
           }

        return view

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater?.inflate(R.menu.menu_dashboard,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item?.itemId
        if(id==R.id.action_sort){
            Collections .sort(bookinfolist,ratingcomparator)  // sorting of the book in increasing order
            bookinfolist.reverse()
        }
        recyleradapter.notifyDataSetChanged()
        return super.onOptionsItemSelected(item)
    }
}
