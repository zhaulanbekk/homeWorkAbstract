package com.company;

public abstract class AbstractAnimal {
    private String nickName;
    private int age;
    private int weight;
    private String gender;

    public AbstractAnimal(String nickName, int age, int weight, String gender) {
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
        this.gender= gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                " nickName='" + nickName + '\'' +
                ", age=" + age +
                ", weight=" + weight+
                " Gender="+gender;
    }
}
