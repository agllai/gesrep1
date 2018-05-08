import {Boutique} from '../enteties/Boutique';
import {Operateur} from '../enteties/Operateur';
import { Demande_Reparation } from './Demande_Reparation';
export class Article{
    idArticle:number;
    serialNumber:String;
	marque:String;
	model:String ;
	boutique:Boutique;
	operateur:Operateur;
	reparation:Demande_Reparation;
	livraison:Boolean;
	dateRecuperation:Date;
	commentaire:String;
	codeSecurite:String;
	designation:String;
}