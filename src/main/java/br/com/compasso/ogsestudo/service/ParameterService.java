package br.com.compasso.ogsestudo.service;

import java.util.List;

import br.com.compasso.ogsestudo.dto.ParameterDTO;

public interface ParameterService {

	ParameterDTO save(ParameterDTO dto);
	
	List<ParameterDTO> findAll();
	
	Boolean deleteParameter(String key);
	
	Boolean delete(String key) throws Exception;
}
