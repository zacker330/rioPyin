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


    //需要加入分词算法

    public static PyinConventor create(PyinDataSource source) {
        PyinConventor conventor = create();
        conventor.source = source;
        return conventor;
    }


    public static PyinConventor create() {
        return new PyinConventor();
    }

    /**
     * 转成拼音
     *
     * @return
     */
    public String generatePinyin() {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : character.toCharArray()) {
            stringBuilder.append(source.getPinyin());
        }
        return stringBuilder.toString();
    }

    /**
     * 设置数据源
     *
     * @param source
     * @return
     */
    public PyinConventor setSource(PyinDataSource source) {
        this.source = source;
        return this;
    }

    public PyinConventor character(String character) {
        this.character = character;
        return this;
    }

    public PyinConventor withToneMark() {
        withToneMark = true;
        return this;
    }


}
