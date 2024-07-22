package com.cc.java.bird;

import com.cc.java.interfaces.Flyabel;
import com.cc.java.interfaces.IFeathers;

public class Bird implements Flyabel, IFeathers {

    @Override
    public String fly() {
       return "I can fly at 20mph";
    }

  

    @Override
    public String hasFeathers() {
        return "I have feathers";
    }



   




}
