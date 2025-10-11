package uestc.glimmerjava7;

import java.util.List;
import java.util.ArrayList;

public final class ForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach(num -> System.out.println(num));
    }
}
