package alexmsmartins
import org.specs._

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 17-06-2011
 * Time: 2:51
 * To change this template use File | Settings | File Templates.
 */
object MapFunctionSpec extends Specification {
  description = "the system basic functionalities are"
  "MapFunction" should {
    //skip("those examples don't pass yet")
    "be able to add lists of integers " in{
      val a = List(1, 2, 3, 4)
      val b = List(5, 6, 7, 8)
      val c = List(9, 10, 11, 12)
      val map = new MapFunction[Int]
      val functTest = (x:Int, y:Int, z:Int) => x + y + z
      map.mapcar(functTest, a, b, c) must_== List(15,18,21,24)
    }
  }
}