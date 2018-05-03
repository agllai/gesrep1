import { Injectable } from '@angular/core';
import {Http , Response , Headers , RequestOptions, JsonpModule} from '@angular/http';
import{Observable}   from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { ResponceWrapper } from '../enteties/ResponceWrapper';
import { Client } from '../enteties/Client';
import { error } from 'util';
import { ROUTER_CONFIGURATION } from '@angular/router';
import {InterceptorModule,HttpsRequestInterceptor} from '../Interceptor.module'
import 'rxjs/add/operator/toPromise';
import { ErrorHandler } from '@angular/router/src/router';
import { HttpClient } from 'selenium-webdriver/http';
import { HttpHeaderResponse } from '@angular/common/http';
@Injectable()
export class ClientService {
  private baseurl:string = 'http://localhost:8080/Gesrep';
  private headers = new Headers({'Content-Type':'application/json'});
data:any;
  private options = new RequestOptions({headers:this.headers});
  
  private client:Client = new Client();
  private clients:Client[];
  private response:any;
  constructor(private _http:Http) { }
  /*createClient(client:Client){
    return this._http.post(this.baseurl+'/client',JSON.stringify(client)  ,this.options).map((response:Response)=> response.json(),error=>this.errorHandler(error));
  }*/
  
  
      createClient(client: Client):Promise<Client> {
        return this._http
          .post(this.baseurl+'/client', JSON.stringify(client), {headers : this.headers})
          .toPromise()
          .then(res => {res.json() as Client;console.log(res);this.data=res;this.client=res.json().Client})
          .catch(this.handleError);}
   private handleError(error: any): Promise<any> {
    console.log('Error', error); // for demo purposes only
    return Promise.reject(error.message || error);}
    getclient(){
     this.response= this._http.get(this.baseurl+'/Client',this.options).map((response:Response)=> response.json()).catch((error:ErrorHandler)=> this.handleError(error));
    
     return this.response;

    }
    
setter(client:Client)
{
  this.client =client;
}
setterClients(clients:Client[]):void
{
  this.clients=clients;
}
getter(){
  return this.client;
}
getterClients()
{
  return this.clients;
}
}