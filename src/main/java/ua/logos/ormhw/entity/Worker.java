package ua.logos.ormhw.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "worker")
public class Worker extends BaseEntity {

	private String Name;
	
	@Column (name = "last_name")
	private String lastName;
	
	
	@ManyToMany
	@JoinTable (name = "worker_car", 
			joinColumns = @JoinColumn(name = "worker_id"),
			inverseJoinColumns = @JoinColumn(name = "car_id"))
	private List<Car> cars = new ArrayList<Car>();

	public Worker() {
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
