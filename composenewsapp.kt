package com.example.composenewsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composenewsapp.ui.theme.ComposeNewsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNewsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppImage(firstText = stringResource(R.string.first_text),
                        secondText = stringResource(R.string.second_text),
                        thirdText = stringResource(R.string.third_text)
                    )
                }
            }
        }
    }
}

@Composable
fun AppText(firstText: String, secondText: String, thirdText: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    )
    {
        Text(
            text = firstText,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .padding(start = 16.dp)
                .padding(bottom = 16.dp)
        )
        Text(
            text = secondText,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(end = 16.dp)
                .padding(start = 16.dp)
        )
        Text(
            text = thirdText,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .padding(start = 16.dp)
                .padding(bottom = 16.dp)
        )
    }
}
@Composable
fun AppImage(firstText: String, secondText: String, thirdText: String, modifier: Modifier = Modifier) {
    Column(modifier) {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null
        )
        AppText(
            firstText = firstText,
            secondText = secondText,
            thirdText = thirdText,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeNewsAppTheme {
        AppImage(
            firstText = stringResource(R.string.first_text),
            secondText = stringResource(R.string.second_text),
            thirdText = stringResource(R.string.third_text)
        )
    }
}