package com.axel.legue.whatmovieskmm.data.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UpcomingMoviesResponse(
    val dates: Dates,
    val page: Int,
    val results: List<Result>,
    @SerialName("total_pages")
    val totalPages: Int,
    @SerialName("total_results")
    val totalResults: Int
) {
    @Serializable
    data class Dates(
        val maximum: String,
        val minimum: String
    )

    @Serializable
    data class Result(
        val adult: Boolean,
        @SerialName("backdrop_path")
        val backdropPath: String?,
        @SerialName("genre_ids")
        val genreIds: List<Int>,
        val id: Int,
        @SerialName("original_language")
        val originalLanguage: String,
        @SerialName("original_title")
        val originalTitle: String,
        val overview: String,
        val popularity: Double,
        @SerialName("poster_path")
        val posterPath: String,
        @SerialName("release_date")
        val releaseDate: String,
        val title: String,
        val video: Boolean,
        @SerialName("vote_average")
        val voteAverage: Double,
        @SerialName("vote_count")
        val voteCount: Int
    )
}
