package uestc.glimmerjava4;

public class ControlFlow {

    private static final String ILLEGAL_PARAMETER = "参数不合法";

    //TASK 1
    //这个函数用于判断传入的年份是否为闰年
    //是闰年返回1，不是闰年返回2
    static boolean isLeapYear(int year) {
        int flag = year % 4;
        if (flag == 0) {
            return true;
        }
        return false;
    }


    //TASK 2
    //这个函数打印一个高度为n的空心菱形，保证n为奇数
    //如n=5,则打印如下图形：
    //  *
    // * *
    //*   *
    // * *
    //  *
    static void print(int n) {
        if ((n % 2) == 0 || n < 0) {
            throw new IllegalArgumentException(ILLEGAL_PARAMETER);
        }

        int midIndex = n / 2;

        for (int i = 0; i < n; i++) {
            int distance = Math.abs(midIndex - i);
            int left = distance;
            int right = n - 1 - distance;

            for (int j = 0; j < left; j++) {
                System.out.print(' ');
            }
            System.out.print('*');

            if (left != right) {
                for (int j = 0; j < (right - left - 1); j++) {
                    System.out.print(' ');
                }
                System.out.print('*');
            }
            System.out.println();
        }
    }


    //TASK 3: 循环
    static int Fibonacci1(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException(ILLEGAL_PARAMETER);
        }

        if (n == 1 || n == 2) {
            return 1;
        } else {
            int result = 0;
            int a = 1;
            int b = 1;
            for (int i = 2; i < n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }

    //TASK 3: 递归
    static int Fibonacci2(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException(ILLEGAL_PARAMETER);
        }

        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci2(n - 1) + Fibonacci2(n - 2);
        }
    }




    //TASK 4: 汉诺塔
    /*
    运用递归方法：
    首先借助C柱将n-1个铁饼按顺序从A运送到B
    再将第n个从A运送到C
    再借助A柱将n-1个铁饼按顺序从B运送到C
     */
    static void hanoi(int n){
        move(n, "A","B","C");
    }

    private static void move(int n, String from, String support, String to) {
        if (n == 1) {
            System.out.println(from + "->" + to);
            return;
        }

        move(n - 1, from, to, support);
        System.out.println(from + "->" + to);
        move(n - 1, support, from, to);
    }

    public static void main(String[] args) {
        int i = Fibonacci2(4);
    }
}
