package com.chelimo.A01myCollection.a02SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        /* 需求:
        秒杀活动:
        开始时间:2023年11月11日0:0:0
        结束时间:2023年11月11日0:10:0
        小贾下单并付款的时间为:2023年11月11日0:01:00
        小皮下单并付款的时间为:2023年11月11日0:11:0
        用代码说明这两位同学有没有参加上秒杀活动?
        */

        //1.定义三个时间
        String startTime = "2023年11月11日 0:0:0";
        String endTime = "2023年11月11日 0:10:0";
        String payTime = "2023年11月11日 0:11:0";
        //date是对象不可以直接比较 转化成毫秒值(.getTime)
        //先获取三个字符串的Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate =sdf.parse(startTime);
        Date endDate =sdf.parse(endTime);
        Date payDate =sdf.parse(payTime);
        long sTime = startDate.getTime();
        long eTime = endDate.getTime();
        long pTime = payDate.getTime();
        if(sTime <= pTime && eTime >= pTime) {
            System.out.println("肯德基一元秒杀成功");
        }else{
            System.out.println("肯德基一元秒杀失败");
        }
    }
}
