package alexmsmartins.log

import org.specs._
import org.specs.runner.JUnit4

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 10-11-2011
 * Time: 17:13
 * To change this template use File | Settings | File Templates.
 */

class LoggerWrapperSpecTest extends JUnit4(LoggerWrapperSpec)

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 17-06-2011
 * Time: 2:51
 * To change this template use File | Settings | File Templates.
 */
object LoggerWrapperSpec extends Specification with LoggerSupplier {
  supplyLog.info("LoggerWrapperSpec test logging started!")

  description = "the logger basic functionalities are"
  "Debugging" should {
    "be able to log a variable number of parameters" in{
      supplyLog.debug("The four parameters are {} as String, {} as Integer, {} as String and {} as Integer.", 1, 2, "3", 4)
    };
  }
  supplyLog.info("LoggerWrapperSpec test logging ended!")

}