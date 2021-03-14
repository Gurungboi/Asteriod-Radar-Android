package com.udacity.asteroidradar

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.format.DateTimeFormatter

object Constants {
    const val API_QUERY_DATE_FORMAT = "YYYY-MM-dd"
    const val DEFAULT_END_DATE_DAYS = 7
    const val BASE_URL = "https://api.nasa.gov/"
    const val apiKey = "kBrdZh0zO7ymbeNWPGMiaNwvfdBeWqTRmJpLk7NI"
}

object LocalDateExt {
    @RequiresApi(Build.VERSION_CODES.O)
    fun dateNowFormatted(): String = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE)
}