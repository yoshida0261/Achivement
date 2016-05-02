package stcompany.com.achivement.di

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

class FragmentModule(internal val fragment: Fragment) {

    fun context(): Context {
        return fragment.context
    }

    fun provideFragmentManager(): FragmentManager {
        return fragment.fragmentManager
    }

}
