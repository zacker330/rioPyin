这是一个工具包，用于汉字与拼音的互转。
-------------------------------------

说太多没用，直接看代码：


    @Test
    public void test() throws IOException {

        //拼音数据源
        File root = new File(ClassLoader.getSystemResource("").getFile());
        InputStream in = new FileInputStream(new File(root, "pinyin.properties"));
        PyinDataSource source = new PropertiesPyinDataSource(in);

        //分词器
        Segmentationer segmentationer = new IKSegmentationer();

        String result = PyinConventor.create(source, segmentationer, "金石为开").withToneMark().generatePinyin();

        assertEquals("jīnshíwèikāi", result);
    }

这里要说明一下：
* 拼音数据源：目前负责将传入的汉字转成拼音，而源可以有很多种：从数据库里读，从properties里读，你可以根据自己的需要进行实现。
* 分词器：汉字有很多多音字，在不同的词里，会有不同的音，所以需要分词后，再查那个汉字的拼音。 `Segmentationer`也是一个接口而已。本库中默认使用IKAnalyzer分词系统。
由于IKAnalyzer没有放在maven中央仓储，所以需要加到本地中：

`mvn install:install-file -Dfile=ikanalyzer jar包路径 -DgroupId=org.wltea.ik-analyzer -DartifactId=ik-analyzer -Dversion=3.2.8 -Dpackaging=jar
`














