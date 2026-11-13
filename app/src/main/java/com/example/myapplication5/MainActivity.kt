package com.example.myapplication5

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Task4Button(modifier: Modifier = Modifier) {
    Button(
        onClick = { /* Здесь будет действие при нажатии */ },
        modifier = modifier
            .fillMaxWidth() // 1. Растягиваем на всю ширину
            .padding(16.dp), // Добавляем небольшой отступ от краев экрана
        shape = RoundedCornerShape(16.dp), // 2. Скругленные углы
        border = BorderStroke(2.dp, Color.Gray), // 3. Граница
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 4.dp // 4. Тень глубиной 4.dp
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray, // 5. Светло-серый фон
            contentColor = Color.Black         // 5. Черный цвет текста
        )
    ) {
        Text(text = "Нажми на меня")
    }
}

// Превью для проверки результата
@Preview(showBackground = true, widthDp = 360)
@Composable
fun Task4ButtonPreview() {
    Task4Button()
}