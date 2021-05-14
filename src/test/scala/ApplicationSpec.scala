import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import scala.io.Source

class ApplicationSpec extends AnyFreeSpec with Matchers {
  "A csv file should be converted to JSON" in {
    Main.run("data.csv" :: Nil).unsafeRunSync()

    Source.fromFile("data.json").getLines().mkString should not be empty
  }
}
