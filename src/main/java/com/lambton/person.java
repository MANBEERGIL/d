package com.lambton;

public class person implements IDisplay
{
   private int id;
    private  String name;
    private String gender;

    public person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public person(int id) {
        this.id = id;
    }

    public person(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void display() {
        System.out.println("i am person");

    }

}
