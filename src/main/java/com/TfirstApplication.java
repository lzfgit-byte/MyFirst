package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


//这是一个组合注解，包含了@Configuration,@EnableAutoConfiguration,@ComponentScan。
//@Configuration : 标识这为一个配置文件类型，可以通过@Bean注解来标注配置文件中的Bean对象
//@EnableAutoConfiguration ： 能够自动配置spring的上下文，试图猜测和配置你想要的bean类，通常会自动根据你的类路径和你的bean定义自动配置。
//@ComponentScan ： 会自动扫描指定包下的全部标有@Component的类，并注册成bean，当然包括@Component下的子注解@Service,@Repository,@Controller。
//                   前提是标注的类是当前类的子孙包中。
//@ServletComponentScan ,exclude={DataSourceAutoConfiguration.class}
/**
 * 在 SpringBootApplication 上使用@ServletComponentScan 注解后，Servlet、Filter、Listener
 * 可以直接通过 @WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码。
 * */
//@ServletComponentScan
@SpringBootApplication(scanBasePackages = { "com" })
@MapperScan(basePackages = {"com.lzf.tfirst.**.mapper"})
@EnableCaching
public class TfirstApplication {


	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		SpringApplication.run(TfirstApplication.class, args);
		System.out.println("【项目启动成功】:用时"+((System.currentTimeMillis()-sTime)/1000) + "秒");
	}

}
