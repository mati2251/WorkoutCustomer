[app](../../index.md) / [com.mateusz.workoutcustomer.database](../index.md) / [ExerciseDao](./index.md)

# ExerciseDao

`interface ExerciseDao`

It is interface with query to database

**Author**
Mateusz Karłowski

### Functions

| [deleteAll](delete-all.md) | `abstract fun deleteAll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Delete all exercise |
| [deleteByExerciseId](delete-by-exercise-id.md) | `abstract fun deleteByExerciseId(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Delete by exercise id |
| [deleteByWorkoutId](delete-by-workout-id.md) | `abstract fun deleteByWorkoutId(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Delete by workout id |
| [getAllExercise](get-all-exercise.md) | `abstract fun getAllExercise(): LiveData<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Exercise`](../-exercise/index.md)`>>`<br>Get all exercise |
| [insert](insert.md) | `abstract fun insert(exercise: `[`Exercise`](../-exercise/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Insert new exercise |

