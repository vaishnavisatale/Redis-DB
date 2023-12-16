package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository pr;
	
	public Person add(Person person) {
        return pr.save(person);
    }
    
    public Iterable<Person> getALL() {
        return pr.findAll();
    }

    public Person getPersonById(int id) {
        return pr.findById(id).orElse(null);
    }

    public void deletePersonByID(int id) {
    	pr.deleteById(id);
    }

}
