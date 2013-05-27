package org.sola7.os.pyin;

/**
 * 汉字转拼音的构造器
 * Date: 13-5-20
 * Time: 下午5:51
 */
public class PyinConventor {

    /**
     * 拼音与汉字的库
     */
    private PyinDataSource source;

    /**
     * 汉字
     */
    private String character;


    /**
     * 带标点符号
     */
    private boolean withToneMark = false;


    /**
     * 分词器
     */
    private Segmentationer segmentationer;

    /**
     * @param dataSource     拼音源
     * @param segmentationer 分词器
     * @param strSource      待转换的字符串
     * @return
     */
    public static PyinConventor create(PyinDataSource dataSource, Segmentationer segmentationer, String strSource) {
        PyinConventor result = new PyinConventor();
        result.source = dataSource;
        result.segmentationer = segmentationer;
        result.character = strSource;
        return result;
    }

    /**
     * 转成拼音
     *
     * @return
     */
    public String generatePinyin() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.toString();
    }


    /**
     * 带标点的拼音
     * @return
     */
    public PyinConventor withToneMark() {
        withToneMark = true;
        return this;
    }

    /**
     * 不带标点的拼音
     * @return
     */
    public PyinConventor withNoneToneMark() {
        withToneMark = false;
        return this;
    }

}
