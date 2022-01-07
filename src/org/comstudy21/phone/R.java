package org.comstudy21.phone;

import java.util.Vector;

import org.comstudy21.phone.controller.PhoneController;
import org.comstudy21.phone.model.PhoneVo;
import org.comstudy21.phone.view.MenuView;
import org.comstudy21.phone.view.PhoneByName;
import org.comstudy21.phone.view.PhoneDelete;
import org.comstudy21.phone.view.PhoneInput;
import org.comstudy21.phone.view.PhoneListView;
import org.comstudy21.phone.view.PhoneOutput;
import org.comstudy21.phone.view.PhonePrint;
import org.comstudy21.phone.view.PhoneUpdate;
import org.comstudy21.phone.view.PhoneView;

public class R {
	public static int no;
	public static PhoneVo phoneVo;
	public static Vector<PhoneVo> phoneList;
	
	public static PhoneView menuView = new MenuView();
	public static PhoneView phoneDelete = new PhoneDelete();
	public static PhoneView phoneListView = new PhoneListView();
	public static PhoneView phoneByName = new PhoneByName();
	public static PhoneView phoneInput = new PhoneInput();
	public static PhoneView phoneOuput = new PhoneOutput();
	public static PhoneView phonePrint = new PhonePrint();
	public static PhoneView phoneUpdate = new PhoneUpdate();
	
	
	public static final PhoneController phoneController = new PhoneController();
	
}