package stcompany.com.achivement.fragment

import android.support.v4.app.Fragment
import stcompany.com.achivement.di.FragmentComponent

/**
 * Created by takeshi on 16/05/02.
 */
open class BaseFragment : Fragment()
{
    private var fragmentComponent: FragmentComponent? = null

    fun getComponent(): FragmentComponent? {
        if (fragmentComponent != null) {
            return fragmentComponent
        }


        /*

         todo Activity 処理
         *
        val activity = activity
        /*
        if (activity !is BaseActivity) {
            throw IllegalStateException(
                    "The activity of this fragment is not an instance of BaseActivity")
        }
        */

        fragmentComponent = (activity as BaseActivity).getComponent().plus(FragmentModule(this))
        return fragmentComponent
        */
        return fragmentComponent

    }


}