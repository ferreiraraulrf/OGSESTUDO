package br.com.compasso.ogsestudo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.compasso.ogsestudo.dto.ParameterDTO;
import br.com.compasso.ogsestudo.service.ParameterService;

@RestController
public class ParameterController {

	@Autowired
	private ParameterService parameterService;
	
	@PostMapping(value = "/v1/parameter/save", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ParameterDTO> save(@RequestBody(required = true) ParameterDTO parameter) {
		
		return ResponseEntity.ok(parameterService.save(parameter));
	}
}
