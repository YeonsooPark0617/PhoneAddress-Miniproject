package org.comstudy21.phone.view;

import org.comstudy21.phone.R;
import org.comstudy21.phone.model.PhoneVo;

public class PhoneInput extends PhoneView {
	@Override
	public void display() {
		System.out.println("----------- input -------------");
		System.out.println("전화번호 프로그램입니다. 이름과 전화번호를 입력해주세요");
		System.out.print("이름 입력 >> ");
		String name = scan.next();
		System.out.print("전화번호 입력 >> ");
		String phoneNumber = scan.next();
		
		R.phoneVo = new PhoneVo(0,name, phoneNumber);
		System.out.println("입력 완료!");
	}
}
