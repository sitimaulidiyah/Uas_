package com.siti.pcskity.remote

import android.telecom.Call
import com.siti.pcskity.data.User
import com.siti.pcskity.data.UserList
import retrofit2.http.GET
import retrofit2.http.Query

interface UserService {

    @GET("/users")
    fun listUser() : retrofit2.Call<List<User>>

    @GET("/users/")
    fun detailUser(@Query("user_name") url: String) : retrofit2.Call<UserList>

    @GET("/search/users?q=")
    fun searchUser(@Query("q") url: String) : retrofit2.Call<UserList>
}