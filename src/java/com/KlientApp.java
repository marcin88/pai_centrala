/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.client.RestClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Marcin
 */
@Controller
@RequestMapping("/index")
public class KlientApp {

    
    
    @RequestMapping(method = RequestMethod.GET)
    public String refresh(ModelMap model){
    
//    int i = 3;
//    int j = 5;
//    int result = add(i, j);
//    System.out.println("Result = " + result);    
   
    RestClient client = new RestClient();
    String result= client.fetchRESTObject();
    
    model.addAttribute("msg","Super dziala wynik "+result);
    
    return "index";
    }
    

    
    
  
    @RequestMapping(method=RequestMethod.POST)
    public String processForm() {
    return "nothing"; 
 
  }
  
    
   // @RequestMapping(value="/index", method=RequestMethod.GET)
//    public ModelAndView myRestMethod() {
//
//        User user= new User("Seba","siusiak");
//        
//        //ResponseObj response = myService.getResponse(word);
//        return new ModelAndView("jaxbView", BindingResult.MODEL_KEY_PREFIX + "response", user);
//    }
  
    
    private  int add(int i, int j) {
    org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
    org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
    return port.add(i, j);
}
}
