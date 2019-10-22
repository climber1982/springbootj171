package com.lovo.boot.webservice;

import javax.jws.WebService;

@WebService
public class UserMessage {

    public  String getMessage(String str){
          return str+":hello webservice";
    }
}
