package com.example.grid.data

import com.example.grid.R
import com.example.grid.model.CourseModel

object DataSource {
    fun loadCourses(): List<CourseModel> {
        return listOf(
            CourseModel(R.drawable.architecture, R.string.architecture, "58"),
            CourseModel(R.drawable.business, R.string.business, "78"),
            CourseModel(R.drawable.crafts, R.string.crafts, "121"),
            CourseModel(R.drawable.design, R.string.design, "423"),
            CourseModel(R.drawable.fashion, R.string.fashion, "92"),
            CourseModel(R.drawable.film, R.string.film, "165"),
            CourseModel(R.drawable.gaming, R.string.gaming, "164"),
            CourseModel(R.drawable.drawing, R.string.drawing, "326"),
            CourseModel(R.drawable.lifestyle, R.string.lifestyle, "305"),
            CourseModel(R.drawable.music, R.string.music, "212"),
            CourseModel(R.drawable.painting, R.string.painting, "172"),
            CourseModel(R.drawable.photography, R.string.photography, "321"),
            CourseModel(R.drawable.tech, R.string.tech, "118")

        )
    }
}
