package com.api.base;

import com.api.filters.LoggingFilter;
import com.api.models.requestModel.LoginRequestModel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
    //Base URI
    // Crete Request
    // handling response
    //wrapper for restassured

    static {
        RestAssured.filters(new LoggingFilter());
    }

    private static final String BASE_URL="http://64.227.160.186:8080";
    private final RequestSpecification requestSpecification;

    public BaseService(){
        requestSpecification = RestAssured.given().baseUri(BASE_URL);
    }

    protected Response postRequest(Object body, String endpoint){
        return requestSpecification.body(body).contentType(ContentType.JSON).post(endpoint);
    }




}
