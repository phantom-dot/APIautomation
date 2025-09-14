package com.api.tests;

import com.api.base.AuthService;
import com.api.models.requestModel.ForgotPasswordRequest;
import com.api.models.requestModel.LoginRequestModel;
import com.api.models.requestModel.SignUpModel;
import com.api.models.requestModel.responseModel.LoginResponseModel;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListeners.class)
public class AuthTests {
    @Test(description = "Validate login")
    public void loginTest(){
        AuthService authService=new AuthService();
        LoginRequestModel loginRequestModel=new LoginRequestModel("uday1234","uday12345");
        Response response=authService.login(loginRequestModel);
        LoginResponseModel responseModel=response.as(LoginResponseModel.class);

        System.out.println(response.prettyPrint());
        System.out.println(responseModel.getusername());
    }

    @Test(description = "validates the user registration functionality")
    public void SignUpApiTest(){
        SignUpModel signUpModel=new SignUpModel.Builder()
                .email("demo@test.com")
                .firstname("Sahil")
                .lastname("test")
                .mobileNumber("123123213")
                .Password("123123")
                .userName("test")
                .build();
        AuthService authService=new AuthService();
        Response response=authService.signUp(signUpModel);
        Assert.assertEquals(response.getStatusCode(),500);
    }

    @Test(description = "This method validates the Forgot-password functionality")
    public void ForgotPasswordTest(){
        ForgotPasswordRequest forgotPasswordRequest=new ForgotPasswordRequest("test@test.com");
        AuthService authService=new AuthService();
        Response response=authService.forgotPassword(forgotPasswordRequest);
        System.out.println(response.prettyPrint());
    }


}
