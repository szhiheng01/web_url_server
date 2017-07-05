import com.creditease.mybaties.Utils.ResoultInfo;
import com.creditease.mybaties.dao.UrlInfoMapper;
import com.creditease.mybaties.model.UrlInfoModel;
import com.creditease.mybaties.service.OperationUrlService;
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
@ContextConfiguration(locations = {"classpath:ApplicationContext/ApplicationContext.xml", "classpath:ApplicationContext/Spring-mybaties.xml"})
public class TestMethod {

    @Autowired
    private UrlInfoMapper operationUrl;

    @Test
    public void test() {

        UrlInfoModel urlInfoModel = new UrlInfoModel();
        urlInfoModel.setProjectName("aaaa");
        urlInfoModel.setUrlName("pppp");
        List<UrlInfoModel> list = operationUrl.selectByProjectName(urlInfoModel.getProjectName());
        for (UrlInfoModel urlInfo : list){
            System.out.println("aaaaavbsfwfwefewfewfewfewfwefewfewfwefwef = " + urlInfo.toString());

        }


    }


}
