[app](../../index.md) / [com.mateusz.workoutcustomer.viewer](../index.md) / [TimeViewerActivity](./index.md)

# TimeViewerActivity

`class TimeViewerActivity : AppCompatActivity`

It see exercise with time

### Constructors

| [&lt;init&gt;](-init-.md) | `TimeViewerActivity()`<br>It see exercise with time |

### Properties

| [close](close.md) | `var close: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>is bool when is true this activity is finish |
| [exercise](exercise.md) | `lateinit var exercise: `[`Exercise`](../../com.mateusz.workoutcustomer.database/-exercise/index.md)<br>is current exercise object |

### Functions

| [onBackPressed](on-back-pressed.md) | `fun onBackPressed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This function displays dialog with message "Are you sure you want to cancel workout?" |
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It gets current exercise. Adds one to series. Find layout elements and show data. The last task this function is counting down time. |
| [pause](pause.md) | `fun pause(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This function stops counting down across set close to true. Next function creates new intent and start it |

### Companion Object Properties

| [pause](pause.md) | `const val pause: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>is address where intent put data and where activity get data. Address have information about pause |
| [pauseFormat](pause-format.md) | `const val pauseFormat: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>is address where intent put data and where activity get data. Address have information about pause format |

