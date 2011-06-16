package alexmsmartins

class MapFunctions[T] {
  def mapcar(f:(T*) => T, args:List[T]*): List[T] = {
    //TODO: check if the list sizes and number of arguments in the function match
    val lists = args.toList
    lists.size match {
      case 2 => mapcar2(f.asInstanceOf[(T, T) => T], lists)
      case 3 => mapcar3 (f, lists)
      case 4 => mapcar4 (f, lists)
      /*case 5 => mapcar5 (f, lists)
      case 6 => mapcar6 (f, lists)
      case 7 => mapcar7 (f, lists)
      case 8 => mapcar8 (f, lists)
      case 9 => mapcar9 (f, lists)
      case 10 => mapcar10 (f, lists)
      case 11 => mapcar11 (f, lists)
      case 12 => mapcar12 (f, lists)
      case 13 => mapcar13 (f, lists)
      case 14 => mapcar14 (f, lists)
      case 15 => mapcar15 (f, lists)
      case 16 => mapcar16 (f, lists)
      case 17 => mapcar17 (f, lists)
      case 18 => mapcar18 (f, lists)
      case 19 => mapcar19 (f, lists)
      case 20 => mapcar20 (f, lists)
      case 21 => mapcar21 (f, lists)
      case 22 => mapcar22 (f, lists)
      case 23 => mapcar23 (f, lists)*/
      case _ => throw new Exception
    }
  }

  private def mapcar2(f: (T, T) => T, lists: List[List[T]]): List[T] = {
    for (val index <- List.range(0, (lists.head).asInstanceOf[List[T]].size).asInstanceOf[List[Int]]  ) {
      f(lists(0).asInstanceOf[List[T]](index),
        lists(2).asInstanceOf[List[T]](index))
    }
  }

  private def mapcar3(f: (T *) => T, lists: List[List[T]]): List[T] = {
    for (val index <- List.range(0, lists.head.asInstanceOf[List[T]].size).asInstanceOf[List[Int]]  ) {
      f(lists(0).asInstanceOf[List[T]](index),
        lists(1).asInstanceOf[List[T]](index),
        lists(2).asInstanceOf[List[T]](index))
    }
  }

  private def mapcar4(f: (T *) => T, lists: List[List[T]]): List[T] = {
    for (val index <- List.range(0, lists.head.asInstanceOf[List[T]].size).asInstanceOf[List[Int]]  ) {
      f(lists(0).asInstanceOf[List[T]](index),
        lists(1).asInstanceOf[List[T]](index),
        lists(2).asInstanceOf[List[T]](index),
        lists(3).asInstanceOf[List[T]](index))
    }
  }
}

object tests {
  def main(args: List[String]) = {
    val a = List(1, 2, 3, 4)
    val b = List(5, 6, 7, 8)
    val c = List(9, 10, 11, 12)
    val map = new MapFunctions[Int]
    val functTest = (x:Int, y:Int, z:Int) => x + y + z
    map.mapcar(functTest, a, b, c)
  }
}
