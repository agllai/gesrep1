import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { ResponceWrapperComponent } from './Component/responce-wrapper/responce-wrapper.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { ResponceWrapperService } from './Srevice/ResponceWrapperService';
import { ClientService } from './Srevice/ClientService';


@NgModule({
  declarations: [
    AppComponent,
    ResponceWrapperComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path:"",
      component:ResponceWrapperComponent
    },
    {
      path:"\op",
      component:AppComponent
    }

    ])
    
  ],
  providers: [ResponceWrapperService,ClientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
