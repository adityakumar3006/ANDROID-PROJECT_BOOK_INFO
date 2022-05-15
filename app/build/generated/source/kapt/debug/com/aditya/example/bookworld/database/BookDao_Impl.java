package com.aditya.example.bookworld.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BookDao_Impl implements BookDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BookEntity> __insertionAdapterOfBookEntity;

  private final EntityDeletionOrUpdateAdapter<BookEntity> __deletionAdapterOfBookEntity;

  public BookDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookEntity = new EntityInsertionAdapter<BookEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `books` (`book_id`,`book_name `,`book_author `,`book_price `,`book_rating `,`book_desc `,`book_image `) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookEntity value) {
        stmt.bindLong(1, value.getBook_id());
        if (value.getBookName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBookName());
        }
        if (value.getBookAuthor() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBookAuthor());
        }
        if (value.getBookPrice() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBookPrice());
        }
        if (value.getBookRating() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBookRating());
        }
        if (value.getBookDesc() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBookDesc());
        }
        if (value.getBookImage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBookImage());
        }
      }
    };
    this.__deletionAdapterOfBookEntity = new EntityDeletionOrUpdateAdapter<BookEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `books` WHERE `book_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookEntity value) {
        stmt.bindLong(1, value.getBook_id());
      }
    };
  }

  @Override
  public void insertBook(final BookEntity bookentity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBookEntity.insert(bookentity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletebook(final BookEntity bookentity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfBookEntity.handle(bookentity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<BookEntity> getallbooks() {
    final String _sql = "SELECT * FROM books";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfBookId = CursorUtil.getColumnIndexOrThrow(_cursor, "book_id");
      final int _cursorIndexOfBookName = CursorUtil.getColumnIndexOrThrow(_cursor, "book_name ");
      final int _cursorIndexOfBookAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "book_author ");
      final int _cursorIndexOfBookPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "book_price ");
      final int _cursorIndexOfBookRating = CursorUtil.getColumnIndexOrThrow(_cursor, "book_rating ");
      final int _cursorIndexOfBookDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "book_desc ");
      final int _cursorIndexOfBookImage = CursorUtil.getColumnIndexOrThrow(_cursor, "book_image ");
      final List<BookEntity> _result = new ArrayList<BookEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final BookEntity _item;
        final int _tmpBook_id;
        _tmpBook_id = _cursor.getInt(_cursorIndexOfBookId);
        final String _tmpBookName;
        if (_cursor.isNull(_cursorIndexOfBookName)) {
          _tmpBookName = null;
        } else {
          _tmpBookName = _cursor.getString(_cursorIndexOfBookName);
        }
        final String _tmpBookAuthor;
        if (_cursor.isNull(_cursorIndexOfBookAuthor)) {
          _tmpBookAuthor = null;
        } else {
          _tmpBookAuthor = _cursor.getString(_cursorIndexOfBookAuthor);
        }
        final String _tmpBookPrice;
        if (_cursor.isNull(_cursorIndexOfBookPrice)) {
          _tmpBookPrice = null;
        } else {
          _tmpBookPrice = _cursor.getString(_cursorIndexOfBookPrice);
        }
        final String _tmpBookRating;
        if (_cursor.isNull(_cursorIndexOfBookRating)) {
          _tmpBookRating = null;
        } else {
          _tmpBookRating = _cursor.getString(_cursorIndexOfBookRating);
        }
        final String _tmpBookDesc;
        if (_cursor.isNull(_cursorIndexOfBookDesc)) {
          _tmpBookDesc = null;
        } else {
          _tmpBookDesc = _cursor.getString(_cursorIndexOfBookDesc);
        }
        final String _tmpBookImage;
        if (_cursor.isNull(_cursorIndexOfBookImage)) {
          _tmpBookImage = null;
        } else {
          _tmpBookImage = _cursor.getString(_cursorIndexOfBookImage);
        }
        _item = new BookEntity(_tmpBook_id,_tmpBookName,_tmpBookAuthor,_tmpBookPrice,_tmpBookRating,_tmpBookDesc,_tmpBookImage);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public BookEntity getbookid(final String bookId) {
    final String _sql = "SELECT * FROM books WHERE book_id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (bookId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, bookId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfBookId = CursorUtil.getColumnIndexOrThrow(_cursor, "book_id");
      final int _cursorIndexOfBookName = CursorUtil.getColumnIndexOrThrow(_cursor, "book_name ");
      final int _cursorIndexOfBookAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "book_author ");
      final int _cursorIndexOfBookPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "book_price ");
      final int _cursorIndexOfBookRating = CursorUtil.getColumnIndexOrThrow(_cursor, "book_rating ");
      final int _cursorIndexOfBookDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "book_desc ");
      final int _cursorIndexOfBookImage = CursorUtil.getColumnIndexOrThrow(_cursor, "book_image ");
      final BookEntity _result;
      if(_cursor.moveToFirst()) {
        final int _tmpBook_id;
        _tmpBook_id = _cursor.getInt(_cursorIndexOfBookId);
        final String _tmpBookName;
        if (_cursor.isNull(_cursorIndexOfBookName)) {
          _tmpBookName = null;
        } else {
          _tmpBookName = _cursor.getString(_cursorIndexOfBookName);
        }
        final String _tmpBookAuthor;
        if (_cursor.isNull(_cursorIndexOfBookAuthor)) {
          _tmpBookAuthor = null;
        } else {
          _tmpBookAuthor = _cursor.getString(_cursorIndexOfBookAuthor);
        }
        final String _tmpBookPrice;
        if (_cursor.isNull(_cursorIndexOfBookPrice)) {
          _tmpBookPrice = null;
        } else {
          _tmpBookPrice = _cursor.getString(_cursorIndexOfBookPrice);
        }
        final String _tmpBookRating;
        if (_cursor.isNull(_cursorIndexOfBookRating)) {
          _tmpBookRating = null;
        } else {
          _tmpBookRating = _cursor.getString(_cursorIndexOfBookRating);
        }
        final String _tmpBookDesc;
        if (_cursor.isNull(_cursorIndexOfBookDesc)) {
          _tmpBookDesc = null;
        } else {
          _tmpBookDesc = _cursor.getString(_cursorIndexOfBookDesc);
        }
        final String _tmpBookImage;
        if (_cursor.isNull(_cursorIndexOfBookImage)) {
          _tmpBookImage = null;
        } else {
          _tmpBookImage = _cursor.getString(_cursorIndexOfBookImage);
        }
        _result = new BookEntity(_tmpBook_id,_tmpBookName,_tmpBookAuthor,_tmpBookPrice,_tmpBookRating,_tmpBookDesc,_tmpBookImage);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
