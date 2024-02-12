package com.example.libraryproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
//import com.easemytrip.android.SplashScreenActivity
import com.example.libraryproject.ui.theme.LibraryProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LibraryProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val mContext = LocalContext.current
                    // mContext.getString(R.string.ok)
                    val dps=mContext.resources.getDimension(com.intuit.sdp.R.dimen._500sdp)
                   // Greeting("Android "+dps)
                    val con =LocalContext.current
                    Toast.makeText(this," sample "+dps, Toast.LENGTH_SHORT).show()

                    //                  startActivity(Intent(con,SplashScreenActivity::class.java))
                    Greeting("Android library "+dps)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Text(
        text = "Hello android library $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LibraryProjectTheme {
        Greeting("Android")
    }
}