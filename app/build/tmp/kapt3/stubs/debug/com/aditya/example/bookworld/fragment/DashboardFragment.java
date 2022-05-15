package com.aditya.example.bookworld.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J&\u00102\u001a\u0004\u0018\u0001032\u0006\u00100\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006="}, d2 = {"Lcom/aditya/example/bookworld/fragment/DashboardFragment;", "Landroidx/fragment/app/Fragment;", "()V", "bookinfolist", "Ljava/util/ArrayList;", "Lcom/aditya/example/bookworld/modals/Book;", "getBookinfolist", "()Ljava/util/ArrayList;", "layoutmanager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getLayoutmanager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "setLayoutmanager", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V", "progressbar", "Landroid/widget/ProgressBar;", "getProgressbar", "()Landroid/widget/ProgressBar;", "setProgressbar", "(Landroid/widget/ProgressBar;)V", "progresslayout", "Landroid/widget/RelativeLayout;", "getProgresslayout", "()Landroid/widget/RelativeLayout;", "setProgresslayout", "(Landroid/widget/RelativeLayout;)V", "ratingcomparator", "Ljava/util/Comparator;", "getRatingcomparator", "()Ljava/util/Comparator;", "setRatingcomparator", "(Ljava/util/Comparator;)V", "recyclerdashboard", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerdashboard", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerdashboard", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyleradapter", "Lcom/aditya/example/bookworld/adapter/Dasboardrecycleradapter;", "getRecyleradapter", "()Lcom/aditya/example/bookworld/adapter/Dasboardrecycleradapter;", "setRecyleradapter", "(Lcom/aditya/example/bookworld/adapter/Dasboardrecycleradapter;)V", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class DashboardFragment extends androidx.fragment.app.Fragment {
    public androidx.recyclerview.widget.RecyclerView recyclerdashboard;
    public androidx.recyclerview.widget.RecyclerView.LayoutManager layoutmanager;
    public com.aditya.example.bookworld.adapter.Dasboardrecycleradapter recyleradapter;
    public android.widget.RelativeLayout progresslayout;
    public android.widget.ProgressBar progressbar;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.aditya.example.bookworld.modals.Book> bookinfolist = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Comparator<com.aditya.example.bookworld.modals.Book> ratingcomparator;
    private java.util.HashMap _$_findViewCache;
    
    public DashboardFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerdashboard() {
        return null;
    }
    
    public final void setRecyclerdashboard(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutmanager() {
        return null;
    }
    
    public final void setLayoutmanager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.aditya.example.bookworld.adapter.Dasboardrecycleradapter getRecyleradapter() {
        return null;
    }
    
    public final void setRecyleradapter(@org.jetbrains.annotations.NotNull()
    com.aditya.example.bookworld.adapter.Dasboardrecycleradapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getProgresslayout() {
        return null;
    }
    
    public final void setProgresslayout(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressbar() {
        return null;
    }
    
    public final void setProgressbar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.aditya.example.bookworld.modals.Book> getBookinfolist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Comparator<com.aditya.example.bookworld.modals.Book> getRatingcomparator() {
        return null;
    }
    
    public final void setRatingcomparator(@org.jetbrains.annotations.NotNull()
    java.util.Comparator<com.aditya.example.bookworld.modals.Book> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}