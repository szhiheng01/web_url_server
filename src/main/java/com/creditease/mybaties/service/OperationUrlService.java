package com.creditease.mybaties.service;

import com.creditease.mybaties.Utils.ResoultInfo;
import com.creditease.mybaties.model.UrlInfoModel;

/**
 * Created by songzhiheng on 2017/6/29.
 */

public interface OperationUrlService {

    ResoultInfo insertUrl(UrlInfoModel parameter);

    UrlInfoModel selectUrl(UrlInfoModel urlId);


}
