package test


import squid.TestDSL.Predef._
import squid.TestDSL.Quasicodes._
import squid.quasi.MetaBases
import squid.utils._


object TestTest extends App {
  
//  val r = Test2.test(Some(123).map(_ + 1))
//
//  println(r)

//  val r = Test2.test {
//    implicit val x = 42
//    val y = implicitly[Int]
//    println(y)
//  }



//  val r2 = Test2.test {
//    implicit val x = 42
//  }

//
//
//  val r2 = Test2.test {
//    val x = new Foo {}
//  }



//    val r2 = Test2.test {
//      val x = (???): Foo
//    }


//  val r3 = Test2.test {
//
//// These all work:
//
//    //val x: Foo2[Foo2[Int]] = ???  // works
//
//    //val x = AAA.bar[List[Int]]()  // works
//
//
////    val x = new Foo
////    val y: x.Foo4 = ???  // works
//
//
//
//
//
//// All the following didn't work before the fixing of https://github.com/epfldata/squid/issues/56:
//
//
//    //val x: AAA.universe.TypeTag[Int] = ???
//
//
//    //    val x = new Foo
//    //    val y: x.Foo3[Int] = ???
//
//
//    val y: Foo#Foo3[Int] = ???
//  }















//  val r4 = Test2.test {
//
//    //val x: AAA.universe.TypeTag[Int] = ???
//
//    val x = new Foo
//    val y: x.Foo3[Int] = ???
//
//  }


  //println(dbg_code"(???): AAA.universe.TypeTag[Int]".rep.toString)


//  println(dbg_code"""
//              val x = new Outer
//              val y: x.Inner = ???""")




//    println(dbg_code"""
//                Bar.aaa[Int]()""")

  println(dbg_code"""
                    import scala.reflect.runtime.universe._
                    val tt = typeTag[Outer]
              """)


}



class Outer {
  class Inner
}


object Bar {
  def aaa[A: AAA.universe.TypeTag]() = ???
}