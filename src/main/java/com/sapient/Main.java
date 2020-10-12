package com.sapient;

import com.sapient.service.HelloService;

public class Main {
    public static void main(String[] args) {

        String name = "Vinod";
        if(args.length>0) {
            name = args[0];
        }
        String msg = new HelloService().getHelloMessage(name);
        System.out.println("***************************");
        System.out.println("*** " + msg );
        System.out.println("***************************");
    }
}
