[app](../../index.md) / [com.mateusz.workoutcustomer.database](../index.md) / [WorkoutDao](./index.md)

# WorkoutDao

`interface WorkoutDao`

**WorkoutDao** is a class for insert data

**Author**
Mateusz Karłowski

### Functions

| [deleteAll](delete-all.md) | `abstract fun deleteAll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Function **deleteAll** delete all data in database |
| [getAllWorkout](get-all-workout.md) | `abstract fun getAllWorkout(): LiveData<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Workout`](../-workout/index.md)`>>`<br>Function **getAllWords** get all words form data |
| [insert](insert.md) | `abstract fun insert(workout: `[`Workout`](../-workout/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Function **insert** insert data to database |
| [removeById](remove-by-id.md) | `abstract fun removeById(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Function **removeById** remove workout with the same id |

