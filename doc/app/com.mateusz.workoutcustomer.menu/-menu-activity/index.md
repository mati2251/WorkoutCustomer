[app](../../index.md) / [com.mateusz.workoutcustomer.menu](../index.md) / [MenuActivity](./index.md)

# MenuActivity

`class MenuActivity : FragmentActivity, OnNavigationItemSelectedListener`

A class MenuActivity is Main Activity in my App

**Author**
Mateusz Karłowski

### Constructors

| [&lt;init&gt;](-init-.md) | `MenuActivity()`<br>A class MenuActivity is Main Activity in my App |

### Properties

| [fab](fab.md) | `lateinit var fab: FloatingActionButton`<br>Function onNavigationItemSelected change fragments when user chosen option on BottomNavigationView |
| [fragment](fragment.md) | `lateinit var fragment: Fragment` |

### Functions

| [loadFragment](load-fragment.md) | `fun loadFragment(fragment: Fragment?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Function loadFragment start new Fragment in the part of the Layout |
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Function onCreate evokes when class MenuActivity are creates. It set layout activity_menu It evokes function loadFragment because set default fragment Next create variable navigation and changes it into BottomNavigationView from layout The last set listener for BottomNavigationView |
| [onNavigationItemSelected](on-navigation-item-selected.md) | `fun onNavigationItemSelected(item: `[`MenuItem`](https://developer.android.com/reference/android/view/MenuItem.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

