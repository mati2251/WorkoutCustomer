[app](../../../index.md) / [com.mateusz.workoutcustomer.menu](../../index.md) / [WorkoutAdapter](../index.md) / [WorkoutViewHolder](./index.md)

# WorkoutViewHolder

`inner class WorkoutViewHolder : ViewHolder, `[`OnClickListener`](https://developer.android.com/reference/android/view/View/OnClickListener.html)

class WorkoutViewHolder set onClick card listener and find layout item in R.layout.workout_item

### Constructors

| [&lt;init&gt;](-init-.md) | `WorkoutViewHolder(viewItem: `[`View`](https://developer.android.com/reference/android/view/View.html)`, workoutAdapter: `[`WorkoutAdapter`](../index.md)`)`<br>sets OnClick as OnClickListener |

### Properties

| [id](id.md) | `var id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>is workout id |
| [mAdapter](m-adapter.md) | `var mAdapter: `[`WorkoutAdapter`](../index.md) |
| [mWorkoutDescription](m-workout-description.md) | `var mWorkoutDescription: `[`TextView`](https://developer.android.com/reference/android/widget/TextView.html)<br>is TextView with workout Description. Its id is R.id.workout_description |
| [mWorkoutTitle](m-workout-title.md) | `var mWorkoutTitle: `[`TextView`](https://developer.android.com/reference/android/widget/TextView.html)<br>is TextView with workout Title, Its id is R.id.workout_title |

### Functions

| [onClick](on-click.md) | `fun onClick(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>onClick starts new Intent and put ID to this Intent |

