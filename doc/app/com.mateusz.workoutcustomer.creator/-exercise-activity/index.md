[app](../../index.md) / [com.mateusz.workoutcustomer.creator](../index.md) / [ExerciseActivity](./index.md)

# ExerciseActivity

`class ExerciseActivity : AppCompatActivity`

class ExerciseActivity is create new Exercise

### Constructors

| [&lt;init&gt;](-init-.md) | `ExerciseActivity()`<br>class ExerciseActivity is create new Exercise |

### Properties

| [description](description.md) | `lateinit var description: `[`EditText`](https://developer.android.com/reference/android/widget/EditText.html)<br>is EditText where user put description new exercise |
| [instruction](instruction.md) | `lateinit var instruction: `[`EditText`](https://developer.android.com/reference/android/widget/EditText.html)<br>is EditText where user put instruction new exercise |
| [radioGroup](radio-group.md) | `lateinit var radioGroup: `[`RadioGroup`](https://developer.android.com/reference/android/widget/RadioGroup.html)<br>is group with two RadioButtons. First is Time. Second is Repeat. User choose button according from exercise |
| [title](title.md) | `lateinit var title: `[`EditText`](https://developer.android.com/reference/android/widget/EditText.html)<br>is EditText where user put title new exercise |

### Functions

| [nextExercise](next-exercise.md) | `fun nextExercise(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It checks EditText is empty. If yes show statement. But if EditText is not empty. It create new Intent, put data and start new activity |
| [onBackPressed](on-back-pressed.md) | `fun onBackPressed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It shows dialog with message "Are you sure you want to exit?" This dialog have two options YES retreat NO do nothing |
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>it finds layout elements and stores to variable |

### Companion Object Properties

| [DESCRIPTION](-d-e-s-c-r-i-p-t-i-o-n.md) | `const val DESCRIPTION: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>is address description new exercise where new intent put data. And where next activity can find data from this activity |
| [INSTRUCTION](-i-n-s-t-r-u-c-t-i-o-n.md) | `const val INSTRUCTION: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>is address instruction new exercise where new intent put data. And where next activity can find data from this activity |
| [TITLE](-t-i-t-l-e.md) | `const val TITLE: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>is address title new exercise where new intent put data. And where next activity can find data from this activity |

