package com.creditease.mybaties.controller;

import com.creditease.mybaties.Utils.ResoultInfo;
import com.creditease.mybaties.Utils.ResoultInfos;
import com.creditease.mybaties.dao.UrlInfoMapper;
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
            logger.info("urlModdle = " + urlInfoModel);
            resoultInfo = operationUrlService.insertUrl(urlInfoModel);
            logger.info("resoultInfo" + resoultInfo);
        }catch (IOException e){
            logger.info(e);
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

    @RequestMapping(value = "/selectUrl",method = RequestMethod.POST)
    @ResponseBody
    public String selectByProjectName(@RequestBody String requestBody){

        String res="";
        logger.info("requestBody = " + requestBody);
        if (requestBody ==null || requestBody.length() ==0){
            logger.info("requestBody = " + requestBody);
            return  requestBody;
        }
        logger.info("requestBody = " + requestBody);
        ObjectMapper mapper = new ObjectMapper();
        ResoultInfos resoultInfos = new ResoultInfos();

        try {
            UrlInfoModel urlInfoModel = mapper.readValue(requestBody,UrlInfoModel.class);
            resoultInfos = operationUrlService.selectByProjectName(urlInfoModel);
            logger.info("resoultInfos = " + resoultInfos);
        }catch (Exception e){
            logger.info("e = " + e);
        }

        try {
            res= mapper.writeValueAsString(resoultInfos);
            logger.info("res = " + res);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return res;
    }



}
