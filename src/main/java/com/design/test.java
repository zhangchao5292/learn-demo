
package com.design;

/**
 * @author chao.zhang
 */
public class test {

    public static void main(String[] args) {
        System.out.println(check(16));
    }

    public static int check(int n) {
        if (n >= 1 && n <= Math.pow(2, 31)) {
            if (n % 2 != 0) {
                int num = n / 2;
                if (num > 0 && num != 1) {
                    check(num);
                    return num;
                }
            }
        }
        return 0;
    }

}
