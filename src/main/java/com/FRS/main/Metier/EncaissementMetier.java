package com.FRS.main.Metier;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.FRS.main.dao.EncaissementRepository;
import com.FRS.main.dao.TacheReparationRepository;
import com.FRS.main.entities.Encaissement;
import com.FRS.main.entities.Tache_Reparation;

public class EncaissementMetier {
@Autowired
EncaissementRepository EncRep;
@Autowired
TacheReparationRepository TRR;
Collection<Tache_Reparation> CTR=null;
public void Create(Encaissement Enc) {
	for(Tache_Reparation TR:Enc.getTacheRep()) {
	CTR.add(TRR.save(TR));
	}
	//Enc.setTacheRep(CTR);
	Encaissement Enc1=EncRep.save(Enc);
	for(Tache_Reparation TR1 : CTR) {
		TR1.setEnc(Enc1);
		TRR.save(TR1);
	}
}
}
