/**
 * 
 */
package com.FRS.main.Metier;

/**
 * @author HP
 *
 */

	
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.transaction.annotation.Transactional;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.FRS.main.dao.ArticleRepository;
import com.FRS.main.dao.ClientRepository;
import com.FRS.main.dao.Demande_ReparationRepository;
import com.FRS.main.dao.EncaissementRepository;
import com.FRS.main.dao.ResponceWrapperDao;
import com.FRS.main.dao.TacheReparationRepository;
import com.FRS.main.entities.Article;
import com.FRS.main.entities.Client;
import com.FRS.main.entities.Demande_Reparation;
import com.FRS.main.entities.Encaissement;

	
	public class ReparationMetier {
//	@Autowired
//	ArticleRepository articleRepository;
//	@Autowired
//	Demande_ReparationRepository DRRepository;
//	@Autowired 
//	EncaissementRepository EnRepository;
//	@Autowired
//	TacheReparationRepository TRRepository;
//	@Autowired
//	ClientRepository clRepository;
//	@Autowired 
//	EncaissementRepository EncRep;
//	@PostMapping("/demandereparation")
//	public boolean createReparation(@RequestBody ResponceWrapperDao ResWrap  ) {
//		Client c2=null;
//		Client c=ResWrap.getClient();
//		Client c1=clRepository.findByNom(c.getNom());
//		if(c1!=null) {
//		c2 = clRepository.findOne(c1.getId_Client());
//		}else {
//		c2=clRepository.save(c);
//		}
//		
//		Demande_Reparation DR = ResWrap.getDR();
//		DR.setClient(c2);
//		Demande_Reparation DR1 = DRRepository.save(DR);
//		
//		Article ar=ResWrap.getArticle();
//		ar.setReparation(DR1);
//		Article ar1=articleRepository.save(ar);
//		DR1.setArticle(ar1);
//		Demande_Reparation DR2= DRRepository.save(DR1);
//		Encaissement Enc=ResWrap.getEnc();
//		Enc.setArticle(ar1);
//		Enc.setDemande_reparation(DR2);
//		Encaissement Enc1=EncRep.save(Enc);
//		return true;
//	}
//
}


