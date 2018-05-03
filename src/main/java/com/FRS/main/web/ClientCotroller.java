package com.FRS.main.web;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.FRS.main.dao.ClientRepository;
import com.FRS.main.entities.Client;


@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200",exposedHeaders="Access-Control-Allow-Origin", allowedHeaders="*")

@Transactional
public class ClientCotroller  {
	@Autowired
public ClientRepository clientRepository;
//	@InitBinder
//	private void dataBinder(WebDataBinder binder)
//	{
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
//		binder.registerCustomEditor(Date.class, editor);
//	}
	@GetMapping(value="/Client", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Client> GetClients() {
		return clientRepository.findAll();
	}
	
	@GetMapping(value="/Client/{id_client}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Client GetClient(@PathVariable Long id_client) {
		
		return clientRepository.findOne(id_client);
	}

	@PutMapping(value="/Client", produces=MediaType.APPLICATION_JSON_VALUE)
	public Client Update( Client client) {
		
		return clientRepository.save(client);
		
	}

@DeleteMapping(value="/Client/{idClient}",produces=MediaType.APPLICATION_JSON_VALUE)
	public String DeleteClient(@PathVariable Long idClient) {
	Client client =clientRepository.findOne(idClient);
		if(client==null)
			return "Client introuvable";
		else
		{
			clientRepository.delete(idClient);
			return "Delete OK";
		}
		
	}

	@PostMapping(value="/client",produces=MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Client Create(@RequestBody Client client) {
		Client c=new Client();
		c=client;
		Client c2=new Client();
		Client c1=clientRepository.findByNumtel(c.getNumtel());
		if(c1!=null) {
		c2 = c1;
		}else {
		c2=clientRepository.save(c);
		}
		
	return	c2;

	}
	
//	@PostMapping(value="/Client",produces=MediaType.APPLICATION_JSON_VALUE)
//	public Client Createclt(@RequestParam String nomclt, @RequestParam String Adresse) {
//		Client clt=new Client("", nomclt, Adresse, "", "", "");
//	return 	clientRepository.save(clt);
//
//	}

}
