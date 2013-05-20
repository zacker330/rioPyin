package org.sola7.os.pyin;

/**
 * 拼音的数据源
 */
public interface PyinDataSource {


    /**
     * 得到简体字的拼音
     * @param hani
     * @return
     */
    String getPinyin(char hani);





}
