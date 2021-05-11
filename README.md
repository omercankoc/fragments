## Fragments
Segment your app into multiple, independent screens that are hosted within an Activity.
### Declaring dependencies:
Add the dependencies for the artifacts you need in the build.gradle file for your app or module.
```gradle
dependencies {
    def fragment_version = "1.3.3"
    implementation "androidx.fragment:fragment-ktx:$fragment_version"
}
```
### Fragment Management: 
```kotlin
fun fragmentFirst(view : View){
    val fragmentManager = supportFragmentManager
    val fragmentTransaction = fragmentManager.beginTransaction()
    val firstFragment = FirstFragment()
    fragmentTransaction.replace(R.id.frameLayoutFirst,firstFragment).commit()
    }
```

