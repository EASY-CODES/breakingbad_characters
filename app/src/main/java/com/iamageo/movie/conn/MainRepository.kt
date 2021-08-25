package com.iamageo.movie.conn

import com.iamageo.movie.conn.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    suspend fun getAllMovies() = retrofitService.getAllMovies()

}
