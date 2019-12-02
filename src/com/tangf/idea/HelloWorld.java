package com.tangf.idea;

import java.util.*;

public class HelloWorld {
    public static final String Custom = "God";
    // 客户id
    private int id = 123;
    // 客户姓名
    private String name = "zhangnsan";
    

    public static void main(String[] args) {
        int num = 10;
        System.out.println("num = " + num);

        String[] names = new String[]{"tony", "jack", "tom"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (String name : names) {
            System.out.println("name = " + name);
        }
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println("name = " + name);
        }

        ArrayList<Integer> al = new ArrayList<>();
        al.add(123);
        al.add(234);
        al.add(345);
        al.add(456);
        for (Integer integer : al) {
            System.out.println("integer = " + integer);
        }
        for (int i = al.size() - 1; i >= 0; i--) {
            System.out.println("al.get(i) = " + al.get(i));
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");

        for (int i = 0; i < list.size(); i++) {
        }

    }

}
