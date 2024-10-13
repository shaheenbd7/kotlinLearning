package com.example.hilt_example_1

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hilt_example_1.database.DatabaseAdapter
import com.example.hilt_example_1.database.DatabaseService
import com.example.hilt_example_1.ui.theme.Hilt_example_1Theme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject lateinit var databaseAdapter: DatabaseAdapter
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        Log.d(TAG, "onCreate: DatabaseAdapter: $databaseAdapter")
        databaseAdapter.log("Hello Hilt")

        enableEdgeToEdge()
        setContent {
            Hilt_example_1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()
                ) {
                    CenteredTextField()
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                }
            }
        }
    }

    @Inject
    fun methodInjection(databaseService: DatabaseService) {
        databaseService.log("hello method injection")
    }
}

@Composable
fun CenteredTextField() {
    Box(
        modifier = Modifier
            .fillMaxSize() // Fill the parent container size
            .wrapContentSize(Alignment.Center) // Center the content within the Box
    ) {

        Text(
            text = "Hello shaheen!",
        )
//        TextField(
//            value = "",
//            onValueChange = {},
//            label = { Text("Enter text") },
//            modifier = Modifier
//                .width(200.dp) // Optional: set a custom width
//        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
