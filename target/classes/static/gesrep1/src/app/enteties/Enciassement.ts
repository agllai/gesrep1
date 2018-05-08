import { Boutique } from "./Boutique";
import { Demande_Reparation } from "./Demande_Reparation";
import { Article } from "./Article";

export class Encaissement{
    IdEncaissement:number;
	Boutique:Boutique;
	Montant_avance:number;
	MoyenPaiment:String ;
	Reduction:number;
	MontantPaye:number;
	DemandeReparation : Demande_Reparation;
	TotalHT:number;
	article:Article;
	TotalTTC:number;
	TVA:number;
	ResteAPaye:number;
	tarif:number;
	constructor() { }
}