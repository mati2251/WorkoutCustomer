[app](../../../index.md) / [com.mateusz.workoutcustomer.viewer](../../index.md) / [ExerciseAdapter](../index.md) / [ExerciseViewHolder](./index.md)

# ExerciseViewHolder

`inner class ExerciseViewHolder : ViewHolder, `[`OnClickListener`](https://developer.android.com/reference/android/view/View/OnClickListener.html)

class WorkoutViewHolder set onClick card listener and find layout item in R.layout.workout_item

### Constructors

| [&lt;init&gt;](-init-.md) | `ExerciseViewHolder(viewItem: `[`View`](https://developer.android.com/reference/android/view/View.html)`, exerciseAdapter: `[`ExerciseAdapter`](../index.md)`)`<br>sets OnClick as OnClickListener |

### Properties

| [exerciseAdapter](exercise-adapter.md) | `var exerciseAdapter: `[`ExerciseAdapter`](../index.md) |
| [id](id.md) | `var id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>is workout id |
| [mExerciseDescription](m-exercise-description.md) | `var mExerciseDescription: `[`TextView`](https://developer.android.com/reference/android/widget/TextView.html)<br>is TextView with exercise Description. |
| [mExerciseDetails](m-exercise-details.md) | `var mExerciseDetails: `[`TextView`](https://developer.android.com/reference/android/widget/TextView.html)<br>is TextView with exercise Details |
| [mExerciseTitle](m-exercise-title.md) | `var mExerciseTitle: `[`TextView`](https://developer.android.com/reference/android/widget/TextView.html)<br>is TextView with exercise Title |

### Functions

| [onClick](on-click.md) | `fun onClick(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>onClick starts new Intent and put ID to this Intent |

