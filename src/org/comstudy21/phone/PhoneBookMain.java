package org.comstudy21.phone;

import java.io.IOException;

public class PhoneBookMain {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		System.out.println("--------------- 주 소 록 ---------------");
		R.phoneController.action(); //재귀호출에 의해서 반복됨.
	}

}
