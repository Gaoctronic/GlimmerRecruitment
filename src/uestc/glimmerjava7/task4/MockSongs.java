package uestc.glimmerjava7.task4;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<String> getSongStrings() {
        List<String> songs = new ArrayList<>();
        //模拟将要处理的列表
        songs.add("sunrise");
        songs.add("thanks");
        songs.add("$100");
        songs.add("havana");
        songs.add("114514");

        songs.sort((a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }

            for (int i = 0; i < a.length(); i++) {
                char c1 = a.charAt(i);
                char c2 = b.charAt(i);
                int i1 = getCharType(c1);
                int i2 = getCharType(c2);

                if (i1 != i2) {
                    return Integer.compare(i1, i2);
                }

                return Character.compare(c1, c2);
            }

            return 0;
        });
        return songs;
    }

    public static void main(String[] args) {
        List<String> songs = getSongStrings();
        for (String song: songs) {
            System.out.println(song);
        }
    }

    //用于判断字母类型（属于字母，数字或都不是）
    private static int getCharType(char c) {
        if (Character.isLetter(c)) {
            return 0;
        }
        if (Character.isDigit(c)) {
            return 1;
        }
        return 2;
    }
}
