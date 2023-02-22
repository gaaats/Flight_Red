package com.generamobile.headso.frjgthtg

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.generamobile.headso.bhjrtgt.NJNFrjhfihrf
import com.generamobile.headso.bhjrtgt.IJFJrfhrfhurf
import com.generamobile.headso.bhjrtgt.Dgeygfrrfgygrf
import com.generamobile.headso.bhjrtgt.NJFruhrhrfurf
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class JIfjrhfrhurfhuhrf(
    private val bghjurrffrrf: IJFJrfhrfhurf,
    private val nhujujkikilolo: Dgeygfrrfgygrf,
    private val vfrffrgthyhyyuj: SharedPreferences,
    val bgyujuuj: Application
) : ViewModel() {

    private val bhjujiki = MutableLiveData<NJNFrjhfihrf>()
    val bghyjujuujj: LiveData<NJNFrjhfihrf>
        get() = bhjujiki

    private val byjujikkiolol = MutableLiveData<NJFruhrhrfurf>()
    val bghyjujuujuj: LiveData<NJFruhrhrfurf>
        get() = byjujikkiolol


    init {
        viewModelScope.launch(Dispatchers.IO) {
            gfrgthyhyujujuj()
        }
        viewModelScope.launch(Dispatchers.Main) {
            vfgfedededs()
        }
    }


    private val hhyhyjuju = MutableLiveData<String>()
    val vfvbgbhyhjuuj: LiveData<String>
        get() = hhyhyjuju



    suspend fun fdeddsfrefrrf() {
        try {
            byjujikkiolol.postValue(nhujujkikilolo.getDataDev().body())
        } catch (e: java.lang.Exception) {
            Log.d("ESCESC", e.toString())
        }
    }

    fun rgfgthyjujuujuj(gthyhjuj: Context) {
        AppsFlyerLib.getInstance()
            .init("PqfU2BPq3KDftbfPQJo8xh", hjujujuikik, bgyujuuj)
        AppsFlyerLib.getInstance().start(gthyhjuj)
    }

    fun gthyyujujujuj(hyhjuuj: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            hyhjuuj
        ) { data: AppLinkData? ->
            data?.let {
                val deepData = data.targetUri?.host.toString()
                vfrffrgthyhyyuj.edit().putString("deepSt", deepData).apply()
            }
        }
    }

    private val hjujujuikik = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val hyhyjuujuj = data?.get("campaign").toString()
            Log.d("lolo", "naming ${hyhyjuujuj}")
            hhyhyjuju.postValue(hyhyjuujuj)
        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun gfrgthyhyujujuj() {
        val gthyyhyhhy = AdvertisingIdClient(bgyujuuj)
        gthyyhyhhy.start()
        val hyhujujujkiik = gthyyhyhhy.info.id.toString()
        bgnyjujjik.postValue(hyhujujujkiik)
    }

    private val cfvgyhyujuik = MutableLiveData<String>()
    val vfbghyhyjjujuuj: LiveData<String>
        get() = cfvgyhyujuik


    private val bgnyjujjik = MutableLiveData<String?>()
    val mainId: LiveData<String?>
        get() = bgnyjujjik



    suspend fun vfgfedededs() {
        bhjujiki.postValue(bghjurrffrrf.bghyjujukiik().body())
        fdeddsfrefrrf()
    }

}