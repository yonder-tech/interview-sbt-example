package example

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class GreetingsServiceSpec extends AnyFreeSpec with Matchers {

  "GreetingsService.howShouldIGreet" - {

    "returns the correct greeting" in {
      GreetingsService.howShouldIGreet("Tim") shouldBe "Hello, Tim"
    }

  }
}
