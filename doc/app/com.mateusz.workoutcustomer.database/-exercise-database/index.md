[app](../../index.md) / [com.mateusz.workoutcustomer.database](../index.md) / [ExerciseDatabase](./index.md)

# ExerciseDatabase

`abstract class ExerciseDatabase : RoomDatabase`

It opens data, This class is singleton

**Author**
Mateusz Karłowski

### Constructors

| [&lt;init&gt;](-init-.md) | `ExerciseDatabase()`<br>It opens data, This class is singleton |

### Functions

| [exerciseDao](exercise-dao.md) | `abstract fun exerciseDao(): `[`ExerciseDao`](../-exercise-dao/index.md) |

### Companion Object Functions

| [getDatabase](get-database.md) | `fun getDatabase(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`, scope: CoroutineScope): `[`ExerciseDatabase`](./index.md)<br>Singleton implementation and open database |

