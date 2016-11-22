package controllers


import org.scalatest.concurrent.ScalaFutures
import org.scalatestplus.play.PlaySpec
import play.api.test.FakeRequest


class HomeControllerTest extends PlaySpec with ScalaFutures {

  "home controller" should {
    "be always valid" in {

      new HomeController().index().apply(FakeRequest()).futureValue.header.status mustBe 200
    }
  }
}
