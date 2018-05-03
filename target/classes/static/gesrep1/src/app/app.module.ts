import { BrowserModule } from '@angular/platform-browser';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA, Component } from '@angular/core';


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
import { DemohelloComponent } from './Component/demohello/demohello.component';
import { TopmenuComponent } from './Component/topmenu/topmenu.component';
import { SideMenuComponent } from './Component/side-menu/side-menu.component';
import { ListeClientComponent } from './Component/liste-client/liste-client.component';
import { CreateArticleComponent } from './Component/create-article/create-article.component';
import { ArticleService } from './Srevice/article-service.service';
import { ListArticleComponent } from './Component/list-article/list-article.component';
import { CreatePaymentsComponent } from './Component/create-payments/create-payments.component';
import { PaymentService } from './Srevice/payment.service';


@NgModule({
  declarations: [
    AppComponent,
    ResponceWrapperComponent,
    ClientComponent,
    DemohelloComponent,
    TopmenuComponent,
    SideMenuComponent,
    ListeClientComponent,
    CreateArticleComponent,
    ListArticleComponent,
    CreatePaymentsComponent
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
      path:"\CreateClient",
      component:ClientComponent
    },
   { path:"\ListeClient",
    component:ListeClientComponent
  },
  {
    path:"\CreateArticle",
    component:CreateArticleComponent
  },
  {
    path:"\listArticle",
  component:ListArticleComponent
  },
  {
    path:"\MakePayment",
    component:CreatePaymentsComponent
  }
    ])
    
  ],
  providers: [ResponceWrapperService,ClientService,ArticleService,PaymentService],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
  
  bootstrap: [AppComponent]
})
export class AppModule { }
