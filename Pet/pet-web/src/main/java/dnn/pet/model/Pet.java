package dnn.pet.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3651786338478490743L;

	@Column(name = "name")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private PetType type;
	
	@Column(name = "birth_date")
	private LocalDate byrthday;
	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public PetType getType() {
		return type;
	}
	public void setType(PetType type) {
		this.type = type;
	}
	public LocalDate getByrthday() {
		return byrthday;
	}
	public void setByrthday(LocalDate byrthday) {
		this.byrthday = byrthday;
	}
	
	

}
