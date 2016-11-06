package io.circe.yaml.snake

import io.circe.Json
import io.circe.Json.eqJson
import io.circe.testing.instances._
import io.circe.yaml._
import org.scalatest.FunSuite
import org.typelevel.discipline.scalatest.Discipline

class SnakeYamlSymmetricSerializationTests extends FunSuite with Discipline with SymmetricSerializationTests {
  override val laws: SymmetricSerializationLaws = SymmetricSerializationLaws()

  checkAll("snake.printer", symmetricPrinter[Json](printer.print, parser.parse))
}
