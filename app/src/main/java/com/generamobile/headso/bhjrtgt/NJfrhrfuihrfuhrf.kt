package com.generamobile.headso.bhjrtgt

import androidx.annotation.Keep
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.Response
import retrofit2.http.GET

interface HUHFhrfgrfgyrf {
    @GET("go.php?to=1&")
    suspend fun bhnhujujkiikkiik(): Response<NJFruhrhrfurf>
}

interface JIdrfhuhfrhuhrf {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun gthyjuikkiololol(): Response<NJNFrjhfihrf>
}

class Dgeygfrrfgygrf(private val ghyhyyhjuuj: HUHFhrfgrfgyrf) {
    suspend fun getDataDev() = ghyhyyhjuuj.bhnhujujkiikkiik()
}


class IJFJrfhrfhurf(private val hyhyujujkiki: JIdrfhuhfrhuhrf) {
    suspend fun bghyjujukiik() = hyhyujujkiki.gthyjuikkiololol()
}

@Keep
data class NJFruhrhrfurf(
    @JsonClass(generateAdapter = true)
    @Json(name = "gioator")
    val gioator: String,
    @Json(name = "linkator")
    val linkator: String,
    @Json(name = "checkator")
    val checkator: String
)

