package com.mmunoz.echojournal.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    surface = Surface,
    surfaceVariant = Surface_Variant,
    inverseOnSurface = Inverse_on_Surface,
    onSurface = On_Surface,
    onSurfaceVariant = On_Surface_Variant,
    outline = Outline,
    outlineVariant = Outline_Variant,
    primary = Primary,
    primaryContainer = Primary_Container,
    onPrimary = On_Primary,
    inversePrimary = Inverse_Primary,
    secondary = Secondary,
    secondaryContainer = Secondary_Container,
    background = Background,
    onErrorContainer = On_Error_Container,
    errorContainer = Error_Container,
    onError = On_Error
)

@Composable
fun EchoJournalTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}