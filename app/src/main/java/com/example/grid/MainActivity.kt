package com.example.grid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.grid.data.DataSource
import com.example.grid.model.CourseModel
import com.example.grid.ui.theme.GridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GridTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Courses()
                }
            }
        }
    }
}

@Composable
fun Courses() {
    Scaffold(
        content = {
            CourseList(listOfCourses = DataSource.loadCourses())
        }
    ) 
}

@Composable
fun CourseCard(course: CourseModel) {
    Card( elevation = 8.dp) {
        Row (verticalAlignment = Alignment.CenterVertically){
            Image(
                painter = painterResource(id = course.image), contentDescription = stringResource(
                    id = course.course
                ),
                Modifier.height(68.dp),
                contentScale = ContentScale.Fit
            )
            Column(modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)) {
                Text(text = stringResource(id = course.course))
                Spacer(modifier = Modifier.height(8.dp))
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = "icon"
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = course.numberOfCourses)
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CourseList(listOfCourses: List<CourseModel>) {
    LazyVerticalGrid (
        cells = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(top = 8.dp, start = 8.dp)
            ) {
        items(listOfCourses){
            course -> CourseCard(course = course)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GridTheme {
        Courses()
    }
}