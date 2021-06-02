package io.swagger.api.factories;

import io.swagger.api.UserApiService;
import io.swagger.api.impl.UserApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-06-02T11:48:25.503Z")
public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    public static UserApiService getUserApi() {
        return service;
    }
}
