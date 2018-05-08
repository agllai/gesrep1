import { BrowserModule } from '@angular/platform-browser';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA, Component } from '@angular/core';


import { AppComponent } from './app.component';
import { ResponceWrapperComponent } from './Component/responce-wrapper/responce-wrapper.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { ResponceWrapperService } from './Srevice/ResponceWrapperService';
import { ClientService } from './Srevice/ClientService';
import { ClientComponent } from './Component/Client/client/client.component';

import {HttpClientModule} from '@angular/common/http'
import { InterceptorModule ,HttpsRequestInterceptor} from './Interceptor.module';
import { DemohelloComponent } from './Component/demohello/demohello.component';
import { TopmenuComponent } from './Component/topmenu/topmenu.component';
import { SideMenuComponent } from './Component/side-menu/side-menu.component';
import { ListeClientComponent } from './Component/Client/liste-client/liste-client.component';
import { CreateArticleComponent } from './Component/Article/create-article/create-article.component';
import { ArticleService } from './Srevice/article-service.service';
import { ListArticleComponent } from './Component/Article/list-article/list-article.component';
import { CreatePaymentsComponent } from './Component/Payment/create-payments/create-payments.component';
import { PaymentService } from './Srevice/payment.service';
import { ListComosantComponent } from './Component/Composant/list-composant/list-composant.component';
import { CreateComposantComponent } from './Component/Composant/create-composant/create-composant.component';
import { CreatePieceComponent } from './Component/Piece/create-piece/create-piece.component';
import { PieceService } from './Srevice/piece.service';
import { ListPieceComponent } from './Component/Piece/list-piece/list-piece.component';


@NgModule({
  declarations: [
    AppComponent,
    ResponceWrapperComponent,
    ClientComponent,
    DemohelloComponent,
    TopmenuComponent,
    SideMenuComponent,
    ListeClientComponent,
    //CreateArticleComponent,
   // ListArticleComponent,
    CreatePaymentsComponent,
    ListComosantComponent,
    CreateComposantComponent,
    CreatePieceComponent,
    ListPieceComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    ReactiveFormsModule,
    HttpClientModule,
    InterceptorModule,
    
    
    RouterModule.forRoot([
      {path:"rw",
      component:ResponceWrapperComponent
    },
    {
      path:"op",
      component:AppComponent
    },
    
    {
      path:"CreateClient",
      component:ClientComponent
    },
   { path:"ListeClient",
    component:ListeClientComponent
  },
  /*{
    path:"CreateArticle",
    component:CreateArticleComponent
  },
  {
    path:"listArticle",
  component:ListArticleComponent
  },*/
  {
    path:"MakePayment",
    component:CreatePaymentsComponent
  },
  {
    path:"Piece/CreatePiece",
    component:CreatePieceComponent
  },
  {
    path:'Piece/ListPiece',
    component:ListPieceComponent
  }
    ])
    
  ],
  providers: [ResponceWrapperService,ClientService,ArticleService,PaymentService,PieceService],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
  
  bootstrap: [AppComponent]
})
export class AppModule { }
