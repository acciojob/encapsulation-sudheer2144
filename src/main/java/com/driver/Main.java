package com.driver;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RWOnly rwo=new RWOnly();
        String name=sc.nextLine();
        //rwo.name=name;
        //System.out.println(rwo.name);
        //'name' has private access in 'com.driver.RWOnly'

        rwo.setName(name);
        System.out.println(rwo.getName());
    }
  
}