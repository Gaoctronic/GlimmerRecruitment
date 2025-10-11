package uestc.glimmerjava7.task3;

public class Main {
    public static void main(String[] args) {
        MyRepository<String> stringRepository = new MyRepository<>();
        MyRepository<User> userRepository = new MyRepository<>();
        MyRepository<Integer> intRepository = new MyRepository<>();

        stringRepository.save("111");
        stringRepository.save("222");
        stringRepository.save("Hello, World!");
        stringRepository.save("KIT");

        userRepository.save(new User("张三", 18));
        userRepository.save(new User("李四", 20));
        userRepository.save(new User("王五", 22));
        userRepository.save(new User("李华", 23));

        intRepository.save(1);
        intRepository.save(2);
        intRepository.save(3);
        intRepository.save(999);

        stringRepository.printAll();
        System.out.println("-------------");
        userRepository.printAll();
        System.out.println("-------------");
        intRepository.printAll();
    }
}
