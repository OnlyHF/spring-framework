package org.springframework.qzb.start;

import org.springframework.qzb.server.*;
import org.springframework.util.MethodInvoker;

/**
 * Demo.
 *
 * @Author qzb0212@126.com
 * @Date 2024-10-03 11:24:59
 */
public class Demo {

	public static void main(String[] args) {
		Object[] objects = new Object[]{new A()};

// 0
		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{A.class}, objects));

// 2
		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{B.class}, objects));

// 4
		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{C.class}, objects));

// 1
		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{D.class}, objects));

		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{E.class}, objects));
	}

}
