package org.springframework.qzb.start;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;

import java.io.IOException;

/**
 * MetadataApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-03 09:44:46
 */
public class MetadataApplication {

	public static void main(String[] args) throws IOException {
		SimpleMetadataReaderFactory readerFactory = new SimpleMetadataReaderFactory();
		MetadataReader metadataReader = readerFactory.getMetadataReader("org.springframework.qzb.entity.UserEntity");
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		System.out.println(classMetadata.getClassName());
		// 可以解析到运行时的注解
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		for (String annotationType : annotationMetadata.getAnnotationTypes()) {
			System.out.println(annotationType);
		}
	}

}
