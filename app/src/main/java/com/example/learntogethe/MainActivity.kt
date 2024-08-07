package com.example.learntogethe

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.StringRes
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogethe.ui.theme.LearnTogetheTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetheTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SetArticleText(
                        articleTitle = stringResource(R.string.article_title),
                        articleText1 = stringResource(R.string.article_body1),
                        articleText2 = stringResource(R.string.article_body2),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

fun SetArticleContents(articleImage:Image,
                       articleTitle:String,
                       articleText1:String,
                       articleText2:String,
                       modifier: Modifier = Modifier) {

}

@Composable
fun SetArticleText(articleTitle:String,
                   articleText1:String,
                   articleText2:String,
                   modifier: Modifier = Modifier) {
    Column(

    )
    {
        Text(
            text = articleTitle,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = articleText1,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp
            )
        )
        Text(
            text = articleText2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview
    (showBackground = true,
    showSystemUi = true)

@Composable
fun SetArticlePreview() {
    LearnTogetheTheme {
        SetArticleText(
            articleTitle = stringResource(R.string.article_title),
            articleText1 = stringResource(R.string.article_body1),
            articleText2 = stringResource(R.string.article_body2),
        )
    }
}