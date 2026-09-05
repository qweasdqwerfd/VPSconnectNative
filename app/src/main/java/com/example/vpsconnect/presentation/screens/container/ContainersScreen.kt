package com.example.vpsconnect.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.vpsconnect.R
import com.example.vpsconnect.presentation.common.components.ContainersCard
import com.example.vpsconnect.presentation.common.components.UniversalTextField
import com.example.vpsconnect.utils.dimens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContainersScreen(modifier: Modifier = Modifier) {

    val searchQuery = remember { TextFieldState("") }

    Column(
        modifier = modifier.fillMaxSize()
    ) {

        Spacer(modifier.height(MaterialTheme.dimens.space48))


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = MaterialTheme.dimens.space16,
                ),
        ) {

            Spacer(Modifier.height(MaterialTheme.dimens.space32))

            Text(
                "Containers",
                style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(Modifier.height(MaterialTheme.dimens.space16))

            UniversalTextField(
                value = searchQuery.text.toString(),
                onValueChange = { searchQuery.edit { replace(0, length, it) } },
                label = "Search stacks or containers...",
                placeholder = "",
                leadingIcon = {
                    Icon(
                        painterResource(R.drawable.search_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
                        contentDescription = "search"
                    )
                },
            )
        }

        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp),
            color = MaterialTheme.colorScheme.surface
        )

        Spacer(Modifier.height(MaterialTheme.dimens.space8))


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = MaterialTheme.dimens.space16,
                ),
        ) {

            Spacer(modifier.height(MaterialTheme.dimens.space12))

            Text(
                "prometheus",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier.height(MaterialTheme.dimens.space20))

            ContainersCard()


        }
    }
}