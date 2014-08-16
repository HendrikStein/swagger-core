package testresources;

import javax.ws.rs.PathParam;

import com.wordnik.swagger.annotations.ApiParam;

abstract class JavaParentTargetResource {
  @ApiParam(value = "sample name data", required = true)
  @PathParam("name") 
  protected String name;
}