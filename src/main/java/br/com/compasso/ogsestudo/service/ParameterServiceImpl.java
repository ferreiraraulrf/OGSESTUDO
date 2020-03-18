package br.com.compasso.ogsestudo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.annotations.Parent;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.compasso.ogsestudo.dto.ParameterDTO;
import br.com.compasso.ogsestudo.model.Parameter;
import br.com.compasso.ogsestudo.repositories.ParameterRepository;

@Service
public class ParameterServiceImpl implements ParameterService {
	
	@Autowired
	private ParameterRepository parameterRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ParameterDTO save(ParameterDTO dto) {
		
//		Parameter entity = this.mountParameter(dto);
//		
//		Parameter persistedEntity = parameterRepository.save(entity);
//		
//		ParameterDTO dtoPersisted = this.mountParameterDTO(persistedEntity);
//		
//		return dtoPersisted;
		
		return modelMapper.map(parameterRepository.save(modelMapper.map(dto, Parameter.class)), ParameterDTO.class);
	}
	

	@Override
	public Boolean deleteParameter(String key) {
		try {
			
			Parameter entity = parameterRepository.findByKey(key).orElse(new Parameter());
			
			if (!entity.getKey().isEmpty()) {
				entity.setActive(Boolean.FALSE);
			}

			parameterRepository.save(entity);
		} catch (Exception e) {
			return Boolean.FALSE;
		}

		return Boolean.TRUE;
	}
	
	@Override
	public Boolean delete(String key) throws Exception {
		Parameter entity = parameterRepository.findByKey(key).orElse(new Parameter());
		
		if (entity.getId() != null) {
			parameterRepository.deleteById(entity.getId());
		} else {
			throw new Exception("Parâmetro inválido");
		}
		
		return Boolean.TRUE;
	}


	// TODO: Implementar conversão da lista
//	@Override
//	public List<ParameterDTO> findAll() {
//		return parameterRepository(parameterRepository.findAll(), ;
//	}
//	
	
	private Parameter mountParameter(ParameterDTO dto) {
		Parameter parameter = new Parameter();
		
		parameter.setKey(dto.getKey());
		parameter.setValue(dto.getValue());
		parameter.setDescription(dto.getDescription());
		
		return parameter;
	}
	
	private ParameterDTO mountParameterDTO(Parameter entity) {
		ParameterDTO dto = new ParameterDTO();
		
		dto.setId(entity.getId());
		dto.setKey(entity.getKey());
		dto.setValue(entity.getValue());
		dto.setDescription(entity.getDescription());
		
		return dto;
	}

	@Override
	public List<ParameterDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	
	

}
