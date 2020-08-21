package com.a.custservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author MeepoGuan
 *
 * <p>Description: 入口</p>
 *
 * 2017年4月29日
 *
 */
@SpringBootApplication
@MapperScan("com.a.custservice.mapper")
public class Application extends SpringBootServletInitializer{
	  public static void main( String[] args )
	    {
	        SpringApplication.run(Application.class, args);
	    }
	  
//	  protected SpringApplicationBuilder configure(
//	            SpringApplicationBuilder application) {
//	        return application.sources(Application.class);
//	    }
		/**
		 * 所有配置信息的入口
		 */
		protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
			return super.configure(builder);
		}
}
