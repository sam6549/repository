package payment.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import payment.dao.UserMapper;

@SpringBootApplication
@RestController

public class UserController {
    @Autowired
    private UserMapper mapper;
     
    String resultmsg="";
     
    @RequestMapping(value="/usercheck",method=RequestMethod.GET)
    public @ResponseBody Map<String,Object> checkid(HttpServletRequest request) throws Exception{
        
    	System.out.println(request.getParameter("userId"));
    	int cnt = mapper.selectCnt(request.getParameter("userId"));
         
        Map<String, Object> jsonObject =new HashMap<String, Object>();
        
        System.out.println(cnt);
        if(cnt==0){
            resultmsg="ID can be used";
        }else{
            resultmsg="ID not available";
        }
         
        jsonObject.put("resultmsg", resultmsg);
         
        return jsonObject;
    }



}
