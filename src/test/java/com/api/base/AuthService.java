package com.api.base;

import com.api.models.requestModel.ForgotPasswordRequest;
import com.api.models.requestModel.LoginRequestModel;
import com.api.models.requestModel.SignUpModel;
import io.restassured.response.Response;

public class AuthService extends BaseService {
    private static final String baseUri="api/auth/";
    public Response login(LoginRequestModel payload){
        return postRequest(payload,baseUri+"login");
    }
    public Response signUp(SignUpModel signUpModel){
        return  postRequest(signUpModel,baseUri+"signup");
    }
    public Response forgotPassword(ForgotPasswordRequest forgotPasswordRequest){
       return postRequest(forgotPasswordRequest,baseUri+"forgot-password");
    }
}
