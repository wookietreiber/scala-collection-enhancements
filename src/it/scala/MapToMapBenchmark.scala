package foo

import org.scalameter.api._

import MapToMap._

class ArrayBenchmark extends PerformanceTest.Quickbenchmark {
  val sizes: Gen[Int] = Gen.range("size")(300000, 700000, 100000)
  val arrays: Gen[Array[Int]] = for (size <- sizes) yield Array.fill(size)(0)

  val f = (x: Int) => (x,x)

  performance of "Array" in {
    measure method "map(f).toMap" in {
      using(arrays) in { xs =>
        val result: Map[Int,Int] = xs.map(f).toMap
        result
      }
    }

    measure method "mapToMap(f)" in {
      using(arrays) in { xs =>
        val result: Map[Int,Int] = xs.mapToMap(f)
        result
      }
    }
  }
}

class ListBenchmark extends PerformanceTest.Quickbenchmark {
  val sizes: Gen[Int] = Gen.range("size")(300000, 700000, 100000)
  val lists: Gen[List[Int]] = for (size <- sizes) yield List.fill(size)(0)

  val f = (x: Int) => (x,x)

  performance of "List" in {
    measure method "map(f).toMap" in {
      using(lists) in { xs =>
        val result: Map[Int,Int] = xs.map(f).toMap
        result
      }
    }

    measure method "mapToMap(f)" in {
      using(lists) in { xs =>
        val result: Map[Int,Int] = xs.mapToMap(f)
        result
      }
    }
  }
}

class VectorBenchmark extends PerformanceTest.Quickbenchmark {
  val sizes: Gen[Int] = Gen.range("size")(300000, 700000, 100000)
  val vectors: Gen[Vector[Int]] = for (size <- sizes) yield Vector.fill(size)(0)

  val f = (x: Int) => (x,x)

  performance of "Vector" in {
    measure method "map(f).toMap" in {
      using(vectors) in { xs =>
        val result: Map[Int,Int] = xs.map(f).toMap
        result
      }
    }

    measure method "mapToMap(f)" in {
      using(vectors) in { xs =>
        val result: Map[Int,Int] = xs.mapToMap(f)
        result
      }
    }
  }
}
