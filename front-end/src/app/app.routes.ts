import { RouterModule, Routes } from '@angular/router';
import { CarritoComponent } from './component/carrito/carrito.component';
import { HomeComponent } from './component/home/home.component';

const ROUTES : Routes = [
  
  { path: 'home', component: HomeComponent },
  { path: 'shop', component: CarritoComponent },
  {
    path      : '',
    redirectTo: '/home',
    pathMatch : 'full'
  },
  {
    path      : '**',
    redirectTo: '/home',
    pathMatch : 'full'
  }
];

export class RoutingModule {
}

export const APP_ROUTING = RouterModule.forRoot ( ROUTES );
