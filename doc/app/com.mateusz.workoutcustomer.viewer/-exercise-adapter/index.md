[app](../../index.md) / [com.mateusz.workoutcustomer.viewer](../index.md) / [ExerciseAdapter](./index.md)

# ExerciseAdapter

`class ExerciseAdapter : Adapter<`[`ExerciseViewHolder`](-exercise-view-holder/index.md)`>`

### Types

| [ExerciseViewHolder](-exercise-view-holder/index.md) | `inner class ExerciseViewHolder : ViewHolder, `[`OnClickListener`](https://developer.android.com/reference/android/view/View/OnClickListener.html) |

### Constructors

| [&lt;init&gt;](-init-.md) | `ExerciseAdapter(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`)` |

### Properties

| [id](id.md) | `var id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [mExercise](m-exercise.md) | `lateinit var mExercise: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Exercise`](../../com.mateusz.workoutcustomer.database/-exercise/index.md)`>` |

### Functions

| [getItemCount](get-item-count.md) | `fun getItemCount(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [onBindViewHolder](on-bind-view-holder.md) | `fun onBindViewHolder(holder: `[`ExerciseViewHolder`](-exercise-view-holder/index.md)`, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onCreateViewHolder](on-create-view-holder.md) | `fun onCreateViewHolder(parent: `[`ViewGroup`](https://developer.android.com/reference/android/view/ViewGroup.html)`, p1: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ExerciseViewHolder`](-exercise-view-holder/index.md) |
| [setList](set-list.md) | `fun setList(list: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Exercise`](../../com.mateusz.workoutcustomer.database/-exercise/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Properties

| [ID](-i-d.md) | `const val ID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

