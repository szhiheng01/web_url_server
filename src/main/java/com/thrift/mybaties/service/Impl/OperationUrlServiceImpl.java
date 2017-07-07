package com.thrift.mybaties.service.Impl;

import com.thrift.mybaties.Utils.ResoultInfo;
import com.thrift.mybaties.Utils.ResoultInfos;
import com.thrift.mybaties.dao.UrlInfoMapper;
import com.thrift.mybaties.model.UrlInfoModel;
import com.thrift.mybaties.service.OperationUrlService;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by songzhiheng on 2017/6/29.
 */
@Service
public class OperationUrlServiceImpl implements OperationUrlService {

    private static final Logger logger = Logger.getLogger(OperationUrlServiceImpl.class);

    @Autowired
    private UrlInfoMapper urlInfoMapper;

    public ResoultInfo insertUrl1(UrlInfoModel urlInfoModel) {
        ResoultInfo resoultInfo = null;
        int insertCount;
        try {
            resoultInfo = new ResoultInfo();
            if (urlInfoModel == null || StringUtils.isBlank(urlInfoModel.getProjectName()) || StringUtils.isBlank(urlInfoModel.getUrlName())) {
                resoultInfo.setCode(0);
                resoultInfo.setStatus("false");
                resoultInfo.setMessage("插入失败～～");
                logger.info("null失败");
                logger.info("urlInfoModel = " + urlInfoModel);
            }
            try {
                insertCount = urlInfoMapper.insert(urlInfoModel);
                logger.info("insertCount = " + insertCount);

                if (insertCount == 0) {
                    resoultInfo.setCode(0);
                    resoultInfo.setStatus("false");
                    logger.info("插入为0失败");
                    resoultInfo.setMessage("插入失败～～");
                } else {
                    resoultInfo.setCode(1);
                    resoultInfo.setStatus("true");
                    resoultInfo.setMessage("插入成功～～");
                }
                logger.info("resoultInfo = " + resoultInfo);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            resoultInfo.setCode(0);
            resoultInfo.setStatus("false");
            logger.info("catch失败～～～");
            resoultInfo.setMessage("插入失败～～");
        }
        return resoultInfo;
    }

    public ResoultInfo insertUrl(UrlInfoModel urlInfoModel) {
        ResoultInfo resoultInfo = new ResoultInfo();
        int insertCount;
        boolean flag = true;
        try {
            if (urlInfoModel == null || StringUtils.isBlank(urlInfoModel.getProjectName()) || StringUtils.isBlank(urlInfoModel.getUrlName())) {
                flag = false;
            } else {
                if (urlInfoModel.getCreattime() == null || urlInfoModel.getUpdateime() == null){
                    urlInfoModel.setCreattime(new Date());
                    urlInfoModel.setUpdateime(new Date());
                }
                insertCount = urlInfoMapper.insert(urlInfoModel);
                logger.info("insertCount = " + insertCount);
                if (insertCount == 0) {
                    flag = false;
                }
            }
            if (flag) {
                resoultInfo.setCode(1);
                resoultInfo.setStatus("true");
                resoultInfo.setMessage("插入成功～～");
            } else {
                resoultInfo.setCode(0);
                resoultInfo.setStatus("false");
                resoultInfo.setMessage("插入失败～～");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resoultInfo;
    }

    public ResoultInfos selectByProjectName(UrlInfoModel urlInfoModel) {

        ResoultInfos resoultInfos = null;
        boolean flag = true;
        try {
            if (urlInfoModel == null || StringUtils.isBlank(urlInfoModel.getProjectName()))
                flag = false;
            List<UrlInfoModel> selectProjectList = urlInfoMapper.selectByProjectName(urlInfoModel.getProjectName());
            if (selectProjectList.size() == 0 || selectProjectList.isEmpty()) {
               flag = false;
            }
            if (flag){
                resoultInfos.setCode(0);
                resoultInfos.setMessage("查询成功～～");
                resoultInfos.setStatus("true");
                resoultInfos.setList(selectProjectList);
            }else {
                resoultInfos.setCode(0);
                resoultInfos.setMessage("查询为空～～");
                resoultInfos.setStatus("false");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resoultInfos;
    }

}
