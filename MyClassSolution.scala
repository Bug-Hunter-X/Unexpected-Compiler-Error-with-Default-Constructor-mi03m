```scala
class MyClass(val value: Int) {
  def this() { this(0) }
}

object Main extends App {
  val instance1 = new MyClass(5) // Works fine
  val instance2 = new MyClass() // Now compiles correctly
  println(instance1.value) // Output: 5
  println(instance2.value) // Output: 0
}
```