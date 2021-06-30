package com.design;

/**
 * @description: 做饭抽象类
 * @author: chao.zhang
 * @create: 2021-05-25 19:00
 **/
public abstract class CookTemplate {

    protected final void cookProcess() {
        //第一步：倒油
        this.pourOil();
        //第二步：热油
        this.HeatOil();
        //第三步：倒蔬菜
        this.pourVegetable();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }

    //第一步：倒油是一样的，所以直接实现
    protected void pourOil() {
        System.out.println("倒油");
    }

    //第二步：热油是一样的，所以直接实现
    void HeatOil() {
        System.out.println("热油");
    }

    //第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
    public abstract void pourVegetable();

    //第四步：倒调味料是不一样的（一个下辣椒，一个是下蒜蓉）
    public abstract void pourSauce();

    void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }

}
