package com.registro.rcm.api

import com.registro.rcm.model.response.BaseResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface ApiInterface {

    @GET("/getNovio")
    fun getNovio(): Deferred<Response<BaseResponse>>

    @GET("/getMascota")
    fun getMascota(): Deferred<Response<BaseResponse>>

    @GET("/getVeterinario")
    fun getVeterinario(): Deferred<Response<BaseResponse>>



    @Headers("Content-Type: application/json")
    @POST("/addUser")
    fun addUser(@Body setUserActionRequest: String): Deferred<Response<BaseResponse>>

    @Headers("Content-Type: application/json")
    @POST("/addMascota")
    fun addMascota(@Body setUserActionRequest: String): Deferred<Response<BaseResponse>>

}