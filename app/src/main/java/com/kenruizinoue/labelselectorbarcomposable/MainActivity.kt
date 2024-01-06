package com.kenruizinoue.labelselectorbarcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kenruizinoue.labelselectorbarcomposable.composable.LabelSelectorBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LabelSelectorBar(
                labelItems = listOf(
                    "All", "Pop", "Rock", "Jazz", "Hip Hop", "Classical"
                ),
                barHeight = 80.dp,
                horizontalPadding = 12.dp,
                distanceBetweenItems = 8.dp,
                backgroundColor = Color(0xFFB2F0AD),
                selectedBackgroundColor = Color(0xFF294D16),
                textColor = Color(0xFF333333),
                selectedTextColor = Color(0xFFD8D1D1),
                roundedCornerShapeSize = 24.dp,
                labelVerticalPadding = 14.dp,
                labelHorizontalPadding = 18.dp,
            )
        }
    }
}
