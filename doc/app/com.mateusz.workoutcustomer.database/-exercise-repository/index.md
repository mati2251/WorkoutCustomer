[app](../../index.md) / [com.mateusz.workoutcustomer.database](../index.md) / [ExerciseRepository](./index.md)

# ExerciseRepository

`class ExerciseRepository`

### Constructors

| [&lt;init&gt;](-init-.md) | `ExerciseRepository(exerciseDao: `[`ExerciseDao`](../-exercise-dao/index.md)`)` |

### Properties

| [allExercise](all-exercise.md) | `var allExercise: LiveData<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Exercise`](../-exercise/index.md)`>>` |

### Functions

| [deleteAll](delete-all.md) | `suspend fun deleteAll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [deleteByExerciseId](delete-by-exercise-id.md) | `suspend fun deleteByExerciseId(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [deleteByWorkoutId](delete-by-workout-id.md) | `suspend fun deleteByWorkoutId(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [insert](insert.md) | `suspend fun insert(exercise: `[`Exercise`](../-exercise/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Insert new element to database |

