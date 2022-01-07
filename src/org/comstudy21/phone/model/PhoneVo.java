package org.comstudy21.phone.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class PhoneVo implements Externalizable{
	private int no;
	@Override
	public int hashCode() {
		return Objects.hash(no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneVo other = (PhoneVo) obj;
		return no == other.no;
	}

	private String name;
	private String phoneNumber;
	
	public PhoneVo() {
		this(0,"", "");
	}

	public PhoneVo(int no,String name, String phoneNumber) {
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return  no + "   " + name + "   " + phoneNumber;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(no);
		out.writeUTF(name);
		out.writeUTF(phoneNumber);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		no = in.read();
		name = in.readUTF();
		phoneNumber = in.readUTF();
		
	}

	
}
