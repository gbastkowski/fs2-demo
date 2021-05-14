import cats.effect._
import fs2._

object Main extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = {
    Stream
      .emit[IO, String]("lolz")
      .map(println)
      .compile.drain
      .as(ExitCode.Success)
  }
}