/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._
import org.joda.time.DateTime

case class Order (
                  id: Option[Long],
                  petId: Option[Long],
                  quantity: Option[Int],
                  shipDate: Option[DateTime],
                  status:  Option[OrderStatusEnum.OrderStatusEnum],
                  complete: Option[Boolean]
)

object Order {
implicit val format: Format[Order] = Json.format
}

object OrderStatusEnum extends Enumeration {
  val   placed, approved, delivered = Value
  type OrderStatusEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[OrderStatusEnum.type])
}