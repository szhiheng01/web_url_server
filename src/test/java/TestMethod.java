import com.creditease.mybaties.Utils.ResoultInfo;
import com.creditease.mybaties.Utils.TimeUtils;
import com.creditease.mybaties.dao.UrlInfoMapper;
import com.creditease.mybaties.model.UrlInfoModel;
import com.creditease.mybaties.service.Impl.OperationUrlServiceImpl;
import com.creditease.mybaties.service.OperationUrlService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by songzhiheng on 2017/7/5.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext/ApplicationContext.xml"})
public class TestMethod {
    private static final Logger logger = Logger.getLogger(TestMethod.class);

    @Autowired
    private UrlInfoMapper operationUrl;
    @Autowired
    private OperationUrlServiceImpl operationUrlService;

    @Test
    public void insertTest() {
        UrlInfoModel urlInfoModel = new UrlInfoModel();
        urlInfoModel.setProjectname("aaaa");
        urlInfoModel.setUrlname("pppp");
        urlInfoModel.setCreattime(TimeUtils.getStringDate());
        int num = operationUrl.insert(urlInfoModel);
        logger.info("num = " + num );

    }

    @Test
    public void selectTest() {

        UrlInfoModel urlInfoModel = new UrlInfoModel();
        urlInfoModel.setUrlname("pppp");
        List<UrlInfoModel> num = operationUrl.selectByUrlName(urlInfoModel.getUrlname());
        for (UrlInfoModel urlInfo : num){
            logger.info("urlInfo = " + urlInfo.toString());
        }

    }























































}
