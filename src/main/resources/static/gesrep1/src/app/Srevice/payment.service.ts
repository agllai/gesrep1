import { Injectable } from '@angular/core';
import { Http , Response , Headers , RequestOptions} from '@angular/http';
import { ErrorHandler } from '@angular/router/src/router';
import{Observable}   from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { Encaissement } from '../enteties/Enciassement';
@Injectable()
export class PaymentService {
  private baseurl:string = 'http://localhost:8080/Gesrep';
  private headers = new Headers({'Content-Type':'application/json'});

  private options = new RequestOptions({headers:this.headers});
  
  private payment:Encaissement = new Encaissement();
  private payments:Encaissement[];
  private response:any;
  private data:any;
  constructor(private _http:Http) { }

  createPayment(payment: Encaissement):Promise<Encaissement> {
    return this._http
      .post(this.baseurl+'/Encaissement', JSON.stringify(payment), {headers : this.headers})
      .toPromise()
      .then(res => {res.json() as Encaissement;console.log(res);this.data=res;this.payment=res.json().body.Encaissement;console.log(this.payment)})
      .catch(this.handleError);}
private handleError(error: any): Promise<any> {
console.log('Error', error); // for demo purposes only
return Promise.reject(error.message || error);}
getPayments(){
 this.response= this._http.get(this.baseurl+'/Encaissement',this.options).map((response:Response)=> response.json()).catch((error:ErrorHandler)=> this.handleError(error));

 return this.response;

}

setter(Payment:Encaissement)
{
this.payment =Payment;
}
setterPayment(payments:Encaissement[]):void
{
this.payments=payments;
}
getter(){
return this.payment;
}
getterClients()
{
return this.payments;
}




}
