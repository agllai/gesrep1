import {Boutique} from '../enteties/Boutique';
import {Operateur} from '../enteties/Operateur';
import { Demande_Reparation } from './Demande_Reparation';
export class Article{
    Id_Article:number;
    SerialNumber:String;
	Marque:String;
	Model:String ;
	boutique:Boutique;
	operateur:Operateur;
	reparation :Demande_Reparation;
	Livraison:Boolean;
	DateRécupération:Date;
	commentaire:String;
	Designation:String;
	CodeSecurite:String;
}