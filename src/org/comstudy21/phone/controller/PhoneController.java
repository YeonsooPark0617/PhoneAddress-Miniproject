package org.comstudy21.phone.controller;

import java.io.IOException;

import org.comstudy21.phone.R;
import org.comstudy21.phone.ViewContainer;
import org.comstudy21.phone.model.PhoneDao;

public class PhoneController {
	private ViewContainer vc = new ViewContainer();
	private PhoneDao dao = new PhoneDao();

	public void action() throws IOException, ClassNotFoundException {

		if (R.no == 0) {
			vc.run(R.menuView); // 동적 바인딩 처리된다.
		}

		switch (R.no) {
		case 1: // 입력
			vc.run(R.phoneInput);
			dao.input(R.phoneVo);
			break;
		case 2: // 출력
			R.phoneList = dao.output();
			vc.run(R.phoneOuput);
			break;
		case 3: // 검색
			vc.run(R.phoneByName);
			R.phoneVo = dao.search(R.phoneVo);
			vc.run(R.phonePrint);
			break;
		case 4: // 수정
			vc.run(R.phoneByName);
			R.phoneVo = dao.search(R.phoneVo);
			vc.run(R.phoneUpdate);
			dao.update(R.phoneVo);
			break;
		case 5: // 삭제
			vc.run(R.phoneByName);
			R.phoneVo = dao.search(R.phoneVo);
			vc.run(R.phoneDelete);
			if (R.phoneVo != null) {
				dao.delete(R.phoneVo);
			}
			break;
		case 6: // 종료
			System.out.println("프로그램 종료");
			System.exit(0);
			break;
		default:
			System.out.println("해당 기능이 없습니다!");
		}
		// 재귀 호출
		dao.save();
		R.no = 0;
		action();
	}
}
