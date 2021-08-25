package com.iamageo.movie.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.iamageo.movie.databinding.AdapterMovieBinding
import com.iamageo.movie.model.Movie


class MovieAdapter : RecyclerView.Adapter<MainViewHolder>() {

    var movieList = mutableListOf<Movie>()

    fun setMovies(movies: List<Movie>) {
        this.movieList = movies.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val binding = AdapterMovieBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val movie = movieList[position]
        holder.binding.name.text = movie.name + ", " + movie.nickname
        //holder.binding.nickname.text = movie.nickname
        //holder.binding.birthday.text = movie.birthday
        Glide.with(holder.itemView.context).load(movie.img).into(holder.binding.imageview)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

}

class MainViewHolder(val binding: AdapterMovieBinding) : RecyclerView.ViewHolder(binding.root) {

}