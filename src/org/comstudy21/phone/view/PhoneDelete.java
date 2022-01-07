package org.comstudy21.phone.view;

import org.comstudy21.phone.R;

public class PhoneDelete extends PhoneView {
	@Override
	public void display() {
		System.out.println(":::: 사람 정보 삭제 ::::");
		
		if(R.phoneVo == null) {
			System.out.println("검색 결과가 없습니다!");
			return;
		}
		
		System.out.print("정말로 삭제하시겠습니까?[Y/N]");
		char yn = scan.next().charAt(0);
		if(yn == 'y'|| yn == 'Y') {
			System.out.println("삭제되었습니다.");
		}
		
		
		
		
		
		
	}
}
