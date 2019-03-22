[app](../../index.md) / [com.mateusz.workoutcustomer.database](../index.md) / [WorkoutAdapter](./index.md)

# WorkoutAdapter

`class WorkoutAdapter : Adapter<`[`WorkoutViewHolder`](-workout-view-holder/index.md)`>`

### Types

| [WorkoutViewHolder](-workout-view-holder/index.md) | `inner class WorkoutViewHolder : ViewHolder` |

### Constructors

| [&lt;init&gt;](-init-.md) | `WorkoutAdapter(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`)` |

### Properties

| [mWorkout](m-workout.md) | `lateinit var mWorkout: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Workout`](../-workout/index.md)`>` |

### Functions

| [getItemCount](get-item-count.md) | `fun getItemCount(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [onBindViewHolder](on-bind-view-holder.md) | `fun onBindViewHolder(holder: `[`WorkoutViewHolder`](-workout-view-holder/index.md)`, positon: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onCreateViewHolder](on-create-view-holder.md) | `fun onCreateViewHolder(parent: `[`ViewGroup`](https://developer.android.com/reference/android/view/ViewGroup.html)`, p1: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`WorkoutViewHolder`](-workout-view-holder/index.md) |
| [setList](set-list.md) | `fun setList(list: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Workout`](../-workout/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

