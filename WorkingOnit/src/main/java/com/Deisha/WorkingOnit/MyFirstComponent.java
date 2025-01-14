package com.Deisha.WorkingOnit;

public class MyFirstComponent {


    private String myVar;

    public MyFirstComponent(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return "Hello from my first class ==> myVar = " + myVar;
    }
}
