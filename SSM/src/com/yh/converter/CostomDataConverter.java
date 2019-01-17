package com.yh.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CostomDataConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        //将日期字符串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            //转成成功直接返回
         return   simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //如果参数绑定失败返回null
        return null;
    }
}
