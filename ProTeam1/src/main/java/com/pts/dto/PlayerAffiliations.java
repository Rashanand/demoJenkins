package com.pts.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "player_affiliations")
public class PlayerAffiliations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "SL_NO", nullable = true)
	private long slNo;
	
	@Column(name = "Nationality", nullable = true)
	private String nationality;
	
	@Column(name = "Flag", nullable = true)
	private String flag;
	
	@Column(name = "Club", nullable = true)
	private String club;
	
	@Column(name = "Club Logo", nullable = true)
	private String clubLogo;
	
	public PlayerAffiliations() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSlNo() {
		return slNo;
	}
	public void setSlNo(long slNo) {
		this.slNo = slNo;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getClubLogo() {
		return clubLogo;
	}
	public void setClubLogo(String clubLogo) {
		this.clubLogo = clubLogo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((club == null) ? 0 : club.hashCode());
		result = prime * result + ((clubLogo == null) ? 0 : clubLogo.hashCode());
		result = prime * result + ((flag == null) ? 0 : flag.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + (int) (slNo ^ (slNo >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayerAffiliations other = (PlayerAffiliations) obj;
		if (club == null) {
			if (other.club != null)
				return false;
		} else if (!club.equals(other.club))
			return false;
		if (clubLogo == null) {
			if (other.clubLogo != null)
				return false;
		} else if (!clubLogo.equals(other.clubLogo))
			return false;
		if (flag == null) {
			if (other.flag != null)
				return false;
		} else if (!flag.equals(other.flag))
			return false;
		if (id != other.id)
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (slNo != other.slNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PlayerAffiliations [slNo=" + slNo + ", id=" + id + ", nationality=" + nationality + ", flag=" + flag
				+ ", club=" + club + ", clubLogo=" + clubLogo + "]";
	}
	
}
