// MedicationRepository.kt
package com.example.reminder_data_flair

import androidx.lifecycle.LiveData

class MedicationRepository(private val medicationDao: MedicationDao) {
    val allMedications: LiveData<List<Medication>> = medicationDao.getAllMedications()

    suspend fun insert(medication: Medication) {
        medicationDao.insertMedication(medication)
    }
}
