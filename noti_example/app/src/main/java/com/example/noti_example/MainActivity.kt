package com.example.noti_example

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.TaskStackBuilder
import androidx.core.content.ContextCompat
import com.example.noti_example.ui.theme.Noti_exampleTheme

class MainActivity : ComponentActivity() {

    val channel_id = "channel_id_1"
    val channel_name = "channel_name_1"
    val notification_id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        enableEdgeToEdge()

        createNotificationChannel()

        val intent = Intent(this, MainActivity::class.java)
        val pendingIntent = TaskStackBuilder.create(this).run {
            addNextIntentWithParentStack(intent)
            getPendingIntent(0, PendingIntent.FLAG_MUTABLE)
        }

        if (pendingIntent == null) {
            Log.e("MainActivity", "Failed to create PendingIntent")
            return
        }

        pendingIntent?.let {
            // Use the pendingIntent, e.g., in a notification or some other context
        } ?: run {
            Log.e("MainActivity", "PendingIntent creation failed")
        }

        val notification = NotificationCompat.Builder(this, channel_id)
            .setContentTitle("My notification")
            .setContentText("This is the content text")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .build()

        val notificationManager = NotificationManagerCompat.from(this)

        val button: Button = findViewById(R.id.notify_button)

        button.setOnClickListener{
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
            if (notificationManager.areNotificationsEnabled()) {
                notificationManager.notify(notification_id, notification)
            } else {
                Log.e("MainActivity", "Notification disabbled")
            }
        }



//        if (notificationManager.areNotificationsEnabled()) {
//            notificationManager.notify(notification_id, notification)
//        }

//        setContent {
//            Noti_exampleTheme {
////                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
////                    Greeting(
////                        name = "Android",
////                        modifier = Modifier.padding(innerPadding)
////                    )
////                }
//                Box(
//                    modifier = Modifier.fillMaxSize(),
//                    contentAlignment = Alignment.Center
//                ) {
//
//                    Button(
//                        modifier = Modifier
//                            .height(50.dp)
//                            .width(140.dp),
//                        shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp),
//                        enabled = true,
//                        elevation = ButtonDefaults.buttonElevation(
//                            defaultElevation = 20.dp
//                        ),
//                        colors = ButtonDefaults.buttonColors(
//                            containerColor = Color.Black,
//                            contentColor = Color.White,
//                            disabledContentColor = Color.Gray
//                        ),
//                        onClick = {
//                            if (notificationManager.areNotificationsEnabled()) {
//                                notificationManager.notify(notification_id, notification)
//                            }
////                            notificationManager.notify(notification_id, notification)
//                        }
//                    ) {
//                      Text(text = "Click me")
//                    }
//                }
//
//            }
//        }
    }

    private fun createNotificationChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channel_id,
                channel_name,
                NotificationManager.IMPORTANCE_DEFAULT,
            ).apply {
                enableLights(true)
            }

            channel.description = "Used for the increment counter notifications"

            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Noti_exampleTheme {
        Greeting("Android")
    }
}


//
//class MainActivity : ComponentActivity() {
//
//    private val channelId = "simple_notification_channel"
//    private val notificationId = 1
//    private val requestCode = 1001
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Create notification channel
//        createNotificationChannel()
//
//        val button: Button = findViewById(R.id.notify_button)
//        button.setOnClickListener {
//            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.POST_NOTIFICATIONS), requestCode)
//            } else {
//                showNotification()
//            }
//        }
//    }
//
//    private fun showNotification() {
//        val notification = NotificationCompat.Builder(this, channelId)
//            .setSmallIcon(R.drawable.ic_launcher_foreground)  // Use your own drawable resource
//            .setContentTitle("Hello Notification")
//            .setContentText("This is a simple notification example.")
//            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//            .build()
//
//        with(NotificationManagerCompat.from(this)) {
//            notify(notificationId, notification)
//        }
//    }
//
//    private fun createNotificationChannel() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            val name = "Simple Notification Channel"
//            val descriptionText = "This channel is used for simple notifications."
//            val importance = NotificationManager.IMPORTANCE_DEFAULT
//            val channel = NotificationChannel(channelId, name, importance).apply {
//                description = descriptionText
//            }
//
//            val notificationManager: NotificationManager =
//                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//            notificationManager.createNotificationChannel(channel)
//        }
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if (requestCode == this.requestCode) {
//            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
//                showNotification()
//            } else {
//                Toast.makeText(this, "Notification permission is required.", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//}