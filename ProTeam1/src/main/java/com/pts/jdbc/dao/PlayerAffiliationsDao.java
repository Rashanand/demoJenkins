package com.pts.jdbc.dao;

import java.util.ArrayList;

import com.pts.dto.PlayerAffiliations;

public interface PlayerAffiliationsDao {
	
	public PlayerAffiliations findBySlNo(long slNo);
	public PlayerAffiliations findById(long id);
	public ArrayList<PlayerAffiliations> getByNationality(String nationality);
	public ArrayList<PlayerAffiliations> getByClub(String club);
	public ArrayList<PlayerAffiliations> getAll();
	public void delete(long id);
	public void update(PlayerAffiliations playerAffiliation);
}
