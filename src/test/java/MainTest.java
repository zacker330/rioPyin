import org.junit.Test;
import org.sola7.os.pyin.PyinDataSource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-20
 * Time: 上午6:07
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    @Test
    public void test(){

        PyinDataSource source = new PropertiesPyinDataSource();
        PyinBuilder.create().setSource(source).character("金石为开").withToneMark().generatePinyin();
    }

}
