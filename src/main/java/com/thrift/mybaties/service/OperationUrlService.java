package com.thrift.mybaties.service;

import com.thrift.mybaties.Utils.ResoultInfo;
import com.thrift.mybaties.Utils.ResoultInfos;
import com.thrift.mybaties.model.UrlInfoModel;

/**
 * Created by songzhiheng on 2017/6/29.
 */
public interface OperationUrlService {

    ResoultInfo insertUrl(UrlInfoModel parameter);

    ResoultInfos selectByProjectName(UrlInfoModel urlInfoModel);


}
