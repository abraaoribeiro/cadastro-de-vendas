import { BrowserModule } from '@angular/platform-browser';
import { registerLocaleData } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import localePt from '@angular/common/locales/pt';
import { LOCALE_ID, NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';


import { MessageService} from 'primeng/components/common/messageservice';
import { ButtonModule } from 'primeng/button';
import { PanelModule } from 'primeng/panel';
import { InputTextModule } from 'primeng/inputtext';
import { CurrencyMaskModule } from 'ng2-currency-mask';
import { DropdownModule } from 'primeng/dropdown';
import { TableModule } from 'primeng/table';
import { GrowlModule } from 'primeng/growl';


import { NavbarComponent } from './navbar/navbar.component';
import { VendaCadastroComponent } from './venda-cadastro/venda-cadastro.component';
import { VendasListagemComponent } from './vendas-listagem/vendas-listagem.component';
import { VendasService } from './vendas/vendas.service';
import { AppComponent } from './app.component';


registerLocaleData(localePt);

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    VendasListagemComponent,
    VendaCadastroComponent

  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    CurrencyMaskModule,
    FormsModule,
    TableModule,
    DropdownModule,
    InputTextModule,
    PanelModule,
    ButtonModule,
    GrowlModule
  ],
  providers: [VendasService, MessageService,
    { provide: LOCALE_ID, useValue: 'pt' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
