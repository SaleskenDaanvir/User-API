package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.io.File;
import io.swagger.model.SaleskenResponse;
import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-06-04T07:39:02.596Z")
public abstract class UserApiService {
    public abstract Response createUser(User createUser,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllUser(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserById(Integer id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateUser(User updateUser,Integer id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userCreateBulkPost(InputStream createMultipleUsersInputStream, FormDataContentDisposition createMultipleUsersDetail,SecurityContext securityContext) throws NotFoundException;
}
