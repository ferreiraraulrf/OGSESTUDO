package br.com.compasso.ogsestudo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Data
@Entity
@Table(name = "PARAMETER")
@DynamicUpdate
public class Parameter extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -5504726828669339045L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "KEY", updatable = false, nullable = false)
	private String key;
	
	@Column(name = "VALUE")
	private String value;
	
	@Column(name = "DESCRIPTION", length = 100)
	private String description;
	
	@Column(name = "ACTIVE", length = 100)
	private Boolean active;
}
