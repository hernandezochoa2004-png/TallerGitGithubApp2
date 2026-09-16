package me.mariahernandez.TallerGitGithubApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Spacer
import me.mariahernandez.TallerGitGithubApp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Taller() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {

        Image( painter = painterResource(id=R.drawable.yo),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)

        )

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "María Fernanda",
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            color = Color.Black,

            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Estudiante",
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            color = Color.Blue,

            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(50.dp))




    }
}