package com.example.android.animalinfo;

import java.io.Serializable;
import java.util.jar.Attributes;

/**
 * Created by anning on 2018/3/1.
 */

public class Animal implements Serializable {

    private String name;
    private int legs;
    private boolean Fur;
    private String info;
    private boolean Attribute1;
    private boolean Attribute2;

    public Animal(String name, int legs, boolean Fur, boolean Attribute1, boolean Attribute2, String info){
        this.name=name;
        this.legs=legs;
        this.Fur=Fur;
        this.info=info;
        this.Attribute1= Attribute1;
        this.Attribute2= Attribute2;
    }


    public String getName(){
        return name;
    }

    public int getLegs(){
        return legs;
    }

    public boolean getFur(){
        return Fur;
    }

    public String getInfo(){
        return info;
    }

    public boolean getAttribute1(){
        return Attribute1;
    }

    public boolean getAttribute2(){
        return Attribute2;
    }
}
