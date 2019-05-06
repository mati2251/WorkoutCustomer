[app](../../index.md) / [com.mateusz.workoutcustomer.database](../index.md) / [WorkoutViewModel](./index.md)

# WorkoutViewModel

`open class WorkoutViewModel : AndroidViewModel`

WorkoutViewModel is class extend AndroidViewModel

### Constructors

| [&lt;init&gt;](-init-.md) | `WorkoutViewModel(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`)`<br>get repository and allWorkout |

### Properties

| [allExercise](all-exercise.md) | `var allExercise: LiveData<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Exercise`](../-exercise/index.md)`>>` |
| [allWorkout](all-workout.md) | `var allWorkout: LiveData<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Workout`](../-workout/index.md)`>>`<br>is all workout in database |
| [repository](repository.md) | `var repository: `[`WorkoutRepository`](../-workout-repository/index.md)<br>is var repository |
| [repositoryExercise](repository-exercise.md) | `var repositoryExercise: `[`ExerciseRepository`](../-exercise-repository/index.md) |

### Functions

| [deleteAll](delete-all.md) | `fun deleteAll(): Job` |
| [deleteById](delete-by-id.md) | `fun deleteById(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): Job` |
| [deleteExerciseById](delete-exercise-by-id.md) | `fun deleteExerciseById(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): Job` |
| [findExerciseById](find-exercise-by-id.md) | `fun findExerciseById(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Exercise`](../-exercise/index.md) |
| [findWorkoutById](find-workout-by-id.md) | `fun findWorkoutById(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Workout`](../-workout/index.md) |
| [insert](insert.md) | `fun insert(workout: `[`Workout`](../-workout/index.md)`): Job`<br>function **insert** insert Workout to database`fun insert(exercise: `[`Exercise`](../-exercise/index.md)`): Job`<br>function insert insert exercise to database |
| [onCleared](on-cleared.md) | `open fun onCleared(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Function stoped parentJob |

