package com.example.libraryproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
import com.example.libraryproject.ui.theme.LibraryProjectTheme

class SplashScree : ComponentActivity() {
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
                    //val dps=mContext.resources.getDimension(com.intuit.sdp.R.dimen._200sdp)
                    //val dps=mContext.resources.getDimension(R.dimen._200sdp)
                    /*val rat=Retrofit.Builder().baseUrl("https://quotable.io/")
                        // we need to add converter factory to
                        // convert JSON object to Java object
                        .build()*/
                    // Greeting("Android "+dps)
                   // Greeting1("Android library sussces "+rat)
                    Greeting1("Android library ")
                }
            }
        }
    }
}

@Composable
fun Greeting1(name: String, modifier: Modifier = Modifier) {

    Text(
        text = "Hello android library $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview1() {
    LibraryProjectTheme {
        Greeting("Android")
    }
}