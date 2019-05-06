[app](../../index.md) / [com.mateusz.workoutcustomer.menu](../index.md) / [MenuActivity](index.md) / [onCreate](./on-create.md)

# onCreate

`protected fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Function onCreate evokes when class MenuActivity are creates.
It sets layout activity_menu
It evokes function loadFragment because set default fragment
Next create variable navigation and changes it into BottomNavigationView from layout
The last set listener for BottomNavigationView

