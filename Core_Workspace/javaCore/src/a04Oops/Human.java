package a04Oops;

public class Human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;                      // this keyword represents current object
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}