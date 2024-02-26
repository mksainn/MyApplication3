package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Portfolio()
            }
        }
    }
}

@Composable
fun Portfolio() {
    Surface(shadowElevation = 8.dp,
        shape = RoundedCornerShape(12.dp),
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding
            (12.dp)) {
            Image(painter = painterResource(id = R.drawable.profile), contentDescription = null,
                modifier = Modifier
                    .size(160.dp)
                    .padding(top = 8.dp, bottom = 8.dp))
            Spacer(modifier = Modifier.height(8.dp))
            Divider()
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Mukul kumar",
                style = TextStyle(
                    color = Color.Magenta,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                )
            )
            Text(text = "Android compose Developer",
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.padding(bottom = 10.dp))


            Row {
                Image(
                    painter = painterResource(id = R.drawable.instagram), contentDescription = null,
                    modifier = Modifier.size(18.dp))
                Text(
                    text = "/mksain",
                    style = TextStyle(
                        color  = Color.Black,
                        fontSize = 12.sp,
                    ),
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
            }
            Row(modifier = Modifier.padding(vertical = 5.dp)) {
                Image(painter = painterResource(id = R.drawable.github), contentDescription = null,
                    modifier = Modifier.size(18.dp)
                )
                Text(text = "/mksain", style = MaterialTheme.typography.labelSmall, modifier =
                Modifier.padding(horizontal = 8.dp),)
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Buttom")
            }
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
    MyApplicationTheme {
        Greeting("Android")
    }
}