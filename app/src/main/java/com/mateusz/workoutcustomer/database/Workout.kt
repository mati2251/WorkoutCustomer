package com.mateusz.workoutcustomer.database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "workout_table")
class Workout {
    constructor(id: Int, title: String, description: String) {
        this.id = id
        this.title = title
        this.description = description
    }
    @PrimaryKey
    @ColumnInfo(name = "id")
    var id : Int
    @ColumnInfo(name = "title")
    var title : String
    @ColumnInfo(name = "description")
    var description : String
}