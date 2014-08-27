import testresources._

import com.wordnik.swagger.jaxrs.reader._
import com.wordnik.swagger.core.util._
import com.wordnik.swagger.model._
import com.wordnik.swagger.config._
import com.wordnik.swagger.core.filter._

import java.lang.reflect.Method

import java.util.Date

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import scala.collection.mutable.ListBuffer

@RunWith(classOf[JUnitRunner])
class HeaderParamTargetTest extends FlatSpec with ShouldMatchers {
  it should "honor a query param target at the class level" in {
    val reader = new DefaultJaxrsApiReader
    val config = new SwaggerConfig()
    val apiResource = reader.read("/api-docs", classOf[HeaderParamTargetResource], config).getOrElse(fail("should not be None"))

    val apis = apiResource.apis
    apis.size should be(1)

    val ops = apis.head.operations
    ops.size should be(1)
    val op = ops.head
    op.parameters.size should be(3)

    val qpt = op.parameters(0)
    println(qpt)
    qpt.name should be("theParam")
    qpt.allowableValues should be(AllowableListValues(List("a", "b", "c")))
    qpt.dataType should be("string")

    val id = op.parameters(1)
    println(id)
    id.name should be("id")
    id.allowableValues should be(AllowableRangeValues("0.0", "10.0"))
    id.dataType should be("string")

    val headerParam = op.parameters(2)
    println(headerParam)
    headerParam.name should be("headerParam")
    headerParam.dataType should be("string")
  }
}
