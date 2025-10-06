package uestc.glimmerjava5;

public class Person {
    private String name;
    private int age;
    private char sex;

    public Person() {
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public void eat() {
        System.out.println(name+"正在吃东西");
    }

    public void sleep() {
        System.out.println(name+"正在睡觉");
    }

    public void dadoudou() {
        System.out.println(name+"正在打豆豆");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }
}
