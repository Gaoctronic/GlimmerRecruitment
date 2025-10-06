package uestc.glimmerjava5;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("哈吉米", 18, '男');
        person.eat();
        person.sleep();
        person.dadoudou();
        System.out.println(person.toString());
    }
}
