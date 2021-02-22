package test

import cats.effect._

object Main extends IOApp {
  def run(args: List[String]): IO[ExitCode] = {
    println("Hello")
    println(MyCalculator.add(1,3))
    IO.pure(ExitCode.Success)
  }
}