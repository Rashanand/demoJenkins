package com.pts.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pts.dto.PlayerPersonalDetails;
import com.pts.jdbc.dao.PlayerPersonalDetailsDao;

@Service
public class PlayerPersonalDetailsService {
	@Autowired
	private PlayerPersonalDetailsDao playerPersonalDetailsDao;
	
	public PlayerPersonalDetails findBySerialNo(long slNo) {
		return playerPersonalDetailsDao.findBySlNo(slNo);
	}
	
	public PlayerPersonalDetails findById(long id) {
		return playerPersonalDetailsDao.findById(id);
	}
	
	public ArrayList<PlayerPersonalDetails> getByName(String name) {
		return playerPersonalDetailsDao.getByName(name);
	}
	
	public ArrayList<PlayerPersonalDetails> getByAge(long age) {
		return playerPersonalDetailsDao.getByAge(age);
	}
	
	public ArrayList<PlayerPersonalDetails> getByValue(String value) {
		return playerPersonalDetailsDao.getByValue(value);
	}
	
	public ArrayList<PlayerPersonalDetails> getByWage(String wage) {
		return playerPersonalDetailsDao.getByWage(wage);
	}
	
	public ArrayList<PlayerPersonalDetails> getBySpecial(long special) {
		return playerPersonalDetailsDao.getBySpecial(special);
	}
	
	public ArrayList<PlayerPersonalDetails> getAll() {
		return playerPersonalDetailsDao.getAll();
	}
	
	public void delete(long id) {
		playerPersonalDetailsDao.delete(id);
	}
	
	public void update(PlayerPersonalDetails playerPersonalDetails) {
		playerPersonalDetailsDao.update(playerPersonalDetails);
	}
}
