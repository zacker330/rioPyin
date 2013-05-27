package org.sola7.os.pyin.datasourcesImpl;

import org.sola7.os.pyin.PyinDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 从Properties读取字库的数据源
 */
public class PropertiesPyinDataSource implements PyinDataSource {


    private Properties properties = new Properties();

    private PropertiesPyinDataSource() {

    }

    public PropertiesPyinDataSource(InputStream in) throws IOException {
        properties.load(in);
    }

    @Override
    public String getPinyin(String word) {
        String pinyin = properties.getProperty(word);
        if (null != pinyin || "null".equals(pinyin)) {
            return pinyin;
        }
        StringBuilder builder = new StringBuilder();
        for (char ch : word.toCharArray()) {
            String each = properties.getProperty(ch + "", ch + "");
            builder.append(each);
        }
        return builder.toString();


    }

}
