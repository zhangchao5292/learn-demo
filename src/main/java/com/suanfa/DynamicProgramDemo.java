package com.suanfa;

/**
 * @description: 动态规划
 * 1.存在「重叠子问题
 * 2.具备「最优子结构」
 * 3.正确的「状态转移方程」
 * <p>
 * 明确 base case -> 明确「状态」-> 明确「选择」 -> 定义 dp 数组/函数的含义。
 * # 初始化 base case
 * dp[0][0][...] = base
 * # 进行状态转移
 * for 状态1 in 状态1的所有取值：
 * for 状态2 in 状态2的所有取值：
 * for ...
 * dp[状态1][状态2][...] = 求最值(选择1，选择2...)
 **/
public class DynamicProgramDemo {


    public static void main(String[] args) {
        //    斐波那契数列问题(兔子繁殖)
//        System.out.println(getTotal(10));
        System.out.println(getDPTotal(10));


    }


    /**
     * 递归方法求解题
     * 「自顶向下」
     * 时间复杂度：O(2^n)，指数级别，爆炸
     *
     * @param n
     * @return
     */
    public static int getTotal(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return getTotal(n - 1) + getTotal(n - 2);
    }

//    动态规划
//    「自底向上」
    public static int getDPTotal(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[n];
    }


}