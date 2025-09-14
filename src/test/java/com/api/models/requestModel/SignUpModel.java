package com.api.models.requestModel;

public class SignUpModel {
    String username;
    String password;
    String email;
    String firstname;
    String lastname;
    String mobileNumber;

    public SignUpModel(String username, String password, String email, String firstname, String lastname, String mobileNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobileNumber = mobileNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "SignUpModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }



    public static class Builder{
        String username;
        String password;
        String email;
        String firstname;
        String lastname;
        String mobileNumber;

        public Builder userName(String username){
            this.username=username;
            return this;
        }
        public Builder Password(String password){
            this.password=password;
            return this;
        }
        public Builder email(String email){
            this.email=email;
            return this;
        } public Builder firstname(String firstname){
            this.firstname=firstname;
            return this;
        }
        public Builder lastname(String lastname){
            this.lastname=lastname;
            return this;
        }
        public Builder mobileNumber(String mobileNumber){
            this.mobileNumber=mobileNumber;
            return this;
        }

        public SignUpModel build(){
            SignUpModel signUpModel=new SignUpModel(username,password,email,firstname,lastname,mobileNumber);
            return signUpModel;
        }
    }
}
