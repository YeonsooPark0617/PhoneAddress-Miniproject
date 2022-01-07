package org.comstudy21.phone.view;

import java.util.Iterator;

import org.comstudy21.phone.R;
import org.comstudy21.phone.model.PhoneVo;

public class PhoneOutput extends PhoneView{
	@Override
	public void display() {
		System.out.println("----------- output ----------------");
		
		Iterator<PhoneVo> it = R.phoneList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
