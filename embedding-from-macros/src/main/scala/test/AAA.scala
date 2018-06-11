package test

object AAA {

  def bar[A](): Unit = ???


  val mirror = scala.reflect.runtime.currentMirror

  val universe = mirror.universe

}
