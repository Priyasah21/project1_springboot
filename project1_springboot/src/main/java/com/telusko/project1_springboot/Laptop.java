package com.telusko.project1_springboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary

public class Laptop implements com.telusko.project1_springboot.Computer {
    public void compile(){

        System.out.println("compiling with 404 bugs");

    }
}
