package com.translator.uzbek.english.dictionary.android.design.localization

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalStrings = staticCompositionLocalOf { stringResourcesEnglish() }

@Immutable
data class StringResources(
    val appName: String = "Uzbek-English dictionary",
    val learn: String,
    val dictionary: String,
    val statistics: String,
    val settings: String,
    val learning: String,
    val dailyGoal: String,
    val displayNewWordsFirst: String,
    val displayWordsBeingRepeated: String,
    val showTranscription: String,
    val uzbek: String,
    val english: String,
    val random: String,
    val preferences: String,
    val appLanguage: String,
    val theme: String,
    val light: String,
    val dark: String,
    val system: String,
    val reminder: String,
    val everyDay: String,
    val soundEffects: String,
    val autoPronounce: String,
    val countNewWords: String,
    val progress: String,
    val createBackup: String,
    val restoreData: String,
    val resetProgress: String,
    val general: String,
    val otherApps: String,
    val feedback: String,
    val share: String,
    val shareDescription: String,
    val rateUs: String,
    val faq: String,
    val appVersion: String,
    val telegramBot: String,
    val sendUs: String,
    val feedbackDescription: String,
    val helpUsImprove: String,
)