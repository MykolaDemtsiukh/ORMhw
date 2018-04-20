package ua.logos.ormhw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "client_details")
public class ClientDetails extends BaseEntity {

	private String adress;
	
	@Column(name = "phone_number")
	private int phoneNumber;

	public ClientDetails() {
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
