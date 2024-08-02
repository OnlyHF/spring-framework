package org.springframework.qzb.server;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.qzb.entity.UserEntity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * StringToUserConverter.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-02 22:18:39
 */
public class StringToUserConverter implements ConditionalGenericConverter {

	/**
	 * 类型匹配.
	 *
	 * @param sourceType the type descriptor of the field we are converting from
	 * @param targetType the type descriptor of the field we are converting to
	 * @return
	 */
	@Override
	public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
		return sourceType.getType().equals(String.class) && targetType.getType().equals(UserEntity.class);
	}

	/**
	 * 类型转换Type.
	 *
	 * @return
	 */
	@Override
	public Set<ConvertiblePair> getConvertibleTypes() {
		return Collections.singleton(new ConvertiblePair(String.class, UserEntity.class));
	}

	/**
	 * 类型转换逻辑.
	 *
	 * @param source the source object to convert (may be {@code null})
	 * @param sourceType the type descriptor of the field we are converting from
	 * @param targetType the type descriptor of the field we are converting to
	 * @return
	 */
	@Override
	public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		String value = (String) source;
		List<String> list = Arrays.asList(value.split(";"));
		UserEntity user = new UserEntity(list.get(0), list.get(1));
		return user;
	}

	public static void main(String[] args) {
		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new StringToUserConverter());
		UserEntity userEntity = conversionService.convert("123123;张三", UserEntity.class);
		System.out.println(userEntity);
	}

}
