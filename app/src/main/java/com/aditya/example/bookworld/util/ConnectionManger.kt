package com.aditya.example.bookworld.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

class ConnectionManger {
    fun checkconnectivity(context: Context):Boolean{
        val connectivitymanager=context.getSystemService(Context.CONNECTIVITY_SERVICE)as ConnectivityManager
        // we have to always create this class so that it will get the information about the currently connected network
        val activenetwork: NetworkInfo?=connectivitymanager.activeNetworkInfo
        if(activenetwork?.isConnected!=null)
        {
            return  activenetwork.isConnected
        }
        else
        {
            return false
        }
    }

}