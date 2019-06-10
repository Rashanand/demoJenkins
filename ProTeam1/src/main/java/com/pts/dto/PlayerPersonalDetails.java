package com.pts.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player_personal_details")
public class PlayerPersonalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "SL_NO", nullable = false)
	private long slNo;
	
	@Column(name = "Name", nullable = false)
	private String name;
	
	@Column(name = "Age", nullable = false)
	private long age;
	
	@Column(name = "Photo", nullable = false)
	private String photo;
	
	@Column(name = "Value", nullable = false)
	private String value;
	
	@Column(name = "Wage", nullable = false)
	private String wage;
	
	@Column(name = "Special", nullable = false)
	private long special;
	
	public PlayerPersonalDetails() {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getWage() {
		return wage;
	}

	public void setWage(String wage) {
		this.wage = wage;
	}

	public long getSpecial() {
		return special;
	}

	public void setSpecial(long special) {
		this.special = special;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (age ^ (age >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + (int) (slNo ^ (slNo >>> 32));
		result = prime * result + (int) (special ^ (special >>> 32));
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		result = prime * result + ((wage == null) ? 0 : wage.hashCode());
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
		PlayerPersonalDetails other = (PlayerPersonalDetails) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (slNo != other.slNo)
			return false;
		if (special != other.special)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		if (wage == null) {
			if (other.wage != null)
				return false;
		} else if (!wage.equals(other.wage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlayerPersonalDetails [slNo=" + slNo + ", id=" + id + ", name=" + name + ", age=" + age + ", photo="
				+ photo + ", value=" + value + ", wage=" + wage + ", special=" + special + "]";
	}
	
}
