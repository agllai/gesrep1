import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { ResponceWrapperComponent } from './Component/responce-wrapper/responce-wrapper.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { ResponceWrapperService } from './Srevice/ResponceWrapperService';
import { ClientService } from './Srevice/ClientService';
import { ClientComponent } from './Component/client/client.component';

import {HttpClientModule} from '@angular/common/http'
import { InterceptorModule ,HttpsRequestInterceptor} from './Interceptor.module';


@NgModule({
  declarations: [
    AppComponent,
    ResponceWrapperComponent,
    ClientComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    ReactiveFormsModule,
    HttpClientModule,
    InterceptorModule,
    RouterModule.forRoot([
      {path:"\rw",
      component:ResponceWrapperComponent
    },
    {
      path:"\op",
      component:AppComponent
    },
    {
      path:"",
      component:ClientComponent
    }

    ])
    
  ],
  providers: [ResponceWrapperService,ClientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
