package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-06-02T11:52:36.230Z")
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
    @io.swagger.annotations.ApiOperation(value = "Get user", notes = "Use this API to create a new user. Can be called from Super Admin Web App, Sales Manager Web App (User list page), User import page of sales manager integration workflow.", response = SaleskenResponse.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "results", response = SaleskenResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Manager not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Null Name or Email passed / Incorrect mobile number format / Uniqueness clause /  Enum clause", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 412, message = "License limit exceeded", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Auth token invalid/Auth token holder is not authorized", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Auth token not supplied", response = Void.class) })
    public Response getUser(@ApiParam(value = "Created user object" ,required=true) User createUser
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUser(createUser,securityContext);
    }
}
