package com.example.learntogethe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
                    SetArticleContents(
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

@Composable
fun SetArticleContents(articleTitle:String,
                       articleText1:String,
                       articleText2:String,
                       modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column{
        Image(
            painter = image,
            contentDescription = null,
            alignment = Alignment.Center,
            contentScale = ContentScale.Fit
        )
        SetArticleTexts(articleTitle,
                        articleText1,
                        articleText2
        )
    }
}

@Composable
private fun SetArticleTexts(
    articleTitle: String,
    articleText1: String,
    articleText2: String
) {
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

@Preview
    (showBackground = true,
    showSystemUi = true)

@Composable
fun SetArticlePreview() {
    LearnTogetheTheme {
        SetArticleContents(
            articleTitle = stringResource(R.string.article_title),
            articleText1 = stringResource(R.string.article_body1),
            articleText2 = stringResource(R.string.article_body2),
        )
    }
}