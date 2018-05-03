import { Injectable } from '@angular/core';
import { Http , Response , Headers , RequestOptions} from '@angular/http';
import { Article } from '../enteties/Article';
import { ErrorHandler } from '@angular/router/src/router';
import{Observable}   from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';


@Injectable()
export class ArticleService {
  private baseurl:string = 'http://localhost:8080/Gesrep';
  private headers = new Headers({'Content-Type':'application/json'});

  private options = new RequestOptions({headers:this.headers});
  
  private article:Article = new Article();
  private articles:Article[];
  private response:any;
  private data:any;
  constructor(private _http:Http) { }
  
  createArticle(article: Article) {
    return this._http
      .post(this.baseurl+'/Article', JSON.stringify(article), {headers : this.headers})
      .toPromise()
      .then(res => {res.json() as Article;console.log(res);this.data=res;this.article=res.json().Article})
      .catch(this.handleError);}
private handleError(error:Response) {
console.log('Error', error);
return Observable.throw(error||"SERVER ERROR"); }
getArticles(){
 this.response= this._http.get(this.baseurl+'/Article',this.options).map((response:Response)=> response.json()).catch( this.handleError);

 return this.response;

}

setter(article:Article)
{
this.article =article;
}
setterArticles(articles:Article[]):void
{
this.articles=articles;
}
getter(){
return this.article;
}
getterArticles()
{
return this.articles;
}
}
