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
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sourceTime);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
