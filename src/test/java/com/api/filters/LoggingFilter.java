package com.api.filters;


import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class LoggingFilter implements Filter {

    private static final Logger logger= LogManager.getLogger(LoggingFilter.class);
    @Override
    public Response filter(FilterableRequestSpecification filterableRequestSpecification, FilterableResponseSpecification filterableResponseSpecification, FilterContext filterContext) {
        logRequest(filterableRequestSpecification);
        Response response=filterContext.next(filterableRequestSpecification,filterableResponseSpecification);
        logResponse(response);
        return response; //test for assertion
    }
    public void logRequest(FilterableRequestSpecification requestSpecification){
        logger.info("BASE URI: {}",requestSpecification.getBaseUri());
        logger.info("HEADERS : {}",requestSpecification.getHeaders());
        logger.info("Request Body : "+requestSpecification.getBody());
    }

    public void logResponse(Response response){
        logger.info("Status code : {}",response.getStatusCode());
        logger.info("Response header : {}",response.getHeaders());
        logger.info("Response Body : {}",response.getBody());

    }
}
