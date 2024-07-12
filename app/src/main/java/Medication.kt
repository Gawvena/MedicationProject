// Medication.kt
package com.example.reminder_data_flair

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "medications")
data class Medication(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val time: String,
    var taken: Boolean = false
)
