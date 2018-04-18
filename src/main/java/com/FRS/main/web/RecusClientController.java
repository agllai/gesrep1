package com.FRS.main.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FRS.main.dao.Recus_ClientRepository;
import com.FRS.main.entities.Recu_client;
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class RecusClientController {

	@Autowired
	Recus_ClientRepository RCRep;
	@PostMapping(value="/RecusClient",produces=MediaType.APPLICATION_JSON_VALUE)
	public Recu_client Create(@RequestBody Recu_client recusClient) {
		return RCRep.save(recusClient);

	}

	@DeleteMapping(value="/RecusClient/{id_recusClient}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean Delete( @PathVariable Long id_recusClient) {
		RCRep.delete(id_recusClient);
		return true;
	}

	@PutMapping(value="/RecusClient",produces=MediaType.APPLICATION_JSON_VALUE)
	public Recu_client Update(@RequestBody Recu_client recusClient) {
		return RCRep.save(recusClient);
	}

	@GetMapping(value="/RecusClient",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Recu_client> GetRecuClients() {
		
		return RCRep.findAll();
	}

	@GetMapping(value="/RecusClient/{id_recusClient}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Recu_client GetRecuClient(Long id_recusClient) {
		
		return RCRep.findOne(id_recusClient);
	}

}
