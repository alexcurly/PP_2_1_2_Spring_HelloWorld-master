import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        var helloworld =
                applicationContext.getBean("helloworld", HelloWorld.class);

        var catFirst = applicationContext.getBean("cat", Cat.class);

        var catSecond = applicationContext.getBean("cat", Cat.class);

        System.out.println(bean == helloworld);

        System.out.println(catFirst == catSecond);
    }
}