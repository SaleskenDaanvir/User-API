# BulkUserApi

All URIs are relative to *https://virtserver.swaggerhub.com/Salesken8/UserAPIv3/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkUser**](BulkUserApi.md#createBulkUser) | **POST** /user/bulk/create | Create bulk user

<a name="createBulkUser"></a>
# **createBulkUser**
> SaleskenResponse createBulkUser(orgId, file)

Create bulk user

Use this Api to create bulk user with the help of excal file.Can be called from Super Admin Web App, Sales Manager Web App (User list page), User import page of sales manager integration workflow

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BulkUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


BulkUserApi apiInstance = new BulkUserApi();
Integer orgId = 56; // Integer | 
File file = new File("file_example"); // File | 
try {
    SaleskenResponse result = apiInstance.createBulkUser(orgId, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkUserApi#createBulkUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Integer**|  | [optional]
 **file** | **File**|  | [optional]

### Return type

[**SaleskenResponse**](SaleskenResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

