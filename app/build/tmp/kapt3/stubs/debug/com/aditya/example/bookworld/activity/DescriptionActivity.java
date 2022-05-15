package com.aditya.example.bookworld.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u001a\u00100\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001a\u00103\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R\u001a\u00106\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,\u00a8\u0006>"}, d2 = {"Lcom/aditya/example/bookworld/activity/DescriptionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "bookId", "", "getBookId", "()Ljava/lang/String;", "setBookId", "(Ljava/lang/String;)V", "btnaddtofav", "Landroid/widget/Button;", "getBtnaddtofav", "()Landroid/widget/Button;", "setBtnaddtofav", "(Landroid/widget/Button;)V", "imgbookimage", "Landroid/widget/ImageView;", "getImgbookimage", "()Landroid/widget/ImageView;", "setImgbookimage", "(Landroid/widget/ImageView;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "progressLayout", "Landroid/widget/RelativeLayout;", "getProgressLayout", "()Landroid/widget/RelativeLayout;", "setProgressLayout", "(Landroid/widget/RelativeLayout;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "txtbookauthor", "Landroid/widget/TextView;", "getTxtbookauthor", "()Landroid/widget/TextView;", "setTxtbookauthor", "(Landroid/widget/TextView;)V", "txtbookdesc", "getTxtbookdesc", "setTxtbookdesc", "txtbookname", "getTxtbookname", "setTxtbookname", "txtbookprice", "getTxtbookprice", "setTxtbookprice", "txtbookrating", "getTxtbookrating", "setTxtbookrating", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "DBAsynctask", "app_debug"})
public final class DescriptionActivity extends androidx.appcompat.app.AppCompatActivity {
    public android.widget.TextView txtbookname;
    public android.widget.TextView txtbookprice;
    public android.widget.TextView txtbookauthor;
    public android.widget.TextView txtbookrating;
    public android.widget.ImageView imgbookimage;
    public android.widget.TextView txtbookdesc;
    public android.widget.Button btnaddtofav;
    public android.widget.ProgressBar progressBar;
    public android.widget.RelativeLayout progressLayout;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String bookId = "100";
    public androidx.appcompat.widget.Toolbar toolbar;
    private java.util.HashMap _$_findViewCache;
    
    public DescriptionActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtbookname() {
        return null;
    }
    
    public final void setTxtbookname(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtbookprice() {
        return null;
    }
    
    public final void setTxtbookprice(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtbookauthor() {
        return null;
    }
    
    public final void setTxtbookauthor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtbookrating() {
        return null;
    }
    
    public final void setTxtbookrating(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImgbookimage() {
        return null;
    }
    
    public final void setImgbookimage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtbookdesc() {
        return null;
    }
    
    public final void setTxtbookdesc(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtnaddtofav() {
        return null;
    }
    
    public final void setBtnaddtofav(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getProgressLayout() {
        return null;
    }
    
    public final void setProgressLayout(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBookId() {
        return null;
    }
    
    public final void setBookId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0017\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/aditya/example/bookworld/activity/DescriptionActivity$DBAsynctask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "bookEntity", "Lcom/aditya/example/bookworld/database/BookEntity;", "mode", "", "(Landroid/content/Context;Lcom/aditya/example/bookworld/database/BookEntity;I)V", "getBookEntity", "()Lcom/aditya/example/bookworld/database/BookEntity;", "getContext", "()Landroid/content/Context;", "db", "Lcom/aditya/example/bookworld/database/BookDatabase;", "getDb", "()Lcom/aditya/example/bookworld/database/BookDatabase;", "getMode", "()I", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "app_debug"})
    public static final class DBAsynctask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final com.aditya.example.bookworld.database.BookEntity bookEntity = null;
        private final int mode = 0;
        @org.jetbrains.annotations.NotNull()
        private final com.aditya.example.bookworld.database.BookDatabase db = null;
        
        public DBAsynctask(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.aditya.example.bookworld.database.BookEntity bookEntity, int mode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.aditya.example.bookworld.database.BookEntity getBookEntity() {
            return null;
        }
        
        public final int getMode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.aditya.example.bookworld.database.BookDatabase getDb() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
    }
}