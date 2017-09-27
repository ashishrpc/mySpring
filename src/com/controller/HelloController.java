package com.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

	@RequestMapping("/") 
//import org.springframework.web.servlet.mvc.Controller;
@Controller
public class HelloController  { 
	@RequestMapping(value="/index", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Returning hello view");

        try 
        { 
            URL url=new URL("http://localhost:8082/authorization-server/oauth/token/client_id=clientapp&grant_type=password&username=admin&password=passw0rd");//"http://staging.azova.co/api/customservice/getauthkey");
            HttpURLConnection conn=(HttpURLConnection) url.openConnection();  
            conn.setUseCaches (false);
            conn.setDoInput(true);
            conn.setDoOutput(true);            
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            //conn.getOutputStream().write(postDataBytes); 
            int code = conn.getResponseCode();
            System.out.println("got the response code: " + code);
            String responseMsg = conn.getResponseMessage();
            System.out.println("got the response: " + responseMsg); 
            if(code != 200){
                System.out.println("Error : "+responseMsg); 
                //return resObj;
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            StringBuilder builder = new StringBuilder();
            for (String line = null; (line = reader.readLine()) != null;) {
                builder.append(line).append("\n");
            }
            reader.close();
            conn.disconnect();
            System.out.println("Response Returned: "+builder.toString());
           
        }catch(IOException ex ){     
            System.out.println(ex);
        }catch(Exception ex){     
            System.out.println(ex);
        }
        return new ModelAndView("hello");
    }

}
