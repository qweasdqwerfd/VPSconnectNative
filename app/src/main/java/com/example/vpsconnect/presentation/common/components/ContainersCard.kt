package com.example.vpsconnect.presentation.common.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.vpsconnect.utils.dimens

@Composable
fun ContainersCard(
    modifier: Modifier = Modifier,
    containerName: String = "cadivisor",
    status: String = "Running",
    shape: Shape = RoundedCornerShape(MaterialTheme.dimens.space10),
    space8: Dp = MaterialTheme.dimens.space8,
    space4: Dp = MaterialTheme.dimens.space4,
    statusColor: Color = Color.Green,
    textContainerStyle: TextStyle = MaterialTheme.typography.labelMedium,
    textContainerColor: Color = MaterialTheme.colorScheme.onSurface

) {

    Card(
        modifier = modifier
            .width(150.dp)
            .aspectRatio(1f),
        shape = shape,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
//        elevation = CardDefaults.cardElevation(defaultElevation = MaterialTheme.dimens.space8),
//        border = BorderStroke(width = MaterialTheme.dimens.space8, brush = Brush.sweepGradient())

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = space8,
                    vertical = space4
                ),
        ) {

            Spacer(modifier = Modifier.height(space8))

            Text(
                containerName,
                style = textContainerStyle,
                color = textContainerColor
            )

            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = space4),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(10.dp)
                        .clip(CircleShape)
                        .background(statusColor),

                    )

                Spacer(modifier = Modifier.width(space4))

                Text(
                    text = status,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }

    }

}