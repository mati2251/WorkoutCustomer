package com.mateusz.workoutcustomer.database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * A data class *workout* use for database SQLLite
 *
 * @property id this is integer for identification workout
 * @property title this is workout title
 * @property description this is workout description
 *
 * @author Mateusz Karłowski
 */

@Entity(tableName = "workout_table")
data class Workout(
    @PrimaryKey
    @ColumnInfo(name = "_id") var id: Int, @ColumnInfo(name = "title") var title: String,
    @ColumnInfo(name = "description") var description: String
)