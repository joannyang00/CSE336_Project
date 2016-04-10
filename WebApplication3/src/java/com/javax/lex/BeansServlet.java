/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javax.lex;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author weitang
 */
public class BeansServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        ServletContext sc = this.getServletContext();
        StoreFormDataBean b = (StoreFormDataBean) sc.getAttribute("OracleForm");
        if (b ==null) {
            b = new StoreFormDataBean();
            sc.setAttribute("OracleForm",b);
        }
        b.setFName(req.getParameter("FName"));
        b.setLName(req.getParameter("LName"));
        b.setUserID(req.getParameter("UserID"));
        b.setPassword(req.getParameter("Password"));
        b.setRePassword(req.getParameter("RePassword"));
        b.setAlias(req.getParameter("alias"));
        b.setCountryOfRes(req.getParameter("CountryOfRes"));
        b.setCity(req.getParameter("City"));
        b.setLanguage(req.getParameter("Language"));
        b.setSecurityQues(req.getParameter("SecurityQues"));
        b.setSecurityAns(req.getParameter("SecurityAns"));
        
        if (b.isValid()){
            String url = "/ShowFormData.jsp";
            RequestDispatcher dispatcher = req.getRequestDispatcher(url);
            dispatcher.forward(req,resp);
        }
        
    }
    
    
    
    
}
