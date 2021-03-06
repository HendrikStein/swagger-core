package testresources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import testmodels.JavaSample;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/javaPathParamTest")
@Api(value = "/javaPathParamTest")
public class JavaPathParamTargetResource extends JavaParentTargetResource {
  @ApiParam(value = "sample param data", required = true, allowableValues = "range[0,10]")
  @PathParam("id") 
  String id;

  @GET
  @Path("/{id}")
  @ApiOperation(value = "Get object by ID",
    notes = "No details provided",
    response = JavaSample.class,
    position = 0)
  @ApiResponses({
    @ApiResponse(code = 400, message = "Invalid ID"),
    @ApiResponse(code = 404, message = "object not found")}
  )
  public Response getTest(
    @ApiParam(value = "a query param", required = true, allowableValues = "a,b,c")@QueryParam("qp") String classParam) {
    JavaSample out = new JavaSample();
    out.setName("foo");
    out.setValue("bar");
    return Response.ok().entity(out).build();
  }

  @GET
  @Path("/{id}/details")
  @ApiOperation(value = "Get details by ID",
    notes = "No details provided",
    response = JavaSample.class,
    position = 0)
  @ApiResponses({
    @ApiResponse(code = 400, message = "Invalid ID"),
    @ApiResponse(code = 404, message = "object not found")}
  )
  public Response getDetails() {
    JavaSample out = new JavaSample();
    out.setName("foo");
    out.setValue("bar");
    return Response.ok().entity(out).build();
  }

  @POST
  @Path("/{id}/details")
  @ApiOperation(value = "Get details by ID",
    notes = "No details provided",
    response = JavaSample.class,
    position = 0)
  @ApiResponses({
    @ApiResponse(code = 400, message = "Invalid ID"),
    @ApiResponse(code = 404, message = "object not found")}
  )
  public Response getDetails(@ApiParam(value = "body param", required = true, allowableValues = "1,2,3")int[] values) {
    JavaSample out = new JavaSample();
    out.setName("foo");
    out.setValue("bar");
    return Response.ok().entity(out).build();
  }
}
