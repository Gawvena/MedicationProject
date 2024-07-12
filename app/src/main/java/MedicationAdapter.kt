// MedicationAdapter.kt
package com.example.reminder_data_flair

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.TextView

class MedicationAdapter(context: Context, private var medications: MutableList<Medication>) :
    ArrayAdapter<Medication>(context, 0, medications) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val medication = getItem(position)!!
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_medication, parent, false)

        val nameTextView: TextView = view.findViewById(R.id.tvMedicationName)
        val timeTextView: TextView = view.findViewById(R.id.tvMedicationTime)
        val takenCheckBox: CheckBox = view.findViewById(R.id.cbMedicationTaken)

        nameTextView.text = medication.name
        timeTextView.text = medication.time
        takenCheckBox.isChecked = medication.taken

        takenCheckBox.setOnCheckedChangeListener { _, isChecked ->
            medication.taken = isChecked

        }

        return view
    }

    fun updateList(newMedications: List<Medication>) {
        medications.clear()
        medications.addAll(newMedications)
        notifyDataSetChanged()
    }
}
