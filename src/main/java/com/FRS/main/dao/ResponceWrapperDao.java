package com.FRS.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.FRS.main.entities.Article;

import com.FRS.main.entities.Client;
import com.FRS.main.entities.Demande_Reparation;
import com.FRS.main.entities.Encaissement;
import com.FRS.main.entities.ResponceWrapper;
import com.FRS.main.entities.Tache_Reparation;
@Repository
public class ResponceWrapperDao {
	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	Demande_ReparationRepository DRRepository;
	@Autowired 
	EncaissementRepository EnRepository;
	@Autowired
	TacheReparationRepository TRRepository;
	@Autowired
	ClientRepository clRepository;
	@Autowired 
	EncaissementRepository EncRep;
	@Autowired 
	TacheReparationRepository TRR;

//@Transactional
//public ResponceWrapper save(ResponceWrapper ResWrap) {
//	Client c2=null;
//	Client c=ResWrap.getClient();
//	Client c1=clRepository.findByNumtel(c.getNumtel());
//	if(c1!=null) {
//	c2 = c1;
//	}else {
//	c2=clRepository.save(c);
//	}
//	
////	Demande_Reparation DR = ResWrap.getDR();
////	DR.setClient(c2);
////	Demande_Reparation DR1 = DRRepository.save(DR);
//	
//	Article ar=ResWrap.getArticle();
////	ar.setReparation(DR1);
//	Article ar1=articleRepository.save(ar);
////	DR1.setArticle(ar1);
////	DR1= DRRepository.save(DR1);
////	Encaissement Enc=ResWrap.getEnc();
////	Enc.setArticle(ar1);
////	Enc.setDemande_reparation(DR1);
////	Encaissement Enc1=EncRep.save(Enc);
//	long tarif=0;
////	for(Tache_Reparation TR:ResWrap.getTacheRep()) {
////		TR.setEnc(Enc1);
////		TR.setDemande_reparation(DR1);
////		TRR.save(TR);
////		Enc1.addTacheRep(TR);
////		tarif += TR.getComposant().getTarif(); 
////		
////	}
////	Enc1.setTarif(tarif);
////	Enc1.setReste_a_Paye(Enc1.getTarif()-Enc1.getMontant_avance());
////	EncRep.save(Enc1);
////	DRRepository.save(DR1);
////ResponceWrapper Rw =new ResponceWrapper(DR1,c2,Enc1,ar1,ResWrap.BonRep,Enc1.getTacheRep());
////	return Rw;
////}
//}}
@Transactional
public ResponceWrapper save(ResponceWrapper ResWrap) {
	Client c2=null;
	Client c=ResWrap.getClient();
	Client c1=clRepository.findByNumtel(c.getNumtel());
	if(c1!=null) {
	c2 = c1;
	}else {
	c2=clRepository.save(c);
	}
	
	Demande_Reparation DR = new Demande_Reparation();
	DR.setClient(c2);
	Demande_Reparation DR1 = DRRepository.save(DR);
	
	Article ar=ResWrap.getArticle();
	ar.setReparation(DR1);
	Article ar1=articleRepository.save(ar);
	DR1.setArticle(ar1);
	DR1= DRRepository.save(DR1);
	
	
	
	DRRepository.save(DR1);
ResponceWrapper Rw =new ResponceWrapper(DR1,c2,ar1);
	return Rw;
}
}
