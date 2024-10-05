package com.example.serviceexample

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serviceexample.ui.theme.ServiceExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ServiceExampleTheme {
                // Jetpack Compose UI
                ServiceScreen(
                    onStartService = {
                        val intent = Intent(this, MyService::class.java)
                        startService(intent) // Start the service
                    },
                    onStopService = {
                        val intent = Intent(this, MyService::class.java)
                        stopService(intent) // Stop the service
                    }
                )
            }
        }
    }
}

@Composable
fun ServiceScreen(onStartService: () -> Unit, onStopService: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = onStartService, modifier = Modifier.padding(bottom = 8.dp)) {
            Text(text = "Start Service")
        }
        Button(onClick = onStopService) {
            Text(text = "Stop Service")
        }
    }
}


//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ServiceExampleTheme {
//        Greeting("Android")
//    }
//}