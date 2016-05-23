package stcompany.com.achivement.di

import com.github.gfx.android.orma.migration.BuildConfig
import rx.subscriptions.CompositeSubscription
//import com.google.android.gms.analytics.GoogleAnalytics
//import com.google.android.gms.analytics.Tracker

import com.github.gfx.android.orma.migration.ManualStepMigration

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.net.ConnectivityManager

import java.io.File

//import javax.inject.Singleton
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/*import io.github.droidkaigi.confsched.BuildConfig
import io.github.droidkaigi.confsched.activity.ActivityNavigator
import io.github.droidkaigi.confsched.api.RequestInterceptor
import io.github.droidkaigi.confsched.model.OrmaDatabase
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
//import rx.subscriptions.CompositeSubscription
*/
@Module
class AppModule(app: Application) {

    private val context: Context

    init {
        context = app
    }

    @Provides
    fun provideContext(): Context {
        return context
    }

    /*
    @Singleton
    @Provides
    fun provideGoogleAnalyticsTracker(context: Context): Tracker {
        val ga = GoogleAnalytics.getInstance(context)
        val tracker = ga.newTracker(BuildConfig.GA_TRACKING_ID)
        tracker.enableAdvertisingIdCollection(true)
        tracker.enableExceptionReporting(true)
        return tracker
    }*/

    @Provides
    fun provideConnectivityManager(context: Context): ConnectivityManager {
        return context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    /*
    @Singleton
    @Provides
    fun provideHttpClient(context: Context, interceptor: Interceptor): OkHttpClient {
        val cacheDir = File(context.cacheDir, CACHE_FILE_NAME)
        val cache = Cache(cacheDir, MAX_CACHE_SIZE)

        val c = OkHttpClient.Builder().cache(cache).addInterceptor(interceptor)

        return c.build()
    }

    @Provides
    fun provideRequestInterceptor(connectivityManager: ConnectivityManager): Interceptor {
        return RequestInterceptor(connectivityManager)
    }
*/
    @Provides
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
    }

    @Provides
    fun provideCompositeSubscription(): CompositeSubscription {
        return CompositeSubscription()
    }

    /*
    @Singleton
    @Provides
    fun provideOrmaDatabase(context: Context): OrmaDatabase {
        return OrmaDatabase.builder(context).migrationStep(115, object : ManualStepMigration.ChangeStep() {
            override fun change(helper: ManualStepMigration.Helper) {
                helper.renameColumn("Session", "placeId", "place")
                helper.renameColumn("Session", "speakerId", "speaker")
                helper.renameColumn("Session", "categoryId", "category")
            }
        }).build()
    }*/

    /*
    @Singleton
    @Provides
    fun provideActivityNavigator(): ActivityNavigator {
        return ActivityNavigator()
    }*/

    companion object {

        internal val CACHE_FILE_NAME = "okhttp.cache"
        internal val MAX_CACHE_SIZE = 4 * 1024 * 1024.toLong()
        internal val SHARED_PREF_NAME = "preferences"
    }

}
