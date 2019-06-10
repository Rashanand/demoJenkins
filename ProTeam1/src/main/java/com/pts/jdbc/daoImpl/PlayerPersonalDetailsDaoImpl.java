package com.pts.jdbc.daoImpl;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.pts.dto.PlayerPersonalDetails;
import com.pts.jdbc.dao.PlayerPersonalDetailsDao;

@Repository
public class PlayerPersonalDetailsDaoImpl extends AbstractDao implements PlayerPersonalDetailsDao {

	@Override
	public PlayerPersonalDetails findBySlNo(long slNo) {
		// TODO Auto-generated method stub
		Criteria criteria = getEntityManagerSession().createCriteria(PlayerPersonalDetails.class);
		criteria.add(Restrictions.eq("slNo", slNo));
		return (PlayerPersonalDetails) criteria.uniqueResult();
	}

	@Override
	public PlayerPersonalDetails findById(long id) {
		// TODO Auto-generated method stub
		Criteria criteria = getEntityManagerSession().createCriteria(PlayerPersonalDetails.class);
		criteria.add(Restrictions.eq("id", id));
		return (PlayerPersonalDetails) criteria.uniqueResult();	
	}

	@Override
	public ArrayList<PlayerPersonalDetails> getByName(String name) {
		// TODO Auto-generated method stub
		Criteria criteria = getEntityManagerSession().createCriteria(PlayerPersonalDetails.class);
		criteria.add(Restrictions.eq("name", name));
		return (ArrayList<PlayerPersonalDetails>) criteria.list();
	}

	@Override
	public ArrayList<PlayerPersonalDetails> getByAge(long age) {
		// TODO Auto-generated method stub
		Criteria criteria = getEntityManagerSession().createCriteria(PlayerPersonalDetails.class);
		criteria.add(Restrictions.eq("age", age));
		return (ArrayList<PlayerPersonalDetails>) criteria.list();
	}

	@Override
	public ArrayList<PlayerPersonalDetails> getByValue(String value) {
		// TODO Auto-generated method stub
		Criteria criteria = getEntityManagerSession().createCriteria(PlayerPersonalDetails.class);
		criteria.add(Restrictions.eq("value", value));
		return (ArrayList<PlayerPersonalDetails>) criteria.list();
	}

	@Override
	public ArrayList<PlayerPersonalDetails> getByWage(String wage) {
		// TODO Auto-generated method stub
		Criteria criteria = getEntityManagerSession().createCriteria(PlayerPersonalDetails.class);
		criteria.add(Restrictions.eq("wage", wage));
		return (ArrayList<PlayerPersonalDetails>) criteria.list();
	}

	@Override
	public ArrayList<PlayerPersonalDetails> getBySpecial(long special) {
		// TODO Auto-generated method stub
		Criteria criteria = getEntityManagerSession().createCriteria(PlayerPersonalDetails.class);
		criteria.add(Restrictions.eq("special", special));
		return (ArrayList<PlayerPersonalDetails>) criteria.list();
	}

	@Override
	public ArrayList<PlayerPersonalDetails> getAll() {
		// TODO Auto-generated method stub
		Criteria criteria = getEntityManagerSession().createCriteria(PlayerPersonalDetails.class);
		return (ArrayList<PlayerPersonalDetails>) criteria.list();
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		Query query = getEntityManagerSession().createSQLQuery("DELETE FROM player_personal_details WHERE ID = :id");
		query.setLong("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(PlayerPersonalDetails playerPersonalDetails) {
		// TODO Auto-generated method stub
		getEntityManagerSession().update(playerPersonalDetails);
	}
	
}
