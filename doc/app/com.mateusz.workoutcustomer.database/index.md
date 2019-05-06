[app](../index.md) / [com.mateusz.workoutcustomer.database](./index.md)

## Package com.mateusz.workoutcustomer.database

### Types

| [Exercise](-exercise/index.md) | `data class Exercise`<br>It is data class Exercise |
| [ExerciseDao](-exercise-dao/index.md) | `interface ExerciseDao`<br>It is interface with query to database |
| [ExerciseDatabase](-exercise-database/index.md) | `abstract class ExerciseDatabase : RoomDatabase`<br>It opens data, This class is singleton |
| [ExerciseRepository](-exercise-repository/index.md) | `class ExerciseRepository`<br>This class have functions evokes other function from ExerciseDao |
| [Workout](-workout/index.md) | `data class Workout`<br>A data class *workout* use for database SQLLite |
| [WorkoutDao](-workout-dao/index.md) | `interface WorkoutDao`<br>**WorkoutDao** is a class for insert data |
| [WorkoutDatabase](-workout-database/index.md) | `abstract class WorkoutDatabase : RoomDatabase`<br>class **WorkoutDatabase** is singleton for build and open database |
| [WorkoutRepository](-workout-repository/index.md) | `class WorkoutRepository`<br>Workout Reposority is class contain |
| [WorkoutViewModel](-workout-view-model/index.md) | `open class WorkoutViewModel : AndroidViewModel`<br>WorkoutViewModel is class extend AndroidViewModel |

