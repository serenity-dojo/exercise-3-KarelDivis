package com.serenitydojo;

public class Dog {

    private String name;
    private String favoriteToy;
    private int age;
    private boolean isFed;
    public static final String DOG_NOISE = "Woof";

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        this.isFed = false;
    }

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.isFed = false;
    }

    public static String makeNoise(){
        return DOG_NOISE;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void  setIsFed(boolean isFed){
        this.isFed = isFed;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsFed() {
        return isFed;
    }

    public void feed(){
        setIsFed(true);
    }
}
