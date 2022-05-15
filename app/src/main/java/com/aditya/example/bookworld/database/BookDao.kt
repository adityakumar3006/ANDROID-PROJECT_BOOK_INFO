package com.aditya.example.bookworld.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookDao {
    @Insert
    fun insertBook(bookentity: BookEntity)

    @Delete
    fun deletebook(bookentity: BookEntity)

    @Query("SELECT * FROM books")
    fun getallbooks():List<BookEntity>


    @Query("SELECT * FROM books WHERE book_id=:bookId")
    fun getbookid(bookId: String): BookEntity
}