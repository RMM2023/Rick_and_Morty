package com.example.rickmorty
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rickmorty.ui.theme.RickMortyTheme
import com.example.rickmorty.ui.theme.dark_blue
import com.example.rickmorty.ui.theme.white_dark_blue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RickMortyTheme {
                MainScreen(
                    name = TODO()
                )
            }
        }
    }
}

@Composable
fun MainScreen(name: String, modifier: Modifier = Modifier) {
    TopAppBarState()

}// полное отображение главного экрана

@Composable
fun TopAppBarState(modifier: Modifier = Modifier){
    Column(modifier = Modifier
        .height(60.dp)
        .background(
            color = dark_blue
        )) {
        SearchBar()
    }

}

@SuppressLint("ResourceType")
@Composable
fun SearchBar(modifier: Modifier = Modifier){
    Row(modifier = Modifier
        .height(24.dp)
        .fillMaxWidth()
        .background(
            color = white_dark_blue
        )) {

        Icon(
            imageVector = Icons.Filled.Add, contentDescription = stringResource(id = R.drawable.search)
        )
        Icon(
            imageVector = Icons.Filled.Add, contentDescription = stringResource(id = R.drawable.filter)
        )
    }
}

@Preview
@Composable
fun Preview(){
    MainScreen(name = "Hi")
}