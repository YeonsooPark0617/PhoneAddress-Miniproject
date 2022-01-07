package org.comstudy21.phone.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import org.comstudy21.phone.model.PhoneVo;

public class PhoneDao {
	static int no = 1;
	static Vector<PhoneVo> pv = new Vector<PhoneVo>();
	static Scanner scan = new Scanner(System.in);
	static File file = new File("phone.dat");
	static FileOutputStream fos;
	static FileInputStream fis;
	static ObjectOutputStream oos;
	static ObjectInputStream ois;

	{
		if (file.exists()) {
			try {
				load();
				no = pv.lastElement().getNo() + 1;

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void load() throws IOException, ClassNotFoundException {

		fis = new FileInputStream(file);
		ois = new ObjectInputStream(fis);
		pv = (Vector<PhoneVo>) ois.readObject();

		ois.close();
	}

	public static void save() throws IOException {
		fos = new FileOutputStream(file);
		oos = new ObjectOutputStream(fos);
		oos.writeObject(pv);
		oos.close();
	}

	public static Vector<PhoneVo> output() {
		Vector<PhoneVo> list = new Vector<>();
		for (int i = 0; i < pv.size(); i++) {
			PhoneVo data = new PhoneVo();
			data.setNo(pv.get(i).getNo());
			data.setName(pv.get(i).getName());
			data.setPhoneNumber(pv.get(i).getPhoneNumber());
			list.add(data);
		}

		return list;
	}

	public static void input(PhoneVo vo) {
		vo.setNo(no++);
		pv.add(vo);
	}

	public static PhoneVo search(PhoneVo vo) {
		PhoneVo data = new PhoneVo();
		for (int i = 0; i < pv.size(); i++) {
			if (vo.getName().equals(pv.get(i).getName())) {
				data.setNo(pv.get(i).getNo());
				data.setName(pv.get(i).getName());
				data.setPhoneNumber(pv.get(i).getPhoneNumber());

			}
		}
		return data;
	}

	public static void delete(PhoneVo vo) {
		int data;
		if (vo != null) {
			data = pv.indexOf(vo);
			pv.remove(data);
		}
	}

	public static void update(PhoneVo vo) {
		int data;
		if (vo != null) {
			data = pv.indexOf(vo);
			pv.set(data, vo);
		}
	}

}
