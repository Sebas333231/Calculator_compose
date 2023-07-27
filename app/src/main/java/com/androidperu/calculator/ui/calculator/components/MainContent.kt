package com.androidperu.calculator.ui.calculator.components

import android.widget.GridView
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.androidperu.calculator.ui.calculator.utils.sp
import com.androidperu.calculator.ui.theme.CalculatorTheme

@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    inputText: String,
    outputText: String,
    height: Dp
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(height),
        contentAlignment = Alignment.BottomEnd
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End
        ) {
            Row( modifier = Modifier
                .horizontalScroll(rememberScrollState())
            ) {
                BasicTextField(
                    value = inputText,
                    onValueChange = { },
                    enabled = false,
                    singleLine = true,
                    textStyle = TextStyle(
                        fontSize = 40.sp,
                        textAlign = TextAlign.End,
                        color = Color.White
                    )
                )
            }
            Spacer(modifier = Modifier.padding(top = 40.dp))
            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState())
            ){
                Text(
                    text = outputText,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 50.sp
                    ),
                    softWrap = false,
                    maxLines = 1
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMainContent() {
    CalculatorTheme {
        MainContent(
            inputText = "20+40",
            outputText = "60",
            height = 120.dp
        )
    }
}