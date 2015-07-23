package foo

import language.higherKinds

import collection.Traversable
import collection.mutable.WrappedArray

object MapToMap {

  implicit class RichArray[A](val xs: Array[A]) extends AnyVal {

    def mapToMap[K,V](f: A => (K,V)): Map[K,V] =
      MapToMap.RichCollection[A,WrappedArray](xs).mapToMap(f)

  }

  implicit class RichCollection[A,CC[A] <: Traversable[A]](val xs: CC[A]) extends AnyVal {

    def mapToMap[K,V](f: A => (K,V)): Map[K,V] = {
      val builder = Map.newBuilder[K,V]
      builder.sizeHint(xs)
      for (x <- xs) builder += f(x)
      builder.result()
    }

  }

}
