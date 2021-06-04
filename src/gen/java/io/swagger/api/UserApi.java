package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import io.swagger.model.SaleskenResponse;
import io.swagger.model.User;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/user")


@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-06-04T07:39:44.345Z")
public class UserApi  {
   private final UserApiService delegate;

   public UserApi(@Context ServletConfig servletContext) {
      UserApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UserApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UserApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UserApiServiceFactory.getUserApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/create")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create user", notes = "Use this API to create a new user. Can be called from Super Admin Web App, Sales Manager Web App (User list page), User import page of sales manager integration workflow.", response = SaleskenResponse.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "results", response = SaleskenResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Manager not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Null Name or Email passed / Incorrect mobile number format / Uniqueness clause /  Enum clause", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 412, message = "License limit exceeded", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Auth token invalid/Auth token holder is not authorized", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Auth token not supplied", response = Void.class) })
    public Response createUser(@ApiParam(value = "Created user object" ,required=true) User createUser
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUser(createUser,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all user List", notes = "Use this API to get the user details with the help if email.Can be called from Super Admin Web App, Sales Manager Web App (User list page), User import page of sales manager integration workflow.", response = SaleskenResponse.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = SaleskenResponse.class) })
    public Response getAllUser(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllUser(securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get User by id", notes = "Use this API to get the user details with the help if user id.Can be called from Super Admin Web App, Sales Manager Web App (User list page), User import page of sales manager integration workflow.", response = SaleskenResponse.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = SaleskenResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Manager not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Auth token invalid/Auth token holder is not authorized", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Auth token not supplied", response = Void.class) })
    public Response getUserById(@ApiParam(value = "Get user by Id",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserById(id,securityContext);
    }
    @POST
    @Path("/update/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update user", notes = "Use this API to update the user. Can be called from Super Admin Web App, Sales Manager Web App (User list page), User import page of sales manager integration workflow.", response = SaleskenResponse.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "results", response = SaleskenResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Manager not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Null Name or Email passed / Incorrect mobile number format / Uniqueness clause /  Enum clause", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 412, message = "License limit exceeded", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Auth token invalid/Auth token holder is not authorized", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Auth token not supplied", response = Void.class) })
    public Response updateUser(@ApiParam(value = "Created user object" ,required=true) User updateUser
,@ApiParam(value = "Update user object",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUser(updateUser,id,securityContext);
    }
    @POST
    @Path("/create_bulk")
    @Consumes({ "multipart/form-data" })
    
    @io.swagger.annotations.ApiOperation(value = "Create bulk users.", notes = "", response = Void.class, tags={ "user bulk", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully created", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid file format", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Manager not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 412, message = "License limit exceeded", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Auth token invalid/Auth token holder is not authorized", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Auth token not supplied", response = Void.class) })
    public Response userCreateBulkPost(
            @FormDataParam("create multiple users") InputStream createMultipleUsersInputStream,
            @FormDataParam("create multiple users") FormDataContentDisposition createMultipleUsersDetail
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userCreateBulkPost(createMultipleUsersInputStream, createMultipleUsersDetail,securityContext);
    }
}
