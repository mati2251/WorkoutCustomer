[app](../../index.md) / [com.mateusz.workoutcustomer.creator](../index.md) / [TimeActivity](./index.md)

# TimeActivity

`class TimeActivity : AppCompatActivity`

RepeatActivity is creator repeat exercise

### Constructors

| [&lt;init&gt;](-init-.md) | `TimeActivity()`<br>RepeatActivity is creator repeat exercise |

### Properties

| [pause](pause.md) | `lateinit var pause: `[`EditText`](https://developer.android.com/reference/android/widget/EditText.html)<br>is EditText where user put pause number new exercise |
| [series](series.md) | `lateinit var series: `[`EditText`](https://developer.android.com/reference/android/widget/EditText.html)<br>is EditText where user put series number new exercise |
| [time](time.md) | `lateinit var time: `[`EditText`](https://developer.android.com/reference/android/widget/EditText.html) |

### Functions

| [add](add.md) | `fun add(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It adds new Exercise to database for this get data from intent and EditText |
| [addExercise](add-exercise.md) | `fun addExercise(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>check EditText is not empty, evokes add and create new intent and start it |
| [finish](finish.md) | `fun finish(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>check EditText is not empty, evokes add and finish activity |
| [onBackPressed](on-back-pressed.md) | `fun onBackPressed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It shows dialog window with message "Are you sure you want to not save this exercise?" It has 2 options: YES back to MenuActivity NO do nothing |
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It finds layouts elements and stores to variable and set array strings to spinners |

