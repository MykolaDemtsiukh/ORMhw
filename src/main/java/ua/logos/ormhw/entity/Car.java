package ua.logos.ormhw.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car extends BaseEntity {

	
	private String name;
	
	@Column(name = "gov_number", length = 50 )
	private int GovNumber;
	
	private String Color;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	@ManyToMany
	@JoinTable (name = "worker_car", 
			joinColumns = @JoinColumn(name = "car_id"),
			inverseJoinColumns = @JoinColumn(name = "worker_id"))
	private List<Worker> workers = new ArrayList<Worker>();
	
	public Car() {
	}

	public String getName() {
		return name;
	}

	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Worker> getWorkers() {
		return workers;
	}

	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
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
