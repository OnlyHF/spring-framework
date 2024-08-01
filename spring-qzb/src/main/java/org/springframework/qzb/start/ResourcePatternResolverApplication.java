package org.springframework.qzb.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.qzb.config.StartConfig;

import java.io.IOException;

/**
 * ResourcePatternResolverApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-02 07:42:18
 */
public class ResourcePatternResolverApplication {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartConfig.class);
		// 相对路径&绝对路径
		Resource resource = context.getResource("classpath:spring.xml");
		System.out.println(resource.getFile().getName());
		System.out.println(context.getResource("file:/Users/mac/qianzb/self/workspace/spring-framework/README.md").getFile().getName());
	}

}
