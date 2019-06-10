package com.pts.jdbc.dao;

import java.util.ArrayList;

import com.pts.dto.PlayerPersonalDetails;

public interface PlayerPersonalDetailsDao {
	
	public PlayerPersonalDetails findBySlNo(long slNo);
	public PlayerPersonalDetails findById(long id);
	public ArrayList<PlayerPersonalDetails> getByName(String name);
	public ArrayList<PlayerPersonalDetails> getByAge(long age);
	public ArrayList<PlayerPersonalDetails> getByValue(String value);
	public ArrayList<PlayerPersonalDetails> getByWage(String wage);
	public ArrayList<PlayerPersonalDetails> getBySpecial(long special);
	public ArrayList<PlayerPersonalDetails> getAll();
	public void delete(long id);
	public void update(PlayerPersonalDetails playerPersonalDetails);
}
