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


    /**
     * 得到繁体字的简体版本
     * @param tranditional 繁体字
     * @return
     */
    String getSimplized(char tranditional);





}
