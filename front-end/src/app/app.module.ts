import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { APP_ROUTING } from './app.routes';
import { CarritoComponent } from './component/carrito/carrito.component';
import { HomeComponent } from './component/home/home.component';
import { FooterComponent } from './component/shared/footer/footer.component';
import { NavbarComponent } from './component/shared/navbar/navbar.component';
import { AuthService } from './services/auth.service';
import { LibrosService } from './services/libros.service';
import { UsuariosService } from './services/usuarios.service';

@NgModule ( {
  declarations: [
    AppComponent,
    FooterComponent,
    NavbarComponent,
    HomeComponent,
    CarritoComponent
  ],
  imports     : [
    BrowserModule, APP_ROUTING,
    FormsModule,
    HttpModule,
  ],
  providers   : [ AuthService, LibrosService, UsuariosService ],
  bootstrap   : [ AppComponent ]
} )
export class AppModule {
}
