[app](../../index.md) / [com.mateusz.workoutcustomer.viewer](../index.md) / [RepeatViewerActivity](./index.md)

# RepeatViewerActivity

`class RepeatViewerActivity : AppCompatActivity`

It see exercise with repeat

### Constructors

| [&lt;init&gt;](-init-.md) | `RepeatViewerActivity()`<br>It see exercise with repeat |

### Properties

| [exercise](exercise.md) | `lateinit var exercise: `[`Exercise`](../../com.mateusz.workoutcustomer.database/-exercise/index.md)<br>is current exercise object |

### Functions

| [onBackPressed](on-back-pressed.md) | `fun onBackPressed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This function displays dialog with message "Are you sure you want to cancel workout?" |
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It gets current exercise. Adds one to series. Find layout elements and show data. |
| [pause](pause.md) | `fun pause(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This function stops counting down across set close to true. Next function creates new intent and start it |

