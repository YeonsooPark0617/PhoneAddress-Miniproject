package org.comstudy21.phone.view;

import org.comstudy21.phone.R;

public class PhoneUpdate extends PhoneView{
	@Override
	public void display() {
		System.out.println(":::::::::::: 사람 정보 수정 ::::::::::");
		if(R.phoneVo == null) {
			System.out.println("검색 결과 없습니다!");
			return;
		}
		System.out.println("수정 항목을 선택하세요.");
		System.out.println("이름을 수정하시겠습니까?(Y/N)");
		char yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 이름>> ");
			R.phoneVo.setName(scan.next());
		}
		
		System.out.println("전화번호를 수정하시겠습니까?(Y/N)");
		yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 전화번호 >> ");
			R.phoneVo.setPhoneNumber(scan.next());
		}
		
		
		
	}
}
