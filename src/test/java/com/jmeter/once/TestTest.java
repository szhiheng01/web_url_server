package com.jmeter.once;

import com.creditease.mybaties.Utils.ResoultInfo;
import com.creditease.mybaties.dao.UrlInfoMapper;
import com.creditease.mybaties.model.UrlInfoModel;
import com.creditease.mybaties.service.Impl.OperationUrlServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext/ApplicationContext.xml"})
public class TestTest {


    @Autowired
    private OperationUrlServiceImpl operationUrlService;

    @Autowired
    private UrlInfoMapper urlInfoMapper;


    @Test
    public void testSout(){
        System.out.printf("aaaa");
    }



    @Test
    public void aaa(){
        UrlInfoModel urlInfoModel = new UrlInfoModel();
        urlInfoModel.setProjectname("aaaaaaaa");
        urlInfoModel.setUrlname("wefewf");
//        OperationUrlServiceImpl operationUrlService = new OperationUrlServiceImpl();
        ResoultInfo resoultInfo = operationUrlService.insertUrl(urlInfoModel);
        System.out.printf("resoultInfo = " + resoultInfo);
    }

    @Test
    public void testSout3(){
        UrlInfoModel urlInfoModel = new UrlInfoModel();
        urlInfoModel.setProjectname("aaaaaaaa");
        urlInfoModel.setUrlname("wefewf");
        int num = urlInfoMapper.insert(urlInfoModel);

    }






    @Test
    public void testSout1(){

        ResoultInfo resoultInfo = new ResoultInfo();
        resoultInfo.setCode(1);
        resoultInfo.setMessage("aaaa");
        System.out.printf("resoultInfo = " + resoultInfo);


    }




}
