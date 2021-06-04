# UserApi

All URIs are relative to *https://virtserver.swaggerhub.com/Salesken8/UserAPIv3/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /user/create | Create user
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /user/{userId} | Delete user
[**getAllUser**](UserApi.md#getAllUser) | **GET** /user | Get all user List
[**getUserById**](UserApi.md#getUserById) | **GET** /user/{userId} | Get User by id
[**updateUser**](UserApi.md#updateUser) | **PUT** /user/{userId} | Update user

<a name="createUser"></a>
# **createUser**
> User createUser(body)

Create user

Use this API to create a new user. Can be called from Super Admin Web App, Sales Manager Web App (User list page), User import page of sales manager integration workflow.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
User body = new User(); // User | 
try {
    User result = apiInstance.createUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> User deleteUser(userId)

Delete user

Use this API to delete the user. Can be called from Super Admin Web App, Sales Manager Web App (User list page), User import page of sales manager integration workflow.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | ID of User
try {
    User result = apiInstance.deleteUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| ID of User |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllUser"></a>
# **getAllUser**
> List&lt;User&gt; getAllUser(offset, limit)

Get all user List

Use this API to get the user details with the help if email.Can be called from Super Admin Web App, Sales Manager Web App (User list page), User import page of sales manager integration workflow.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
Integer offset = 56; // Integer | The number of items to skip before starting to collect the result set
Integer limit = 56; // Integer | The numbers of items to return
try {
    List<User> result = apiInstance.getAllUser(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAllUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| The number of items to skip before starting to collect the result set | [optional]
 **limit** | **Integer**| The numbers of items to return | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserById"></a>
# **getUserById**
> User getUserById(userId)

Get User by id

Use this API to get the user details with the help if user id.Can be called from Super Admin Web App, Sales Manager Web App (User list page), User import page of sales manager integration workflow.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | Get user by Id
try {
    User result = apiInstance.getUserById(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| Get user by Id |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> User updateUser(userId, body)

Update user

Use this API to update the user. Can be called from Super Admin Web App, Sales Manager Web App (User list page), User import page of sales manager integration workflow.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | ID of User
User body = new User(); // User | 
try {
    User result = apiInstance.updateUser(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| ID of User |
 **body** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

