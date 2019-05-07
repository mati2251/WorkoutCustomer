[app](../../index.md) / [com.mateusz.workoutcustomer.viewer](../index.md) / [ExerciseAdapter](./index.md)

# ExerciseAdapter

`class ExerciseAdapter : Adapter<`[`ExerciseViewHolder`](-exercise-view-holder/index.md)`>`

class ExerciseAdapter extends from RecycleView.Adapter and it is for RecycleView

### Types

| [ExerciseViewHolder](-exercise-view-holder/index.md) | `inner class ExerciseViewHolder : ViewHolder, `[`OnClickListener`](https://developer.android.com/reference/android/view/View/OnClickListener.html)<br>class WorkoutViewHolder set onClick card listener and find layout item in R.layout.workout_item |

### Constructors

| [&lt;init&gt;](-init-.md) | `ExerciseAdapter(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`)`<br>class ExerciseAdapter extends from RecycleView.Adapter and it is for RecycleView |

### Properties

| [id](id.md) | `var id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>stores id clicked item |
| [mExercise](m-exercise.md) | `lateinit var mExercise: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Exercise`](../../com.mateusz.workoutcustomer.database/-exercise/index.md)`>`<br>is list Workout |

### Functions

| [getItemCount](get-item-count.md) | `fun getItemCount(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [onBindViewHolder](on-bind-view-holder.md) | `fun onBindViewHolder(holder: `[`ExerciseViewHolder`](-exercise-view-holder/index.md)`, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>onBindViewHolder set data from mExercise to item |
| [onCreateViewHolder](on-create-view-holder.md) | `fun onCreateViewHolder(parent: `[`ViewGroup`](https://developer.android.com/reference/android/view/ViewGroup.html)`, p1: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ExerciseViewHolder`](-exercise-view-holder/index.md)<br>onCreateViewHolder find CardView in layout and return items look like R.layout.exercise_item with data |
| [setList](set-list.md) | `fun setList(list: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Exercise`](../../com.mateusz.workoutcustomer.database/-exercise/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>function setList set new List with new Data |

### Companion Object Properties

| [ID](-i-d.md) | `const val ID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>is string which stores id address. This address is for intent can put ID. This property is companion object because ExerciseViewActivity must have address for read data |

