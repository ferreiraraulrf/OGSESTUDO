package br.com.compasso.ogsestudo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ParameterDTO implements Serializable{

	private static final long serialVersionUID = 7605211718024928229L;
	
	private Integer id;
	private String key;
	private String value;
	private String description;
	private Boolean active;
}
