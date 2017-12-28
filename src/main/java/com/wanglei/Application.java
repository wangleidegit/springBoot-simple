package com.wanglei;

import com.wanglei.config.MyConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;
import java.text.MessageFormat;
import java.util.Date;

/**
 * Created by Tao on 2017/12/28.
 */
@SpringBootApplication
@ImportResource("classpath:/application-context.xml")
public class Application implements CommandLineRunner{

    @Resource
    MyConfig myConfig;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println((MessageFormat.format("启动时间:{0} 配置来源{1}",new Date(),myConfig.getFrom())));
    }
}
