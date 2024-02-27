package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   BusinessCardTop()
                }
            }
        }
    }
}

@Composable
fun BusinessCardTop(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFBAF2D8)),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android Logo",
            modifier
                .background(color = Color(red = 1, blue = 35, green = 25))
                .padding(10.dp)
                .height(120.dp)
                .width(120.dp)
        )
        Text(
            text = stringResource(R.string.name),
            fontSize = 60.sp
        )
        Text(
            text = "Android Developer",
            fontWeight = FontWeight.Bold,
            color = Color(red = 0, green = 128, blue = 0)
        )
        Spacer(modifier = Modifier.size(200.dp))
        BusinessCardBottom()
    }
}

@Composable
fun BusinessCardBottom() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Row {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = "Phone Logo",
                modifier = Modifier.padding(10.dp),
                tint = Color(red = 0, green = 128, blue = 0)
            )
            Text(
                text = stringResource(R.string.mobile_number),
                modifier = Modifier.padding(start = 15.dp, top = 10.dp),
                textAlign = TextAlign.Center
            )
        }
        Row {
            Icon(
                Icons.Rounded.Share,
                contentDescription = "Phone Logo",
                modifier = Modifier.padding(10.dp),
                tint = Color(red = 0, green = 128, blue = 0)
            )
            Text(
                text = stringResource(R.string.social_media),
                modifier = Modifier.padding(start = 15.dp, top = 10.dp)
            )
        }
        Row {
            Icon(
                Icons.Rounded.Email,
                contentDescription = "Phone Logo",
                modifier = Modifier.padding(10.dp),
                tint = Color(red = 0, green = 128, blue = 0)
            )
            Text(
                text = stringResource(R.string.email),
                modifier = Modifier.padding(start = 15.dp, top = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardTop()
    }
}
