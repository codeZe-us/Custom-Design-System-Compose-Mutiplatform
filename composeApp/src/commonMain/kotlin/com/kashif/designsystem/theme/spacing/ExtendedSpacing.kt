package com.kashif.designsystem.theme.spacing

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/**
 * Data class representing the custom spacing values used in the custom theme.
 * @param xxs The tiny spacing value.
 * @param xs The extra spacing value.
 * @param s The small spacing value.
 * @param m The medium spacing value.
 * @param semiLargeSpacing The semi-large spacing value for internal padding of cards.
 * @param l The large spacing value this will be used for horizontal paddings of all screens.
 * @param xl The extra large spacing value.
 * @param xxl The humungous spacing value for topbars name derived from figma.
 */
@Immutable
data class ExtendedSpacing (
    val xxs: Dp =2.dp,
    val xs: Dp = 4.dp,
    val s : Dp = 8.dp,
    val m : Dp = 12.dp,
    val semiLargeSpacing: Dp  = 14.dp,
    val l : Dp = 16.dp,
    val lHalf : Dp = 16.5.dp,
    val xl : Dp = 20.dp,
    val xxl : Dp = 24.dp,
    val iconSmall : Dp = 20.dp,
    val pillIcon : Dp = 15.dp
)

val LocalAppSpacing = compositionLocalOf {
    ExtendedSpacing()
}