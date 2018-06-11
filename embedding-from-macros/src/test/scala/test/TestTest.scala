package test

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


  val r3 = Test2.test {

// These all work:

    //val x: Foo2[Foo2[Int]] = ???  // works

    //val x = AAA.bar[List[Int]]()  // works


//    val x = new Foo
//    val y: x.Foo4 = ???  // works





// All the following don't work:


    //val x: AAA.universe.TypeTag[Int] = ???


    //    val x = new Foo
    //    val y: x.Foo3[Int] = ???


    val y: Foo#Foo3[Int] = ???
  }

}
