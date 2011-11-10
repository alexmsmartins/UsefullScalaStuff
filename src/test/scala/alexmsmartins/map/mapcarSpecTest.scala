package alexmsmartins

import log.{LoggerSupplier}
import org.specs._
import alexmsmartins.map._
import alexmsmartins.log.LoggerWrapper._
import alexmsmartins.log.LoggerSupplier
import java.lang.{IndexOutOfBoundsException, IllegalArgumentException}
import runner.JUnit4


class mapcarSpecTest extends JUnit4(mapcarSpec)

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 17-06-2011
 * Time: 2:51
 * To change this template use File | Settings | File Templates.
 */
object mapcarSpec extends Specification with LoggerSupplier {
  supplyLog.info("mapcarSpec test logging started!")

  description = "the system basic functionalities are"
  "MapFunction" should {
    "be able to add lists of integers " in{
      val a = List(1, 2, 3, 4)
      val b = List(5, 6, 7, 8)
      val c = List(9, 10, 11, 12)
      val functTest = (x:Int, y:Int, z:Int) => x + y + z
      mapcar(functTest, a, b, c) must_== List(15,18,21,24)
      supplyLog.info("mapcarSpec test 1.")
      val funcTest2 = (a:Int, b:Int, c:Int, d:Int) => a+b+c+d
      mapcar(funcTest2, List(1,2,3,4), List(1,1,1,1), List(2,2,2,2), List(1,1,1,1)) must_== List(5,6,7,8)
      supplyLog.info("mapcarSpec test 2.")
    };
    "throw a IndexOutOfBoundsException if lists of different sizes are used " in{
      val funcTest2 = (a:Int, b:Int, c:Int, d:Int) => a+b+c+d
      mapcar(funcTest2, List(1,2,3,4), List(1,1,1,1), List(2,2,2,2), List(1,1,1)) must
        throwA[IndexOutOfBoundsException]
      supplyLog.info("mapcarSpec test 3.")
    }
  }
  supplyLog.info("mapcarSpec test logging ended!")
}
