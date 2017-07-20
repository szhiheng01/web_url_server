package com.creditease.mybaties.controller;

import com.creditease.mybaties.Utils.ResoultInfo;
import com.creditease.mybaties.Utils.TimeUtils;
import com.creditease.mybaties.model.UrlInfoModel;
import com.creditease.mybaties.service.OperationUrlService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Created by songzhiheng on 2017/6/29.
 */

@Controller
@RequestMapping("/web")
public class OperationUrlController {

    private static final Logger logger = Logger.getLogger(OperationUrlController.class);
    @Autowired
    OperationUrlService operationUrlService;

    @RequestMapping(value = "/insertUrl",method = RequestMethod.POST)
    @ResponseBody
    public String insertUrl(@RequestBody String requestBody){
        String res="";
        logger.info("requestBody = " + requestBody);
        if (requestBody ==null || requestBody.length() ==0){
            return  requestBody;
        }
        ResoultInfo resoultInfo = new ResoultInfo();
        ObjectMapper mapper = new ObjectMapper();
        try {
            UrlInfoModel urlInfoModel = mapper.readValue(requestBody,UrlInfoModel.class);
            logger.info("urlInfoModel = " + urlInfoModel.toString());
            resoultInfo = operationUrlService.insertUrl(urlInfoModel);
            logger.info("resoultInfo" + resoultInfo);
        }catch (IOException e){
            logger.info("mapper转换失败！！！！");
            e.printStackTrace();

        }
        logger.info("resoultInfo = " + resoultInfo.toString());
        try {
             res= mapper.writeValueAsString(resoultInfo);
             logger.info("res = " + res);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return res;
    }

}
