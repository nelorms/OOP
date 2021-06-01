package com.ucreativa.familia;

public class Francisco {
    private int age;
    private String hobby;
    private String saludo;

    public Francisco (String saludo){
        this.age = 60;
        this.hobby = "Soccer";
        System.out.println(saludo);
    }
    public Francisco(String saludo, int age, String hobby){
        this.age = age;
        this.saludo = saludo;
        this.hobby = hobby;
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