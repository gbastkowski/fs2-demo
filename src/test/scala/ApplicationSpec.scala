import io.circe.parser.parse
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import scala.io.Source

class ApplicationSpec extends AnyFreeSpec with Matchers {
  "A csv file should be converted to JSON" in {
    Main.run(Nil).unsafeRunSync()

    parse(Source.fromFile("data.json").mkString)
      .map { _.asArray.get.length }
      .fold(
        e => fail(s"Error: $e"),
        _ shouldBe 58)
  }
}
