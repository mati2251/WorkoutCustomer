[app](../../index.md) / [com.mateusz.workoutcustomer.viewer](../index.md) / [ViewActivity](./index.md)

# ViewActivity

`class ViewActivity : AppCompatActivity`

This class is main viewer workout

### Constructors

| [&lt;init&gt;](-init-.md) | `ViewActivity()`<br>This class is main viewer workout |

### Properties

| [exerciseAdapter](exercise-adapter.md) | `lateinit var exerciseAdapter: `[`ExerciseAdapter`](../-exercise-adapter/index.md)<br>is object ExerciseAdapter for RecycleView |
| [id](id.md) | `var id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>is workout current id |

### Functions

| [deleteWorkout](delete-workout.md) | `fun deleteWorkout(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Delete Workout and Finish activity |
| [newExercise](new-exercise.md) | `fun newExercise(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Start creator new Exercise |
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It gets id from intent. Next find workout by id in database. And print about workout info on TextView. It is get all exercise this workout and set in Adapter. Last recycleView set  adapter |
| [start](start.md) | `fun start(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It starts current workout. And check if workout have exercise |

### Companion Object Properties

| [WORKOUTID](-w-o-r-k-o-u-t-i-d.md) | `const val WORKOUTID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>is address where intent put data about id and where activity get data. |
| [workoutId](workout-id.md) | `var workoutId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

