import org.junit.Ignore;
import org.junit.Test;
import org.sola7.os.pyin.PyinConventor;
import org.sola7.os.pyin.PyinDataSource;
import org.sola7.os.pyin.Segmentationer;
import org.sola7.os.pyin.datasourcesImpl.PropertiesPyinDataSource;
import org.sola7.os.pyin.segmentationerImpl.IKSegmentationer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Date: 13-5-20
 * Time: 上午6:07
 */
public class MainTest {

    /**
     * 测试分词系统
     */
    @Test
    public void testSegmentation() {


        String sourceStr = "ikanalyzer是一个开源的基于java | 语言开发的轻量级的中" +
                "文分词工具包从2006年12月推出1.0版开始ikanalyzer已经推" +
                "出了3个大版本";

        //分词器
        Segmentationer segmentationer = new IKSegmentationer(sourceStr);
        String[] result = segmentationer.segmentation();

        assertEquals(result[0], "ikanalyzer");
        assertEquals(result[1],"是");
        assertEquals(result[2],"一个");
        assertEquals(result[3],"开源");
        assertEquals(result[4],"的");
        assertEquals(result[5],"基于");
        assertEquals(result[6],"java");
        assertEquals(result[7],"语言");
        assertEquals(result[8],"开发");
        assertEquals(result[8],"开发");











    }


    @Ignore
    @Test
    public void test() throws IOException {
        File root = new File(ClassLoader.getSystemResource("").getFile());
        System.out.println(new File(ClassLoader.getSystemResource("").getFile(), "pinyin.properties").getAbsoluteFile());
        InputStream in = new FileInputStream(new File(root, "pinyin.properties"));
        //拼音数据源
        PyinDataSource source = new PropertiesPyinDataSource(in);

        //分词器
        Segmentationer segmentationer = new IKSegmentationer();

        String result = PyinConventor.create().setSegmentationer(segmentationer).setSource(source).character("金石为开").withToneMark().generatePinyin();
        assertEquals("jīnshíwèikāi", result);
    }

}
