package test.com.imooc;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * TestClass Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ʮһ�� 8, 2018</pre>
 */
public class TestClassTest {
    private ClassPathXmlApplicationContext context;
    private String springXmlPath;

    public TestClassTest(String s) {
        this.springXmlPath = s;
    }

    @Before
    public void before() {
        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "classpath*:spring-*.xml";
        }
//        初始化容器
        context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
        //容器启动
        context.start();
        System.out.println("运行前输出");

    }

    @After
    public void after() {
        context.destroy();//容器释放
        System.out.println("运行后输出");
    }

    /**
     * 根据beanId获取
     *
     * @param beanId
     * @return
     */
    @SuppressWarnings("unchecked")
    protected <T extends Object> T getBean(String beanId) {

        return (T) context.getBean(beanId);

    }

    /**
     * 根据类获取
     *
     * @param clazz
     * @return
     */
    protected <T extends Object> T getBean(Class<T> clazz) {

        return (T) context.getBean(clazz);

    }
}
