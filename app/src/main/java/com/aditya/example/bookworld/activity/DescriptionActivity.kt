package com.aditya.example.bookworld.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.*
import androidx.appcompat.widget.Toolbar
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.room.Room
import com.aditya.example.bookworld.R
import com.aditya.example.bookworld.database.BookDatabase
import com.aditya.example.bookworld.database.BookEntity
import com.aditya.example.bookworld.util.ConnectionManger
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.squareup.picasso.Picasso
import org.json.JSONObject

class DescriptionActivity : AppCompatActivity() {

    lateinit var txtbookname: TextView
    lateinit var txtbookprice: TextView
    lateinit var txtbookauthor: TextView
    lateinit var txtbookrating: TextView
    lateinit var imgbookimage: ImageView
    lateinit var txtbookdesc: TextView
    lateinit var btnaddtofav: Button
    lateinit var progressBar: ProgressBar
    lateinit var progressLayout: RelativeLayout
    var bookId: String? = "100"
    lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        txtbookname = findViewById(R.id.txtBookName)
        txtbookauthor = findViewById(R.id.txtBookAuthor)
        txtbookprice = findViewById(R.id.txtBookPrice)
        txtbookrating = findViewById(R.id.txtBookRating)
        imgbookimage = findViewById(R.id.imgBookImage)
        txtbookdesc = findViewById(R.id.bookdescription)
        btnaddtofav = findViewById(R.id.btnfav)
        progressBar = findViewById(R.id.progressbar)
        progressBar.visibility = View.VISIBLE
        progressLayout = findViewById(R.id.progresslayout)
        progressLayout.visibility = View.VISIBLE
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Book details"

        if (intent != null) {
            bookId = intent.getStringExtra("book_id")

        } else {
            finish()
            Toast.makeText(this@DescriptionActivity, "error", Toast.LENGTH_SHORT).show()
        }
        if (bookId == "100") {
            finish()
            Toast.makeText(this@DescriptionActivity, "error", Toast.LENGTH_SHORT).show()
        }
        val queue = Volley.newRequestQueue(this@DescriptionActivity)
        val url = "http://13.235.250.119/v1/book/get_book/"
        val jsonParams = JSONObject()
        jsonParams.put("book_id", bookId)
        if (ConnectionManger().checkconnectivity(this@DescriptionActivity)) {
            val jsonrequest =
                object : JsonObjectRequest(Request.Method.POST, url, jsonParams, Response.Listener {


                    try {
                        val sucess=it.getBoolean("success")
                        if(sucess) {
                            val bookJsonobject = it.getJSONObject("book_data")
                            progressLayout.visibility = View.GONE

                            val bookimageurl = bookJsonobject.getString("image")
                            Picasso.get().load(bookJsonobject.getString("image"))
                                .error(R.mipmap.defaultbook).into(imgbookimage)
                            txtbookname.text = bookJsonobject.getString("name")
                            txtbookauthor.text = bookJsonobject.getString("author")
                            txtbookprice.text = bookJsonobject.getString("price")
                            txtbookrating.text = bookJsonobject.getString("rating")
                            txtbookdesc.text = bookJsonobject.getString("description")

                            val bookEntity=BookEntity(
                                bookId?.toInt() as Int,
                                txtbookname.text.toString(),
                                txtbookauthor.text.toString(),
                                txtbookprice.text.toString(),
                                txtbookrating.text.toString(),
                                txtbookdesc.text.toString(),
                                bookimageurl

                            )
                            val checkfav=DBAsynctask(applicationContext,bookEntity,1).execute()
                            val isfav=checkfav.get()
                            if(isfav)
                            {
                                btnaddtofav.text="Remove from favourites"
                                val favcolor=ContextCompat.getColor(applicationContext,R.color.colorfavourites)
                                btnaddtofav.setBackgroundColor(favcolor)
                            }
                            else
                            {
                                btnaddtofav.text="Add to favourites"
                                val nofavcolor=ContextCompat.getColor(applicationContext,R.color.purple_200)
                                btnaddtofav.setBackgroundColor(nofavcolor)

                            }
                            btnaddtofav.setOnClickListener{
                                if(!DBAsynctask(applicationContext,bookEntity,1).execute().get())
                                {
                                    val async=DBAsynctask(applicationContext,bookEntity,2).execute()
                                    val result=async.get()
                                    if(result)
                                    {
                                        Toast.makeText(this@DescriptionActivity,"Book Added To Favourites",Toast.LENGTH_SHORT).show()

                                        btnaddtofav.text="Remove from favourites"
                                        val favcolor=ContextCompat.getColor(applicationContext,R.color.colorfavourites)
                                        btnaddtofav.setBackgroundColor(favcolor)
                                    }
                                    else
                                    {
                                        Toast.makeText(this@DescriptionActivity,"ERROR!!!",Toast.LENGTH_SHORT).show()

                                    }
                                }
                                else
                                {
                                    val async=DBAsynctask(applicationContext,bookEntity,3).execute()
                                    val result=async.get()
                                    if(result)
                                    {
                                        Toast.makeText(this@DescriptionActivity,"Book Removed From Favourites",Toast.LENGTH_SHORT).show()
                                        btnaddtofav.text="Add to favourites"
                                        val nofavcolor=ContextCompat.getColor(applicationContext,R.color.purple_200)
                                        btnaddtofav.setBackgroundColor(nofavcolor)
                                    }
                                    else{
                                        Toast.makeText(this@DescriptionActivity,"ERROR!!!",Toast.LENGTH_SHORT).show()
                                    }
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(this@DescriptionActivity, "error", Toast.LENGTH_SHORT).show()
                        }
                    }catch (e:Exception) {
                        Toast.makeText(this@DescriptionActivity, "error", Toast.LENGTH_SHORT).show()
                    }
                },
                    Response.ErrorListener {
                        Toast.makeText(this@DescriptionActivity, "volley error $it", Toast.LENGTH_SHORT)
                            .show()
                    }) {
                    override fun getHeaders(): MutableMap<String, String> {
                        val headers = HashMap<String, String>()
                        headers["Content-type"] = "application/json"
                        headers["token"] = "f9dabf3fafdca7"
                        return headers

                    }

                }
            queue.add(jsonrequest)

        }else
        {
            val dialog= android.app.AlertDialog.Builder(this@DescriptionActivity)
            dialog.setTitle("FAILED")
            dialog.setMessage("Internet Connectivity Not Found")
            dialog.setPositiveButton("Open settings"){text,Listener->
                val settingIntent= Intent(Settings.ACTION_WIFI_SETTINGS)
                startActivity(settingIntent)
                finish()

            }
            dialog.setNegativeButton("Exit"){text,Listener->
                ActivityCompat.finishAffinity(this@DescriptionActivity) // this will close the app
            }
            dialog.create()
            dialog.show()
        }
        }
    class DBAsynctask(val context: Context,val bookEntity: BookEntity,val  mode:Int): AsyncTask<Void,Void,Boolean>()
    {
        val db= Room.databaseBuilder(context,BookDatabase::class.java,"books-db").build()
        override fun doInBackground(vararg params: Void?): Boolean {
            when (mode)
            {
                1->
                {
                    val book:BookEntity?=db.bookDao().getbookid(bookEntity.book_id.toString())
                    db.close()
                    return  book!=null
                }
                2-> {
                    db.bookDao().insertBook(bookEntity)
                    db.close()
                    return true
                }
                    3->
                    {
                        db.bookDao().deletebook(bookEntity)
                        db.close()
                        return true

                    }

            }
            return false
        }

    }

}