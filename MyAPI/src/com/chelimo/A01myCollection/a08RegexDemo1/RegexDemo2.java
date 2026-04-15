package com.chelimo.A01myCollection.a08RegexDemo1;

public class RegexDemo2 {
    public static void main(String[] args) {
        //public boolean matches(String regex)

        //只能是abc
        System.out.println("--------1--------");
        System.out.println("a".matches( "[abc]"));// true
        System.out.println("z".matches("[abc]"));// false
        System.out.println("ab".matches("[abc]"));// false --- 因为中括号中只能出现一个。可以像下面这么写
        System.out.println("ab".matches("[abc][abc]"));//true

        //不能出现abc
        System.out.println("-----------2-------------");
        System.out.println("a".matches( "[^abc]"));// false
        System.out.println("z".matches( "[^abc]"));// true
        System.out.println("zz".matches("[^abc]"));//false
        System.out.println("zz".matches("[^abc][^abc]"));//true

        //a到z A到z(包括头尾的范围)
        System.out.println("------3-------------");
        System.out.println("a".matches( "[a-zA-Z]"));// true
        System.out.println("z".matches( "[a-zA-Z]"));// true
        System.out.println("aa".matches("[a-zA-Z]"));//false
        System.out.println("zz".matches("[a-zA-Z]"));//false
        System.out.println("e".matches("[a-zA-Z]"));//false

        //[a-d[m-p]] a到d，或m到p
        System.out.println("-----4----------");
        System.out.println("a".matches(  "[a-d[m-p]]")); //true
        System.out.println("d".matches( "[a-d[m-p]]"));//true
        System.out.println("m".matches( "[a-d[m-p]]"));//true
        System.out.println("p".matches( "[a-d[m-p]]"));//true
        System.out.println("e".matches( "[a-d[m-p]]"));//false
        System.out.println("e".matches( "[a-d[m-p]]"));//false

        // [a-z&&[def]]a-z和def的交集。为:d，e，f
        //细节:如果要求两个范围的交集，那么需要写符号&&
        //如果写成了一个&，那么此时&表示就不是交集了，而是一个简简单单的&号
        System.out.println("-------5---------");
        System.out.println("a".matches( "[a-z&[def]]"));//true
        System.out.println("&".matches( "[a-z&[def]]")); //true--是不是a到z之间，是不是&符号，是不是def
        System.out.println("d".matches( "[a-z&&[def]]"));//true
        System.out.println("".matches( "[a-z&&[def]]"));//false

        // [a-z&&[^bc]] a-z和非bc的交集。(等同于[ad-z])
        System.out.println("-----6----------");
        System.out.println("a".matches("[a-z&&[^bc]]"));//true
        System.out.println("b".matches("[a-z&&[^bc]]"));//false
        System.out.println("o".matches("[a-z&&[^bc]]"));//false

        //[a-z&&[^m-p]] a到z和除了m到p的交集。(等同于[a-1q-z])
        System.out.println("-----7---------");
        System.out.println("a".matches( "[a-z&&[^m-p]]"));//true
        System.out.println("m".matches("[a-z&&[^m-p]]"));//false
        System.out.println("e".matches("[a-z&&[^m-p]]"));//false

    }
}
