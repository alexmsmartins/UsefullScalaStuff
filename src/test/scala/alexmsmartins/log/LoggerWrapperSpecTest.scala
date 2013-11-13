package alexmsmartins.log

import org.specs2.mutable._

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 10-11-2011
 * Time: 17:13
 * To change this template use File | Settings | File Templates.
 */

//class LoggerWrapperSpecTest extends JUnit4(LoggerWrapperSpec)

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 17-06-2011
 * Time: 2:51
 * To change this template use File | Settings | File Templates.
 */
object LoggerWrapperSpec extends SpecificationWithJUnit with LoggerSupplier {
  supplyLog.info("LoggerWrapperSpec test logging started!")

  override def is = //"the logger basic functionalities are"
    "Debugging" should {
      "be able to log a variable number of parameters" in {
        supplyLog.debug("The four parameters are {} as Integer, {} as Integer, {} as String and {} as Integer.", 1, 2, "3", 4) must_== 1
      }
    }
  supplyLog.info("LoggerWrapperSpec test logging ended!")

}