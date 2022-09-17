package com.example.grid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CourseModel (@DrawableRes val image: Int, @StringRes val course: Int, val numberOfCourses: String)