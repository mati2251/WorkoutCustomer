[app](../../index.md) / [com.mateusz.workoutcustomer.database](../index.md) / [ExerciseRepository](./index.md)

# ExerciseRepository

`class ExerciseRepository`

This class have functions evokes other function from ExerciseDao

**Author**
Mateusz Karłowski

### Constructors

| [&lt;init&gt;](-init-.md) | `ExerciseRepository(exerciseDao: `[`ExerciseDao`](../-exercise-dao/index.md)`)`<br>This class have functions evokes other function from ExerciseDao |

### Properties

| [allExercise](all-exercise.md) | `var allExercise: LiveData<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Exercise`](../-exercise/index.md)`>>` |

### Functions

| [deleteAll](delete-all.md) | `suspend fun deleteAll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Delete all element |
| [deleteByExerciseId](delete-by-exercise-id.md) | `suspend fun deleteByExerciseId(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Delete all element the same exercise ID |
| [deleteByWorkoutId](delete-by-workout-id.md) | `suspend fun deleteByWorkoutId(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Delete all element the same workout ID |
| [insert](insert.md) | `suspend fun insert(exercise: `[`Exercise`](../-exercise/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Insert new element to database |
| [updateExerciseDescription](update-exercise-description.md) | `suspend fun updateExerciseDescription(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [updateExerciseInstruction](update-exercise-instruction.md) | `suspend fun updateExerciseInstruction(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, instruction: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [updateExercisePause](update-exercise-pause.md) | `suspend fun updateExercisePause(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, pause: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [updateExercisePauseFormat](update-exercise-pause-format.md) | `suspend fun updateExercisePauseFormat(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, pauseFormat: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [updateExerciseRepeat](update-exercise-repeat.md) | `suspend fun updateExerciseRepeat(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, repeat: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [updateExerciseSeries](update-exercise-series.md) | `suspend fun updateExerciseSeries(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, series: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [updateExerciseTime](update-exercise-time.md) | `suspend fun updateExerciseTime(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, time: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [updateExerciseTimeFormat](update-exercise-time-format.md) | `suspend fun updateExerciseTimeFormat(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, timeFormat: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [updateExerciseTitle](update-exercise-title.md) | `suspend fun updateExerciseTitle(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

