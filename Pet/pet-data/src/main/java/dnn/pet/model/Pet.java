package dnn.pet.model;

import java.time.LocalDate;

public class Pet {
	
	private Owner owner;
	private PetType type;
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
