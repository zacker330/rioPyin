package org.sola7.os.pyin.segmentationerImpl;

import org.sola7.os.pyin.Segmentationer;

/**
 * IKAnalyzer分词器
 * Date: 13-5-27
 * Time: 下午2:23
 */
public class IKSegmentationer implements Segmentationer {

    /**
     * 分词的源文本
     */
    private String sourceStr;

    public IKSegmentationer(String sourceStr) {
        this.sourceStr = sourceStr;

    }
}
