package com.pts.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pts.dto.PlayerPersonalDetails;
import com.pts.service.PlayerPersonalDetailsService;

@RestController
@RequestMapping("/details")
public class PlayerPersonalDetailsController {
	@Autowired
	private PlayerPersonalDetailsService playerPersonalDetailsService;
	
	@RequestMapping(value = "/players", method = RequestMethod.GET)
	public ArrayList<PlayerPersonalDetails> getAllPlayerDetails() {
		return playerPersonalDetailsService.getAll();
	}
	
	
	@RequestMapping(value = "/player/{id}", method = RequestMethod.GET)
	public PlayerPersonalDetails findById(@PathVariable("id") long id) {
		return playerPersonalDetailsService.findById(id);
	}
	
	@RequestMapping(value = "/player/{slNo}", method = RequestMethod.GET)
	public PlayerPersonalDetails findBySlNo(long slNo) {
		return playerPersonalDetailsService.findBySerialNo(slNo);
	}
	
	@RequestMapping(value = "/players/{name}", method = RequestMethod.GET)
	public ArrayList<PlayerPersonalDetails> getByName(String name) {
		return playerPersonalDetailsService.getByName(name);
	}
	
	@RequestMapping(value = "/players/{age}", method = RequestMethod.GET)
	public ArrayList<PlayerPersonalDetails> getByAge(long age) {
		return playerPersonalDetailsService.getByAge(age); 
	}
	
	@RequestMapping(value = "/players/{value}", method = RequestMethod.GET)
	public ArrayList<PlayerPersonalDetails> getByValue(String value) {
		return playerPersonalDetailsService.getByValue(value);
	}
	
	@RequestMapping(value = "/players/{wage}", method = RequestMethod.GET)
	public ArrayList<PlayerPersonalDetails> getByWage(String wage) {
		return playerPersonalDetailsService.getByWage(wage);
	}
	
	@RequestMapping(value = "/players/{special}", method = RequestMethod.GET)
	public ArrayList<PlayerPersonalDetails> getBySpecial(long special) {
		return playerPersonalDetailsService.getBySpecial(special);
	}
	
	public void delete(long id) {
		playerPersonalDetailsService.delete(id);
	}
	
	public void update(PlayerPersonalDetails playerPersonalDetails) {
		playerPersonalDetailsService.update(playerPersonalDetails);
	}
}
