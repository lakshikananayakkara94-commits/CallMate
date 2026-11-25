package com.callmate.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                CallMateHome()
            }
        }
    }
}

@Composable
private fun CallMateHome() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text(
                    text = "CallMate",
                    fontSize = 32.sp,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = "Your call recording companion",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer
                    )
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Device compatibility", style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text("Compatibility checking will be added in a future update.")
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Call recording support depends on Android version, phone model, dialer, and local rules.",
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                }
            }
            item {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Recordings", style = MaterialTheme.typography.titleLarge)
                        Spacer(modifier = Modifier.height(6.dp))
                        Text("Your saved recordings will appear here when recording support is implemented.")
                        Spacer(modifier = Modifier.height(12.dp))
                        Button(onClick = { }) {
                            Text("Open Recordings")
                        }
                    }
                }
            }
            item {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Settings", style = MaterialTheme.typography.titleLarge)
                        Spacer(modifier = Modifier.height(6.dp))
                        Text("Recording preferences and storage options will be added here.")
                        Spacer(modifier = Modifier.height(12.dp))
                        Button(onClick = { }) {
                            Text("Open Settings")
                        }
                    }
                }
            }
            item {
                Text(
                    text = "CallMate v1.0.0",
                    modifier = Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.labelMedium
                )
            }
        }
    }
}
