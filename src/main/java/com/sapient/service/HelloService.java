package com.sapient.service;

public class HelloService {

    public String getHelloMessage(String name) {
        if(name==null || name.trim().length()==0) {
            name = "friend";
        }
        return String.format("Hello, %s!", name);
    }
}
