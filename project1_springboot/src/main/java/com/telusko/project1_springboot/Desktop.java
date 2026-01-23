package com.telusko.project1_springboot;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("compiling with 404 bugs but faster");
    }
}
