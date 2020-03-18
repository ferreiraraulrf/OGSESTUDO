package br.com.compasso.ogsestudo.model;

import java.time.ZonedDateTime;

import javax.persistence.Column;

import lombok.Data;

@Data
public abstract class BaseEntity {

	@Column(name = "CREATE_DATE")
	private ZonedDateTime createDate;
	
	@Column(name = "LAST_MODIFIED_DATE")
	private ZonedDateTime lastModifiedDate;
}
