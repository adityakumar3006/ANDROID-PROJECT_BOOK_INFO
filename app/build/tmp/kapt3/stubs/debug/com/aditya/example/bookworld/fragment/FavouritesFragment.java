package com.aditya.example.bookworld.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00061"}, d2 = {"Lcom/aditya/example/bookworld/fragment/FavouritesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "dbbooklist", "", "Lcom/aditya/example/bookworld/database/BookEntity;", "getDbbooklist", "()Ljava/util/List;", "setDbbooklist", "(Ljava/util/List;)V", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "progressLayout", "Landroid/widget/RelativeLayout;", "getProgressLayout", "()Landroid/widget/RelativeLayout;", "setProgressLayout", "(Landroid/widget/RelativeLayout;)V", "recyclerAdapter", "Lcom/aditya/example/bookworld/adapter/Favouriterecycleradapter;", "getRecyclerAdapter", "()Lcom/aditya/example/bookworld/adapter/Favouriterecycleradapter;", "setRecyclerAdapter", "(Lcom/aditya/example/bookworld/adapter/Favouriterecycleradapter;)V", "recyclerFavourites", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerFavourites", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerFavourites", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "RetrieveFavourites", "app_debug"})
public final class FavouritesFragment extends androidx.fragment.app.Fragment {
    public androidx.recyclerview.widget.RecyclerView recyclerFavourites;
    public android.widget.RelativeLayout progressLayout;
    public android.widget.ProgressBar progressBar;
    public androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    public com.aditya.example.bookworld.adapter.Favouriterecycleradapter recyclerAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.aditya.example.bookworld.database.BookEntity> dbbooklist;
    private java.util.HashMap _$_findViewCache;
    
    public FavouritesFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerFavourites() {
        return null;
    }
    
    public final void setRecyclerFavourites(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getProgressLayout() {
        return null;
    }
    
    public final void setProgressLayout(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
        return null;
    }
    
    public final void setLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.aditya.example.bookworld.adapter.Favouriterecycleradapter getRecyclerAdapter() {
        return null;
    }
    
    public final void setRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.aditya.example.bookworld.adapter.Favouriterecycleradapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.aditya.example.bookworld.database.BookEntity> getDbbooklist() {
        return null;
    }
    
    public final void setDbbooklist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.aditya.example.bookworld.database.BookEntity> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/aditya/example/bookworld/fragment/FavouritesFragment$RetrieveFavourites;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/aditya/example/bookworld/database/BookEntity;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class RetrieveFavourites extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.aditya.example.bookworld.database.BookEntity>> {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        public RetrieveFavourites(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.List<com.aditya.example.bookworld.database.BookEntity> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
    }
}