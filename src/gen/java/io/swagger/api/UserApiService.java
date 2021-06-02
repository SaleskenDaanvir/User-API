package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.SaleskenResponse;
import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-06-02T11:52:36.230Z")
public abstract class UserApiService {
    public abstract Response createUser(User createUser,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUser(User createUser,SecurityContext securityContext) throws NotFoundException;
}
