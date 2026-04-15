package com.chelimo.A01myCollection.a07Test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        /*
        判断任意的一个年份是闰年还是平年
        要求:用IDK7和IDK8两种方式判断
        提示:
        二月有29天是闰年
        一年有366天是闰年
         */

        //JDK7:
        //思路1                                   思路二
        //2000年1月1日 0:0:0                       2000年2月1日 0:0:0
        //2000年12月31日 23:59:59                  2000年3月1日 0:0:0
        //间隔 366天

        //简化1:                                  简化2：
        //我们可以把时间设置为2000年3月1日           2001年1月1日
        //再把日历往前减一天                        往前减一天
        //看当前的时间是28号还是29号?                //统计这一天是一年中的第几天 366
        //2001年1月1日
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);//month取值范围0~11   2实际上表示3月
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        if(day == 28){
            System.out.println("平年");
        }else if(day == 29){
            System.out.println("闰年");
        }

        //JDK8:
        LocalDate ld = LocalDate.of(2000,3,1);
        LocalDate localDate = ld.minusDays(1);//会创建一个新的LocalDate对象
        int day1 = localDate.getDayOfMonth();
        if(day1 == 28){
            System.out.println("平年");
        }else if(day1 == 29){
            System.out.println("闰年");
        }

        //true:闰年
        //false:平年
        System.out.println(ld.isLeapYear());


    }
}
