/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client;

import com.User;
import com.UserList;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Marcin
 */
public class RestClient {

    @Autowired
    RestTemplate restTemplate;

    public String fetchRESTObject() {
        RestTemplate restTemplate = new RestTemplate();
        //User ul= restTemplate.getForObject("http://192.168.1.105:3000/api/users/{user}", User.class,"1");  
        //UserList ul= restTemplate.getForObject("http://192.168.1.105:3000/api/users.xml", UserList.class);
        User user = new User("Seba", "siusiak3333");
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();

        map.add("name", "xx");
        map.add("address", "xx");
        //User result = restTemplate.postForObject("http://192.168.1.105:3000/api/users",map, User.class);
        // User user2= restTemplate.postForObject("http://192.168.1.105:3000/api/users",user, User.class, new Object[]{});
        String id="1";
        //restTemplate.put("http://192.168.1.105:3000/api/users/{id}",user,id);
restTemplate.delete("http://192.168.1.105:3000/api/users/{id}",user,id);
        return "".toString();
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
