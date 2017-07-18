package com.thrift.mybaties.Utils;

import org.junit.Test;
import org.springframework.core.convert.converter.Converter;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by songzhiheng on 2017/7/15.
 */
public class Timeconverter implements Converter<String,Date>{


    @Override
    public Date convert(String sourceTime) {
        try{
            Date date = new SimpleDateFormat("0:yyyy-MM-dd HH:mm:ss").parse(sourceTime);
            Timestamp t1 = new Timestamp(date.getTime());
            System.out.println(t1);
            return t1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Test
    public void aaa(){
        new Timeconverter().convert("2017-07-17 11:49:45");
    }
}
