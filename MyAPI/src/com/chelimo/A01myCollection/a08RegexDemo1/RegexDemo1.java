package com.chelimo.A01myCollection.a08RegexDemo1;

public class RegexDemo1 {
    public static void main(String[] args) {
        /*假如现在要求校验一个qq号码是否正确。
        规则:6位及20位之内，0不能在开头，必须全部是数字 先使用目前所学知识完成校验需求
        然后体验一下正则表达式检验。*/
        String QQ = "123456789";
        //System.out.println(checkQQ(QQ));

        System.out.println(QQ.matches("[1-9]\\d{5,19}"));
        //校验用户名是否满足规则
        //校验密码是否满足规则
        //校验身份证是否满足规则
        //校验手机是否满足规则

    }

    //老方法
    public static boolean checkQQ(String QQ) {
        //规则:6位及20位之内，0不能在开头，必须全部是数字
        //核心思想:
        //先把异常数据进行过滤
        //下面的就是满足要求的数据了。
        int length = QQ.length();
        if(length<6 || length>20) {
            return false;
        }
        if(QQ.startsWith("0")) {
            return false;
        }
        //或者
        //char c = QQ.charAt(0);
        for (int i = 0; i < QQ.length(); i++) {
            char c = QQ.charAt(i);
            if(c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

}
