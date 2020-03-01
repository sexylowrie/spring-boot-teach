package xin.sunce.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 测试自动配置类
 *
 * @author lowrie
 * @date 2020-02-03
 */
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties({TestProperties.class})
public class TestAutoConfiguration {

    @Resource
    private TestProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "test", value = "enabled", havingValue = "true")
    public TestService testService() {
        return new TestService(properties);
    }


}
