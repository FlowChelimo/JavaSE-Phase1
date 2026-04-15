package com.chelimo.A01myCollection.a11Crawler3;

public class RegexDemo2 {
    public static void main(String[] args) {
        //public string replaceAll(String regex,String newStr):     按照正则表达式的规则进行替换
        //public string[]split(String regex):                       按照正则表达式的规则切割字符串

        /*
        有一段字符串:小诗诗dqwefqwfqwfwg12312小丹丹dqwefqwfqwfwg12312小惠惠
        要求1:把字符串中三个姓名之间的字母替换为vs
        要求2:把字符串中的三个姓名切割出来
         */
        String s = "小诗诗dqwefqwfqwfwg12312小丹丹dqwefqwfqwfwg12312小惠惠";
        //细节:
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就用第二个参数去替换。
        String regex1 = "[\\w&&[^_]]+";
        String s1 = s.replaceAll(regex1, "vs");
        System.out.println(s1);

        String [] arr = s.split(regex1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
