[app](../../index.md) / [com.mateusz.workoutcustomer.database](../index.md) / [WorkoutDatabase](./index.md)

# WorkoutDatabase

`abstract class WorkoutDatabase : RoomDatabase`

class **WorkoutDatabase** is singleton for build and open database

### Constructors

| [&lt;init&gt;](-init-.md) | `WorkoutDatabase()`<br>class **WorkoutDatabase** is singleton for build and open database |

### Functions

| [workoutDao](workout-dao.md) | `abstract fun workoutDao(): `[`WorkoutDao`](../-workout-dao/index.md)<br>Abstract fun |

### Companion Object Functions

| [getDatabase](get-database.md) | `fun getDatabase(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`, scope: CoroutineScope): `[`WorkoutDatabase`](./index.md)<br>Singleton implementation and open database |

