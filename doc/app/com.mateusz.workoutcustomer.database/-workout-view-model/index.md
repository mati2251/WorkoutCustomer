[app](../../index.md) / [com.mateusz.workoutcustomer.database](../index.md) / [WorkoutViewModel](./index.md)

# WorkoutViewModel

`open class WorkoutViewModel : AndroidViewModel`

WorkoutViewModel is class extend AndroidViewModel

### Constructors

| [&lt;init&gt;](-init-.md) | `WorkoutViewModel(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`)`<br>get repository and allWorkout |

### Properties

| [allExercise](all-exercise.md) | `var allExercise: LiveData<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Exercise`](../-exercise/index.md)`>>`<br>is all exercise in database |
| [allWorkout](all-workout.md) | `var allWorkout: LiveData<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Workout`](../-workout/index.md)`>>`<br>is all workout in database with workout and function |
| [repository](repository.md) | `var repository: `[`WorkoutRepository`](../-workout-repository/index.md)<br>is var repository |
| [repositoryExercise](repository-exercise.md) | `var repositoryExercise: `[`ExerciseRepository`](../-exercise-repository/index.md)<br>is var repository with exercise and function |

### Functions

| [deleteAll](delete-all.md) | `fun deleteAll(): Job`<br>Function delete all data |
| [deleteById](delete-by-id.md) | `fun deleteById(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): Job`<br>Function delete workout by ID |
| [deleteExerciseById](delete-exercise-by-id.md) | `fun deleteExerciseById(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): Job`<br>Function delete exercise by ID |
| [findExerciseById](find-exercise-by-id.md) | `fun findExerciseById(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Exercise`](../-exercise/index.md)<br>Function find exercise by ID |
| [findWorkoutById](find-workout-by-id.md) | `fun findWorkoutById(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Workout`](../-workout/index.md)<br>Function find workout by ID |
| [insert](insert.md) | `fun insert(workout: `[`Workout`](../-workout/index.md)`): Job`<br>function **insert** insert Workout to database`fun insert(exercise: `[`Exercise`](../-exercise/index.md)`): Job`<br>function insert insert exercise to database |
| [onCleared](on-cleared.md) | `open fun onCleared(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Function stoped parentJob |
| [updateExerciseDescription](update-exercise-description.md) | `fun updateExerciseDescription(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Job` |
| [updateExerciseInstruction](update-exercise-instruction.md) | `fun updateExerciseInstruction(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, instruction: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Job` |
| [updateExercisePause](update-exercise-pause.md) | `fun updateExercisePause(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, pause: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): Job` |
| [updateExercisePauseFormat](update-exercise-pause-format.md) | `fun updateExercisePauseFormat(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, pauseFormat: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Job` |
| [updateExerciseRepeat](update-exercise-repeat.md) | `fun updateExerciseRepeat(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, repeat: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): Job` |
| [updateExerciseSeries](update-exercise-series.md) | `fun updateExerciseSeries(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, series: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): Job` |
| [updateExerciseTime](update-exercise-time.md) | `fun updateExerciseTime(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, time: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): Job` |
| [updateExerciseTimeFormat](update-exercise-time-format.md) | `fun updateExerciseTimeFormat(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, timeFormat: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Job` |
| [updateExerciseTitle](update-exercise-title.md) | `fun updateExerciseTitle(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Job` |
| [updateWorkoutDescription](update-workout-description.md) | `fun updateWorkoutDescription(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Job` |
| [updateWorkoutTitle](update-workout-title.md) | `fun updateWorkoutTitle(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Job` |

