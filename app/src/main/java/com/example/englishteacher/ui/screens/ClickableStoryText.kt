package com.example.englishteacher.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.data.WordDictionary

@Composable
fun ClickableStoryText(
    text: String,
    accent: Color,
    modifier: Modifier = Modifier,
    fontSize: Int = 16,
    lineHeight: Int = 30,
    showHint: Boolean = true,
    baseColor: Color = Color(0xFF424242)
) {
    var selectedWord by remember { mutableStateOf<String?>(null) }
    var selectedMeaning by remember { mutableStateOf<String?>(null) }
    var layoutResult by remember { mutableStateOf<TextLayoutResult?>(null) }

    val annotated = remember(text) {
        buildAnnotatedString {
            val pattern = Regex("([A-Za-z']+)")
            var lastIndex = 0
            pattern.findAll(text).forEach { match ->
                if (match.range.first > lastIndex) {
                    append(text.substring(lastIndex, match.range.first))
                }
                val word = match.value
                if (WordDictionary.contains(word)) {
                    pushStringAnnotation(tag = "word", annotation = word)
                    append(word)
                    pop()
                } else {
                    append(word)
                }
                lastIndex = match.range.last + 1
            }
            if (lastIndex < text.length) {
                append(text.substring(lastIndex))
            }
        }
    }

    Column(modifier = modifier) {

        // کارت معنی
        AnimatedVisibility(
            visible = selectedWord != null && selectedMeaning != null,
            enter = fadeIn() + expandVertically(),
            exit = fadeOut() + shrinkVertically()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(accent.copy(alpha = 0.15f))
                    .padding(horizontal = 10.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Filled.Translate,
                    contentDescription = null,
                    tint = accent,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(Modifier.width(6.dp))
                Text(
                    text = selectedWord ?: "",
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp,
                    color = Color(0xFF1A237E)
                )
                Text(
                    text = " = ",
                    fontSize = 13.sp,
                    color = Color.Gray
                )
                Text(
                    text = selectedMeaning ?: "",
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp,
                    color = accent
                )
                Spacer(Modifier.weight(1f))
                Icon(
                    Icons.Filled.Close,
                    contentDescription = "بستن",
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(16.dp)
                        .clickable {
                            selectedWord = null
                            selectedMeaning = null
                        }
                )
            }
        }

        // متن
        Text(
            text = annotated,
            fontSize = fontSize.sp,
            lineHeight = lineHeight.sp,
            color = baseColor,
            onTextLayout = { layoutResult = it },
            modifier = Modifier
                .fillMaxWidth()
                .pointerInput(annotated) {
                    detectTapGestures { offset ->
                        val layout = layoutResult ?: return@detectTapGestures
                        val position = layout.getOffsetForPosition(offset)
                        val annotations = annotated
                            .getStringAnnotations("word", position, position)
                        val clicked = annotations.firstOrNull()?.item
                        if (clicked != null) {
                            if (selectedWord.equals(clicked, ignoreCase = true)) {
                                selectedWord = null
                                selectedMeaning = null
                            } else {
                                val meaning = WordDictionary.lookup(clicked)
                                if (meaning != null) {
                                    selectedWord = clicked
                                    selectedMeaning = meaning
                                }
                            }
                        }
                    }
                }
        )

        if (showHint) {
            Spacer(Modifier.height(8.dp))
            Text(
                text = "👆 روی هر کلمه بزن تا معنی‌اش رو ببینی",
                fontSize = 11.sp,
                color = Color.Gray
            )
        }
    }
}