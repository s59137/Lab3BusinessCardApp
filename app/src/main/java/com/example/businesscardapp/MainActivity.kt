package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
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
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme() {
                // A surface container using the 'background' color from the theme
                Surface {
                    TaskCompletedScreen()
                }
            }
        }
    }
}

@Composable
fun TaskCompletedScreen() {
    Column(
        modifier = Modifier
            .background(Color(31,85,99))
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(painter = image, contentDescription = null)
        Text(
            text = ("Gabriel Loke Zhu Feng"),
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 32.sp,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)

        )
        Text(
            text = ("Android Developer Extraordinaire"),
            fontWeight = FontWeight.Bold,
            color = Color(11,218,81),
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = ("+60 11-1075 1303"),
            color = Color.White,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(top = 8.dp, bottom = 8.dp)
        )

        Text(
            text = ("@AndroidDev"),
            color = Color.White,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(top = 8.dp, bottom = 8.dp)
        )

        Text(
            text = ("s59137@ocean.umt.edu.my"),
            color = Color.White,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(top = 8.dp, bottom = 60.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskCompletedPreview() {
    BusinessCardAppTheme() {
        Surface {
            TaskCompletedScreen()
        }
    }
}