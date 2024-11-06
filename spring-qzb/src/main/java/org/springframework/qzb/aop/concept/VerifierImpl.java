package org.springframework.qzb.aop.concept;

public class VerifierImpl implements Verifier {

	@Override
	public boolean validate(String password) {
		System.out.println("Verifier.validate方法执行: " + password);
		return "123".equals(password);
	}

}
