package org.springframework.qzb.server;

import org.springframework.qzb.entity.UserEntity;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.List;

/**
 * StringToUserPropertyEditor.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-02 22:00:41
 */
public class StringToUserPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		List<String> list = Arrays.asList(text.split(";"));
		UserEntity user = new UserEntity(list.get(0), list.get(1));
		super.setValue(user);
	}

	public static void main(String[] args) {
		StringToUserPropertyEditor stringToUser = new StringToUserPropertyEditor();
		stringToUser.setAsText("123;张三");
		System.out.println(stringToUser.getValue());
	}

}
