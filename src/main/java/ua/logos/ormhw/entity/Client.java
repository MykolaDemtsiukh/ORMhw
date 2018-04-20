package ua.logos.ormhw.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client extends BaseEntity {

	private String name;
	
	@Column(name = "last_name", length = 100)
	private String lastName;
	
	@OneToMany ( mappedBy = "client")
	private List<Car> cars = new ArrayList<Car>();
	
	
	@OneToOne
	@JoinColumn(name = "client_Details_id")
	private ClientDetails clientDetails;

	public Client() {
	}

	
	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
	}


	public ClientDetails getClientDetails() {
		return clientDetails;
	}


	public void setClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
