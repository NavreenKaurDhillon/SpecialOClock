package com.example.specialoclock.ui.activities

import android.app.Application
import android.content.Context

class BaseActivity : Application() {

    companion object
    {
        var mContext: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        mContext = applicationContext
    }

    fun getAppBaseContext() : Context?
    {
        return mContext
    }

}