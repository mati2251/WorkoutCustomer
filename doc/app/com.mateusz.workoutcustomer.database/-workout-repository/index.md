[app](../../index.md) / [com.mateusz.workoutcustomer.database](../index.md) / [WorkoutRepository](./index.md)

# WorkoutRepository

`class WorkoutRepository`

Workout Reposority is class contain

### Constructors

| [&lt;init&gt;](-init-.md) | `WorkoutRepository(workoutDao: `[`WorkoutDao`](../-workout-dao/index.md)`)`<br>Workout Reposority is class contain |

### Properties

| [allWorkout](all-workout.md) | `var allWorkout: LiveData<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Workout`](../-workout/index.md)`>>`<br>has all workour |

### Functions

| [deleteAll](delete-all.md) | `suspend fun deleteAll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [deleteById](delete-by-id.md) | `suspend fun deleteById(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [insert](insert.md) | `suspend fun insert(workout: `[`Workout`](../-workout/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Insert new element to database |
| [updateWorkoutDescription](update-workout-description.md) | `suspend fun updateWorkoutDescription(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [updateWorkoutTitle](update-workout-title.md) | `suspend fun updateWorkoutTitle(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

