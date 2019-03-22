[app](../../index.md) / [com.mateusz.workoutcustomer.database](../index.md) / [WorkoutViewModel](./index.md)

# WorkoutViewModel

`open class WorkoutViewModel : AndroidViewModel`

WorkoutViewModel is class extend AndroidViewModel

### Constructors

| [&lt;init&gt;](-init-.md) | `WorkoutViewModel(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`)`<br>get repository and allWorkout |

### Properties

| [allWorkout](all-workout.md) | `var allWorkout: LiveData<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Workout`](../-workout/index.md)`>>`<br>is all workout in database |
| [repository](repository.md) | `var repository: `[`WorkoutRepository`](../-workout-repository/index.md)<br>is var repository |

### Functions

| [insert](insert.md) | `fun insert(workout: `[`Workout`](../-workout/index.md)`): Job`<br>function **insert** insert Workout to database |
| [onCleared](on-cleared.md) | `open fun onCleared(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

