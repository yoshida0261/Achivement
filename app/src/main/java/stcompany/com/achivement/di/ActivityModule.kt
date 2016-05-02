package stcompany.com.achivement.di

import android.app.Activity
import android.content.Context

import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater


/**
 * Created by takeshi on 16/05/02.
 */
public class ActivityModule {

    internal var activity: AppCompatActivity? = null

    fun ActivityModule(activity: AppCompatActivity) {
        this.activity = activity
    }

    //@Provides
    fun activity(): Activity {
        return activity!!
    }

    //@Provides
    fun context(): Context {
        return activity!!
    }

    //@Provides
    internal fun layoutInflater(): LayoutInflater? {
        return activity?.layoutInflater
    }
}
