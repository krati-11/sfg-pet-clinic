package com.springframework.sfgpetclinic.service.map;

import java.util.Set;

import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.service.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public
	Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public
	Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public
	Vet save(Long id, Vet object) {
		// TODO Auto-generated method stub
		return super.save(id, object);
	}

	@Override
	public
	void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public
	void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

}
