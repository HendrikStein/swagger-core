package testresources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import testmodels.Window;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/family")
@Api(value = "/family", description = "Family Resource")
public class NestedModelResource2 {
  @GET
  @Path("/{id}")
  @ApiOperation(value = "Gets a family by id",
    notes = "No details provided",
    response = Window.class)
  @ApiResponses({@ApiResponse(code = 404, message = "object not found")})
  public Response getFamilyById() {
    return Response.ok().build();
  }
}
