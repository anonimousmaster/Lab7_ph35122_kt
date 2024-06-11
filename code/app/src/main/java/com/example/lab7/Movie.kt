package com.example.lab7

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration : Int,
    val releaseDate : String,
    val genre : String,
    val shotDescription : String
) {
    companion object {
        fun getSampleMovies(): MutableList<Movie> {
            val listMovie = mutableListOf<Movie>()
            listMovie.add(Movie("Doraemon","2024",
                "https://i.pinimg.com/474x/7a/7b/b9/7a7bb99065a5caca6056eba25842548c.jpg",
                156, "22/5/2024","Anime","Phim tre con,Phim tre con,Phim tre con,Phim tre con,Phim tre con,Phim tre con"))
            listMovie.add(Movie("Lật mặt 7","2023",
                "https://i.pinimg.com/236x/f3/bf/61/f3bf619bc56f2d14733710f256fb362d.jpg",
                156, "22/5/2024","Phim Hài","Phim tre con,Phim tre con,Phim tre con,Phim tre con,Phim tre con"))
            listMovie.add(Movie("Mai","2024",
                "https://i.pinimg.com/474x/45/16/6f/45166ff899314684a587e1aeb0e4d755.jpg",
                156, "22/5/2024","Phim Tinh Cam","Phim tre con,Phim tre con,Phim tre con,Phim tre con"))
            listMovie.add(Movie("Kungfu panda 4","2024",
                "https://i.pinimg.com/474x/74/cb/17/74cb178b9bccea23effd961f64471371.jpg",
                156, "22/5/2024","Anime","Phim tre co,Phim tre con,Phim tre con,Phim tre conn"))
            listMovie.add(Movie("Doraemon","2024",
                "https://i.pinimg.com/474x/7a/7b/b9/7a7bb99065a5caca6056eba25842548c.jpg",
                156, "22/5/2024","Anime","Phim tre con,Phim tre con,Phim tre con,Phim tre con"))
            listMovie.add(Movie("Mai","2024",
                "https://i.pinimg.com/474x/45/16/6f/45166ff899314684a587e1aeb0e4d755.jpg",
                156, "22/5/2024","Phim Tinh Cam","Phim tre con,Phim tre con,Phim tre con,Phim tre con"))
            listMovie.add(Movie("Kungfu panda 4","2024",
                "https://i.pinimg.com/474x/74/cb/17/74cb178b9bccea23effd961f64471371.jpg",
                156, "22/5/2024","Anime","Phim tre co,Phim tre con,Phim tre con,Phim tre conn"))

            return listMovie
        }
    }
}