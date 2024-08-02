package org.springframework.qzb.server;

import org.springframework.beans.SimpleTypeConverter;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.qzb.entity.UserEntity;

/**
 * TypeConverer.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-02 22:35:14
 */
public class StringToUserTypeConverter {

	public static void main(String[] args) {
		SimpleTypeConverter converter = new SimpleTypeConverter();
//		converter.registerCustomEditor(UserEntity.class, new StringToUserPropertyEditor());
		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new StringToUserConverter());
		converter.setConversionService(conversionService);
		UserEntity user = converter.convertIfNecessary("123;张三", UserEntity.class);
		System.out.println(user);
	}

}
