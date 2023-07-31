package com.translator.uzbek.english.dictionary.android.design.localization

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalStrings = staticCompositionLocalOf { stringResourcesEnglish() }

@Immutable
data class StringResources(
    val appName: String,
    val learn: String,
    val dictionary: String,
    val statistics: String,
    val settings: String,
    val learning: String,
    val dailyGoal: String,
    val showTranscription: String,
    val uzbek: String,
    val english: String,
    val preferences: String,
    val appLanguage: String,
    val theme: String,
    val light: String,
    val dark: String,
    val system: String,
    val reminder: String,
    val everyday: String,
    val soundEffects: String,
    val autoPronounce: String,
    val countNewWords: (Int) -> String,
    val progress: String,
    val createBackup: String,
    val restoreData: String,
    val resetProgress: String,
    val general: String,
    val otherApps: String,
    val feedback: String,
    val feedbackRegarding: (String) -> String,
    val share: String,
    val shareDescription: String,
    val rateUs: String,
    val appVersion: String,
    val telegramBot: String,
    val sendUs: String,
    val feedbackDescription: String,
    val helpUsImprove: String,
    val dailyGoalDescription: String,
    val youWillLearn: (Int) -> String,
    val save: String,
    val notSet: String,
    val repeat: String,
    val selectAll: String,
    val mondayShort: String,
    val tuesdayShort: String,
    val wednesdayShort: String,
    val thursdayShort: String,
    val fridayShort: String,
    val saturdayShort: String,
    val sundayShort: String,
    val newWords: String,
    val todayWords: (Int, Int) -> String,
    val currentStreak: String,
    val countDays: (Int) -> String,
    val week: String,
    val month: String,
    val quarter: String,
    val year: String,
    val completeLearned: String,
    val bestStreak: String,
    val startOfLearning: String,
    val countWords: (Int) -> String,
    val countLearned: (Int) -> String,
    val countNew: (Int) -> String,
    val countLearning: (Int) -> String,
    val countSkipped: (Int) -> String,
    val addDictionary: String,
    val searchForWords: String,
    val enterAtLeastOneLetter: String,
    val dictionaryTitle: String,
    val add: String,
    val newDictionary: String,
    val editDictionary: String,
    val enterDictionaryTitle: String,
    val addWord: String,
    val editWord: String,
    val word: String,
    val translation: String,
    val transcription: String,
    val enterWord: String,
    val enterTranslation: String,
    val enterTranscription: String,
    val editThisDictionary: String,
    val removeThisDictionary: String,
    val clearThisDictionary: String,
    val cancel: String,
    val ok: String,
    val confirmation: String,
    val confirmationResetProgress: String,
    val confirmationResetAllProgress: String,
    val confirmationRemoveDictionary: String,
    val confirmationRemoveWord: String,
    val confirmationClearDictionary: String,
    val remove: String,
    val edit: String,
    val copyToDictionary: String,
    val markAsAlreadyKnown: String,
    val resetProgressForThisWord: String,
    val wordActions: String,
    val dictionaryActions: String,
    val learned: String,
    val new: String,
    val learningRepeats: (Int) -> String,
    val skipped: String,
    val goodMorning: String,
    val goodAfternoon: String,
    val goodEvening: String,
    val goodNight: String,
    val goPremium: String,
    val premiumFeatures: String,
    val seePlans: String,
    val continueLearning: String,
)