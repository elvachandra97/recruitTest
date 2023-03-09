package com.dansmultipro.controllers;

import java.util.ArrayList;
import java.util.List;

import org.jasypt.util.text.BasicTextEncryptor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dansmultipro.models.entities.Joblist;
import com.google.gson.Gson;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class TestController {
	
	private String decryptString(String docNo) {
		BasicTextEncryptor encrypt = new BasicTextEncryptor();
		encrypt.setPassword("mayora");
		
		String res = "";
		docNo = docNo.replaceAll("_", "/").replaceAll("-", "\\+");
		docNo = encrypt.decrypt(docNo);	
		res = docNo;
		
		return res;
	}
    
    // @GetMapping
    @RequestMapping(value = "/Test/Login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, Model model) {

        String username = request.getParameter("username");
        String password = decryptString(request.getParameter("password"));

        if(username == null || password == null){
            return "Cannot Login";
        }

        return "Login! Hello and Welcome!";
    }

    @GetMapping
    @RequestMapping(value = "/Test/GetJobList", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody String getJobList(@RequestBody String json) {
        
        System.out.println("Get Job List");
        JSONArray jsonArray = new JSONArray(json);
        List<Joblist> lsJoblist = new ArrayList<Joblist>();
        
        
        try {
            System.out.println(jsonArray.length());
            for(int i = 0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                lsJoblist.add(new Gson().fromJson(jsonObject.toString(), Joblist.class));
            }
        } catch (Exception e) {
            return "Failed";
        }

        return "Success";
    }

    @GetMapping
    @RequestMapping(value = "/Test/GetJobDetail", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody String getJobDetail() {
        
        return "Get Job List Detail";
    }

}
