package com.generamobile.headso.bfrhbfrbrfbh

import android.app.Application
import android.content.Context
import com.generamobile.headso.frfngtugthu.hyujjuikikik
import com.generamobile.headso.frfngtugthu.gtnkgjhyjiohyjiohy
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class PuperSuperClass:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        gjtiogtjjgtijgtjigt()
        gntjgtthgthgthugt()

        val hyjuujuj2uj2uj = MyTracker.getTrackerConfig()
        hyjuujuj2uj2uj.isTrackingLaunchEnabled = true
        val bnujuj262 = MyTracker.getInstanceId(this)
        val hy2jjuuj95u = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        hy2jjuuj95u.edit().putString("instId", bnujuj262).apply()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@PuperSuperClass)
            modules(
                listOf(
                    hyujjuikikik, gtnkgjhyjiohyjiohy
                )
            )
        }
    }

    private fun gntjgtthgthgthugt() {
        MyTracker.initTracker("63939564242991435240", this)
    }

    private fun gjtiogtjjgtijgtjigt() {
        OneSignal.setAppId("45320406-eed9-40ee-b4e1-012ebb96dd3e")
    }
}