package com.fameouscoder.buttonshett

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiCalling {


@GET("users")
//@POST("users")

    fun getUser(): Observable<List<DataModel>>
    companion object factory{
        fun  create():ApiCalling{
            val retrofit=Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://demo2279701.mockable.io/")
                .build()
            return retrofit.create(ApiCalling::class.java)

        }

    }
}