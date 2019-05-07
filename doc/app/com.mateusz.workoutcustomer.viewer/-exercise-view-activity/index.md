[app](../../index.md) / [com.mateusz.workoutcustomer.viewer](../index.md) / [ExerciseViewActivity](./index.md)

# ExerciseViewActivity

`class ExerciseViewActivity : AppCompatActivity`

This shows data about selected exercise

### Constructors

| [&lt;init&gt;](-init-.md) | `ExerciseViewActivity()`<br>This shows data about selected exercise |

### Properties

| [id](id.md) | `var id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>is current exercise id |

### Functions

| [deleteExercise](delete-exercise.md) | `fun deleteExercise(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This function delete Exercise by ID |
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It finds exercise by id in database. And show data about this exercise on TextView. |

