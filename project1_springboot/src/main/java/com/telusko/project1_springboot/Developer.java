package com.telusko.project1_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {

   @Autowired//field injection
   @Qualifier("laptop")

   private Computer comp;


//   //constructor injection
//   public Developer(Laptop laptop){
//       this.laptop=laptop;
//   }
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop=laptop;
//    }
    public void build(){
        comp.compile();
        System.out.println("working on awesome project");
    }


}
