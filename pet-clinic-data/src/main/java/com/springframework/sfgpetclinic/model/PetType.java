package com.springframework.sfgpetclinic.model;

@SuppressWarnings("serial")
public class PetType extends BaseEntity{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
