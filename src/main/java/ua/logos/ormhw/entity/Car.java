package ua.logos.ormhw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car extends BaseEntity {

	
	private String name;
	
	@Column(name = "gov_number", length = 50 )
	private int GovNumber;
	
	private String Color;

	public Car() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGovNumber() {
		return GovNumber;
	}

	public void setGovNumber(int govNumber) {
		GovNumber = govNumber;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	
	
	
}
