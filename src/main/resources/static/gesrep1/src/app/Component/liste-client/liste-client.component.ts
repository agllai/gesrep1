import { Component, OnInit } from '@angular/core';
import { ClientService } from '../../Srevice/ClientService';
import { Router } from '@angular/router';
import { Client } from '../../enteties/Client';
import { ErrorHandler } from '@angular/router/src/router';

@Component({
  selector: 'app-liste-client',
  templateUrl: './liste-client.component.html',
  styleUrls: ['./liste-client.component.css']
})
export class ListeClientComponent implements OnInit {
  clients:Client[];
  constructor(private _Clientservice:ClientService,private _rotuer:Router) { }

  ngOnInit() {
    this._Clientservice.getclient().subscribe((Clients)=>{
      console.log(Clients);
      this.clients=Clients;
      console.log(this._Clientservice.getterClients())
    },
    (error:ErrorHandler)=>{console.log(error);
    
    })
  }

}
