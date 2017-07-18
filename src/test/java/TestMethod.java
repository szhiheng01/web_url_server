import com.thrift.mybaties.dao.UrlInfoMapper;
import com.thrift.mybaties.model.UrlInfoModel;
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

    @Autowired
    private UrlInfoMapper operationUrl;

    @Test
    public void test() {

        UrlInfoModel urlInfoModel = new UrlInfoModel();
        urlInfoModel.setProjectname("aaaa");
        urlInfoModel.setUrlname("pppp");


    }


}
