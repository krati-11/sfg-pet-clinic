package com.springframework.sfgpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Vet save(Vet object) {
		return super.save(object);
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
