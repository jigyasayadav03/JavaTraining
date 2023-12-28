package com.Junit.dummyTest;

import com.Junit.test_Doubles.dummy.EmailService;

public class DummyEmailService implements EmailService {
	@Override
	public void sendEmail(String message) {
		throw new AssertionError("Method not implemented !!!");
	}
}