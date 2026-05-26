package com.brainworks.SpringProjectUsingCoreJavaKnowledge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyApplication {

	@Autowired
	private DaoLayer d;

	public void saveData() {

		DaoLayer d = new DaoLayer();
//		d.addition();
		System.out.println(d.addition());
	}

	public void divideData() {
		DaoLayer d2 = new DaoLayer();
		System.out.println(d2.Divide());
	}
}
