package foo

import org.scalameter.api._

import Foo._

class Test extends PerformanceTest.Quickbenchmark {
  val sizes: Gen[Int] = Gen.range("size")(100000, 500000, 100000)
  val arrays: Gen[Array[Int]] = for (size <- sizes) yield Array.fill(size)(0)

  val f = (x: Int) => (x, x + 2)

  performance of "Array" in {
    measure method "map(..).toMap" in {
      using(arrays) in { array =>
        val result: Map[Int,Int] = array.map(f).toMap
        result
      }
    }
  }

  performance of "Map" in {
    measure method "sequence" in {
      using(arrays) in { array =>
        val result: Map[Int,Int] = Map.sequence(array)(f)
        result
      }
    }
  }
}
