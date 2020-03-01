package xin.sunce.starter;

/**
 * 测试Service
 *
 * @author lowrie
 * @date 2020-02-04
 */
public class TestService {

    public TestService(TestProperties properties) {
        this.properties = properties;
    }

    private TestProperties properties;

    public TestProperties getProperties() {
        return properties;
    }

    public void setProperties(TestProperties properties) {
        this.properties = properties;
    }

    public String test() {
        return properties.getName() + "," + properties.getDate();
    }
}
