package com.generamobile.headso.frfngtugthu

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.generamobile.headso.bhjrtgt.JIdrfhuhfrhuhrf
import com.generamobile.headso.bhjrtgt.IJFJrfhrfhurf
import com.generamobile.headso.bhjrtgt.Dgeygfrrfgygrf
import com.generamobile.headso.bhjrtgt.HUHFhrfgrfgyrf
import com.generamobile.headso.frjgthtg.JIfjrhfrhurfhuhrf
import com.squareup.moshi.Moshi
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val hyujjuikikik = module {
    single<HUHFhrfgrfgyrf>(named("HostInter")) {
        get<Retrofit>(named("RetroDev"))
            .create(HUHFhrfgrfgyrf::class.java)
    }

    single <JIdrfhuhfrhuhrf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(JIdrfhuhfrhuhrf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    single<Retrofit>(named("RetroDev")) {
        Retrofit.Builder()
            .baseUrl("http://mysterymountain.ink/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    factory(named("DevRep")) {
        Dgeygfrrfgygrf(get(named("HostInter")))
    }
    factory (named("CountryRep")) {
        IJFJrfhrfhurf(get(named("ApiInter")))
    }

    single {
        gtnhynhjyjihyijhy()
    }
    single(named("SharedPreferences")) {
        deeytdyfedtf(androidApplication())
    }

}
fun deeytdyfedtf(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun gtnhynhjyjihyijhy(): Moshi {
    return Moshi.Builder().build()
}

val gtnkgjhyjiohyjiohy = module {
    viewModel (named("MainModel")){
        JIfjrhfrhurfhuhrf(get(named("CountryRep")), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
}