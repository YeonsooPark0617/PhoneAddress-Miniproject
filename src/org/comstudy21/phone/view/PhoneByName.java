package org.comstudy21.phone.view;

import org.comstudy21.phone.R;
import org.comstudy21.phone.model.PhoneVo;

public class PhoneByName extends PhoneView {
	@Override
	public void display() {
		System.out.println("::::: 사람 정보 검색 :::::");
		System.out.print("검색 할 이름 >> ");
		String name = scan.next();
		R.phoneVo = new PhoneVo(0,name, null);
		// controller로 이동
	}
}
