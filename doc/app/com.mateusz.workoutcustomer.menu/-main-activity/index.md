[app](../../index.md) / [com.mateusz.workoutcustomer.menu](../index.md) / [MainActivity](./index.md)

# MainActivity

`class MainActivity : AppCompatActivity`

MainActivity is splash screen
It show  on 0.7 seconds layout activity_welcom and switch to MenuActivity

**Author**
Mateusz Karłowski

### Constructors

| [&lt;init&gt;](-init-.md) | `MainActivity()`<br>MainActivity is splash screen It show  on 0.7 seconds layout activity_welcom and switch to MenuActivity |

### Functions

| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>onCreate create WorkoutViewModel and ready other data in database. The second task onCreate is stop splash screen on 7 seconds |

### Companion Object Properties

| [workoutViewModel](workout-view-model.md) | `lateinit var workoutViewModel: `[`WorkoutViewModel`](../../com.mateusz.workoutcustomer.database/-workout-view-model/index.md)<br>is object class WorkoutViewModel |

