import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// tslint:disable-next-line:import-blacklist
import { Observable } from 'rxjs';

@Injectable()
export class VendasService {

  private api = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  listar(): Observable<any> {
    return this.http.get<any>(`${this.api}/vendas`);
  }
  listarClientes(): Observable<any> {
    return this.http.get<any>(`${this.api}/clientes`);
  }
  listarProdutos(): Observable<any> {
    return this.http.get<any>(`${this.api}/produtos`);
  }
  adicionar(venda: any): Observable<any> {
    return this.http.post<any>(`${this.api}/vendas`, venda);
  }


}
