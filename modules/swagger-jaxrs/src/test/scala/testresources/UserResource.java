package testresources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import testmodels.User;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/nested")
@Api(value = "/nested", description = "nested model resource")
public class UserResource {
  @GET
  @Path("/{id}")
  @ApiOperation(value = "Gets a family by id",
    notes = "No details provided",
    response = User.class)
  @ApiResponses({@ApiResponse(code = 404, message = "object not found")})
  public Response getUserById() {
    return Response.ok().build();
  }
}
