/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


UserID=&Password=&RePassword=&alias=&CountryOfRes=&City=&Language=en-US&SecurityQues=&custom_question=&SecurityAns=&ibm-submit=Register

 */
package com.javax.lex;

import java.io.Serializable;

/**
 *
 * @author weitang
 */
public class StoreFormDataBean implements Serializable{
     
    private String FName;
    private String LName;
    private String Password;
    private String RePassword;
    private String CountryOfRes;
    private String UserID;
    private String alias;
    private String City;
    private String Language;
    private String SecurityQues;
    private String SecurityAns;
    
    public StoreFormDataBean(){
        
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public String getPassword() {
        return Password;
    }

    public String getRePassword() {
        return RePassword;
    }

    public String getCountryOfRes() {
        return CountryOfRes;
    }

    public String getUserID() {
        return UserID;
    }

    public String getAlias() {
        return alias;
    }

    public String getCity() {
        return City;
    }

    public String getLanguage() {
        return Language;
    }

    public String getSecurityQues() {
        return SecurityQues;
    }

    public String getSecurityAns() {
        return SecurityAns;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setRePassword(String RePassword) {
        this.RePassword = RePassword;
    }

    public void setCountryOfRes(String CountryOfRes) {
        this.CountryOfRes = CountryOfRes;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public void setSecurityQues(String SecurityQues) {
        this.SecurityQues = SecurityQues;
    }

    public void setSecurityAns(String SecurityAns) {
        this.SecurityAns = SecurityAns;
    }
    
    public boolean isValid(){
        if (UserID == ""){
            return false;
        }else{
            return true;
        }
    }
    
}
