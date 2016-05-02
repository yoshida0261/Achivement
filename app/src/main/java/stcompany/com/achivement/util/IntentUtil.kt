package stcompany.com.achivement.util

import android.content.Context
import android.content.Intent

/**
 * Created by takeshi on 16/05/02.
 */
class IntentUtil{
    //private val HASH_TAG = "#xxx" 別のアプリで使おう

    private fun IntentUtil() {
        throw AssertionError()
    }

    fun share(context: Context, url: String) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, url + " " + "xxx")
        context.startActivity(Intent.createChooser(intent, context.getString(/*"R.string.share todo */0)))
    }

}