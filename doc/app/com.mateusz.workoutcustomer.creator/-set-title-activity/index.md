[app](../../index.md) / [com.mateusz.workoutcustomer.creator](../index.md) / [SetTitleActivity](./index.md)

# SetTitleActivity

`class SetTitleActivity : AppCompatActivity`

It creates new Workout

### Constructors

| [&lt;init&gt;](-init-.md) | `SetTitleActivity()`<br>It creates new Workout |

### Properties

| [descriptionEditText](description-edit-text.md) | `lateinit var descriptionEditText: `[`EditText`](https://developer.android.com/reference/android/widget/EditText.html)<br>is EditText where user can put data for new workout |
| [titleEditText](title-edit-text.md) | `lateinit var titleEditText: `[`EditText`](https://developer.android.com/reference/android/widget/EditText.html)<br>is EditText where user can put data for new workout |

### Functions

| [next](next.md) | `fun next(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It checks EditTexts not empty and data is too long. If no it create new intent, put data and start it |
| [onBackPressed](on-back-pressed.md) | `fun onBackPressed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It shows dialog with message "Are you sure you want to exit?" This dialog have two options YES retreat NO do nothing |
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>It finds layouts elements and stores to variable |

### Companion Object Properties

| [ID](-i-d.md) | `const val ID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>is address title workout id where new intent put data. And where next activity can find data from this activity. Next activity use ID for create new Exercise to this workout |

