package org.sola7.os.pyin;

/**
 * 拼音的数据源
 */
public interface PyinDataSource {


    /**
     * 得到某个词的拼音
     *
     * @param word
     * @return
     */
    String getPinyin(String word);


}
