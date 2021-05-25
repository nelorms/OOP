package com.ucreativa.familia;

public class Francisco {
    private int age;
    private String hobby;

    public Francisco (String saludo){
        this.age = 60;
        this.hobby = "Soccer";
        System.out.println(saludo);
    }

    public void setCumple(){
        this.age = this.age + 1;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String getHobby(){
        return this.hobby;
    }
}