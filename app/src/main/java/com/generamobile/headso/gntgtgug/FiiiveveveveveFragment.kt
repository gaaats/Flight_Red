package com.generamobile.headso.gntgtgug

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.generamobile.headso.R
import com.generamobile.headso.gngjttngnjtg.GammymymumumumActivity2
import com.generamobile.headso.gtjogtjigtjigt.VebbbbroovvvisActivity2
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FiiiveveveveveFragment : Fragment() {
    private lateinit var hyujujujuj: Context
    val jujukoujkojkouj: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyujujujuj = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiiiveveveveve, container, false)
    }

    override fun onStart() {
        super.onStart()

        val kikiikikik = "sub_id_5="
        val bgnhnhhyuj = "sub_id_6="
        val vgthyhyjuuj = "naming"
        val bghhyujujuj = "deeporg"
        val gthfregeyud = "deviceID="
        val drfhyhnhjm = "sub_id_1="
        val vbnhujujkiki = "ad_id="
        val bgnhjuki = "sub_id_4="

        val gthyyjuuj = jujukoujkojkouj.getString("country", null)
        val hyhyujujuj = jujukoujkojkouj.getString("appCamp", null)
        val hyhyhyhyjuujfd = jujukoujkojkouj.getString("deepSt", null)
        val gttggtjiogtiogt = jujukoujkojkouj.getString("countryDev", null)
        val vfbgtggt = jujukoujkojkouj.getString("apps", null)
        val tgtlgtko = jujukoujkojkouj.getString("wv", null)
        val hylphyplhy = jujukoujkojkouj.getString("mainId", null)
        val gt5tggt5gt5 = "com.generamobile.headso"
        val hyhyhyhy = Build.VERSION.RELEASE
        val xsssdefvf = MyTracker.getTrackerParams()
        xsssdefvf.customUserId = hylphyplhy
        val gthyhujujuj: String? = jujukoujkojkouj.getString("instId", null)

        val hyhykhykphykp = Intent(hyujujujuj, VebbbbroovvvisActivity2::class.java)
        val fbrfgyrfygt = Intent(hyujujujuj, GammymymumumumActivity2::class.java)




        val hyujujujkkikifrrf = AppsFlyerLib.getInstance().getAppsFlyerUID(hyujujujuj)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        gtjiogtoijgtjiotgtg(hylphyplhy.toString())

        Log.d("lolo", "${gttggtjiogtiogt}")
        Log.d("lolo", "${gthyyjuuj}")


        val yjujjikikik = "$tgtlgtko$drfhyhnhjm$hyhyujujuj&$gthfregeyud$hyujujujkkikifrrf&$vbnhujujkiki$hylphyplhy&$bgnhjuki$gt5tggt5gt5&$kikiikikik$hyhyhyhy&$bgnhnhhyuj$vgthyhyjuuj"
        val yyhhyjujujju = "$tgtlgtko$gthfregeyud$hylphyplhy&$vbnhujujkiki$gthyhujujuj&$bgnhjuki$gt5tggt5gt5&$kikiikikik$hyhyhyhy&$bgnhnhhyuj$vgthyhyjuuj"
        val gthyhjuuj5 = "$tgtlgtko$drfhyhnhjm$hyhyhyhyjuujfd&$gthfregeyud$hyujujujkkikifrrf&$vbnhujujkiki$hylphyplhy&$bgnhjuki$gt5tggt5gt5&$kikiikikik$hyhyhyhy&$bgnhnhhyuj$bghhyujujuj"
        val ghthyhyyh5hyyh5yh59 = "$tgtlgtko$drfhyhnhjm$hyhyhyhyjuujfd&$gthfregeyud$hylphyplhy&$vbnhujujkiki$gthyhujujuj&$bgnhjuki$gt5tggt5gt5&$kikiikikik$hyhyhyhy&$bgnhnhhyuj$bghhyujujuj"

        Log.d("AdvertId", hylphyplhy.toString())
        when(vfbgtggt) {
            "1" ->
                if(hyhyujujuj != "null") {
                    jujukoujkojkouj.edit().putString("link", yjujjikikik).apply()
                    startActivity(hyhykhykphykp)
                    activity?.finish()
                } else if (hyhyhyhyjuujfd!=null||gttggtjiogtiogt!!.contains(gthyyjuuj.toString())) {
                    jujukoujkojkouj.edit().putString("link", gthyhjuuj5).apply()
                    startActivity(hyhykhykphykp)
                    activity?.finish()
                } else {
                    startActivity(fbrfgyrfygt)
                    activity?.finish()
                }
            "0" ->
                if(hyhyhyhyjuujfd!=null) {
                    jujukoujkojkouj.edit().putString("link", ghthyhyyh5hyyh5yh59).apply()
                    startActivity(hyhykhykphykp)
                    activity?.finish()
                } else if (gttggtjiogtiogt!!.contains(gthyyjuuj.toString())) {
                    jujukoujkojkouj.edit().putString("link", yyhhyjujujju).apply()
                    startActivity(hyhykhykphykp)
                    activity?.finish()
                } else {
                    startActivity(fbrfgyrfygt)
                    activity?.finish()
                }
        }
    }

    private fun gtjiogtoijgtjiotgtg(h5hy95yh9h: String) {
        OneSignal.setExternalUserId(
            h5hy95yh9h,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {

                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val bhnnhujujuj = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $bhnnhujujuj"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val gthyujujuj =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $gthyujujuj"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val gthyhyjukikiik = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $gthyhyjukikiik"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {

                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

}