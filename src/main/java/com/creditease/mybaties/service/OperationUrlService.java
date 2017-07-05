package com.creditease.mybaties.service;

import com.creditease.mybaties.Utils.ResoultInfo;
import com.creditease.mybaties.Utils.ResoultInfos;
import com.creditease.mybaties.model.UrlInfoModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by songzhiheng on 2017/6/29.
 */
public interface OperationUrlService {

    ResoultInfo insertUrl(UrlInfoModel parameter);

    ResoultInfos selectByProjectName(UrlInfoModel urlInfoModel);


}
