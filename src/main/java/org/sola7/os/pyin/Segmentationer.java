package org.sola7.os.pyin;

/**
 * 分词器
 * Date: 13-5-27
 * Time: 下午2:22
 */
public interface Segmentationer {


    /**
     * 进行分词
     *
     * @return
     */
    String[] segmentation();

    /**
     * 进行分词
     *
     * @return
     */
    String[] segmentation(String source);
}
