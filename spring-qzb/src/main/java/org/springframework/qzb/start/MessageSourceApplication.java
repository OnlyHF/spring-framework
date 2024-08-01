package org.springframework.qzb.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qzb.config.StartConfig;

import java.util.Locale;

/**
 * MessageSourceApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-01 22:58:16
 */
public class MessageSourceApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartConfig.class);
		System.out.println(context.getMessage("name", null, new Locale("zh")));
		System.out.println(context.getMessage("name", null, new Locale("en")));
	}

}
