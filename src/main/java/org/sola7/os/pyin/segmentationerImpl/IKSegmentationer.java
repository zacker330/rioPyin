package org.sola7.os.pyin.segmentationerImpl;

import org.sola7.os.pyin.Segmentationer;
import org.wltea.analyzer.IKSegmentation;
import org.wltea.analyzer.Lexeme;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;


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

    public IKSegmentationer() {
    }

    public IKSegmentationer(String sourceStr) {
        this.sourceStr = sourceStr;

    }

    public void setSourceStr(String sourceStr) {
        this.sourceStr = sourceStr;
    }

    @Override
    public String[] segmentation() {
        IKSegmentation ikSegmentation = new IKSegmentation(new StringReader(sourceStr), true);
        List<String> result = new ArrayList<String>();
        Lexeme lexeme = null;
        try {
            while ((lexeme = ikSegmentation.next()) != null) {
                String each = lexeme.getLexemeText();
                result.add(each);
            }
        } catch (IOException e) {
            // TODO
            throw new RuntimeException(e);
        }

        return result.toArray(new String[result.size()]);
    }

    @Override
    public String[] segmentation(String source) {
        sourceStr = source;
        return this.segmentation();
    }
}
