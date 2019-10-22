package com.lovo.boot.webservice;

import javax.xml.ws.Endpoint;

public class T {

    public static void main(String[] args) {
        Endpoint.publish("http://192.168.1.222:8888/userMessage",new UserMessage());
    }
}
