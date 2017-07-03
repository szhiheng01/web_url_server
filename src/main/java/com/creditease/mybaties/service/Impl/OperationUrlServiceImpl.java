package com.creditease.mybaties.service.Impl;

import com.creditease.mybaties.Utils.ResoultInfo;
import com.creditease.mybaties.dao.UrlInfoMapper;
import com.creditease.mybaties.model.UrlInfoModel;
import com.creditease.mybaties.service.OperationUrlService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by songzhiheng on 2017/6/29.
 */
@Service
public class OperationUrlServiceImpl implements OperationUrlService {

    private static final Logger logger = Logger.getLogger(OperationUrlServiceImpl.class);


    @Autowired
    private UrlInfoMapper urlInfoMapper;

    @Override
    public ResoultInfo insertUrl(UrlInfoModel urlInfoModel) {

        logger.info("urlInfoModel = " + urlInfoModel);
        ResoultInfo resoultInfo = new ResoultInfo();
        if (urlInfoModel == null) {
            resoultInfo.setCode(0);
            resoultInfo.setStatus("false");
            resoultInfo.setMessage("插入失败～～");
        }
        int insertCount = urlInfoMapper.insert(urlInfoModel);
        logger.info("insertCount = " + insertCount);
        if (insertCount == 0) {
            resoultInfo.setCode(insertCount);
            resoultInfo.setStatus("true");
            resoultInfo.setMessage("插入失败～～");
        } else {
            resoultInfo.setCode(insertCount);
            resoultInfo.setStatus("true");
            resoultInfo.setMessage("插入成功～～");
        }

        logger.info("resoultInfo = " + resoultInfo);
        return resoultInfo;
    }
}
