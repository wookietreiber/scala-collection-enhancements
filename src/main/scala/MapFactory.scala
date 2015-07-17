package foo

object Foo {

  implicit class MyMapFactory(self: Map.type) {
    /** Avoid `xs.map(..).toMap`. */
    def sequence[A,K,V](xs: Array[A])(f: A => (K,V)): Map[K,V] = {
      val builder = self.newBuilder[K,V]
      builder.sizeHint(xs)
      for (x <- xs)
        builder += f(x)
      builder.result()
    }
  }

}
