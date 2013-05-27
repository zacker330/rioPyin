import org.junit.Test;
import org.sola7.os.pyin.PyinConventor;
import org.sola7.os.pyin.PyinDataSource;
import org.sola7.os.pyin.datasourcesImpl.PropertiesPyinDataSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

/**
 * Date: 13-5-20
 * Time: 上午6:07
 */
public class MainTest {

    @Test
    public void test() throws IOException {

        File root = new File(ClassLoader.getSystemResource("").getFile());

        System.out.println(new File(ClassLoader.getSystemResource("").getFile(), "pinyin.properties").getAbsoluteFile());
        InputStream in = new FileInputStream(new File(root, "pinyin.properties"));
        PyinDataSource source = new PropertiesPyinDataSource(in);
        String result = PyinConventor.create().setSource(source).character("金石为开").withToneMark().generatePinyin();
        assertEquals("jīnshíwèikāi", result);
    }

}
