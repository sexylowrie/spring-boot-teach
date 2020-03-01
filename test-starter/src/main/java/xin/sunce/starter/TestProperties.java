package xin.sunce.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 测试配置类
 *
 * @author lowrie
 * @date 2020-02-03
 */
@ConfigurationProperties(prefix = "test")
public class TestProperties {

    private String name;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
