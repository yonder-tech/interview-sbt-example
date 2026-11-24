package example


object GreetingsService {

  def howShouldIGreet(name: String): String = {
    s"Hello, $name"
  }
}
