package com.UnitedAhleSunnah.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;
@Entity
public class SubCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		private int subCatId;
		
	private String name;
	private Date date;
	private String createdBy;
	private String updatedBy;
	private boolean isActive;
	@ManyToOne(fetch=FetchType.LAZY)
	private int catid;
}
