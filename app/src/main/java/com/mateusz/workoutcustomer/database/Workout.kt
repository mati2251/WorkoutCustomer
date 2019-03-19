package com.mateusz.workoutcustomer.database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "workout_table")
data class Workout (@PrimaryKey
                    @ColumnInfo(name = "_id") var id : Int,
                    @ColumnInfo(name = "title") var title : String,
                    @ColumnInfo(name = "description") var description : String)