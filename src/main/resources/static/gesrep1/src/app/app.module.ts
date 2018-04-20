import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { ResponceWrapperComponent } from './Component/responce-wrapper/responce-wrapper.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { ResponceWrapperService } from './Srevice/ResponceWrapperService';


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
    }

    ])
    
  ],
  providers: [ResponceWrapperService],
  bootstrap: [AppComponent]
})
export class AppModule { }
