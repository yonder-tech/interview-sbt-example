package example

object Main extends App {
  val greeting = GreetingsService.howShouldIGreet("Tim")
  println(greeting)
}
