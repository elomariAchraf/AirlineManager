package com.airline.persistance;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Airplan
 *
 */
@Entity

public class Airplan implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;

	public Airplan() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String planeMake;

	private String modelName;

	private int seatingCapacity;

	@OneToOne(mappedBy = "airplaneDetail")
	private Flight flight;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaneMake() {
		return planeMake;
	}

	public void setPlaneMake(String planeMake) {
		this.planeMake = planeMake;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return "Airplan [id=" + id + ", planeMake=" + planeMake + ", modelName=" + modelName + ", seatingCapacity="
				+ seatingCapacity + "]";
	}

}
