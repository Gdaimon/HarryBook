import { Component, OnInit } from '@angular/core';
import 'rxjs/add/operator/map';
import { LibrosService } from '../../services/libros.service';

@Component ( {
  selector   : 'app-home',
  templateUrl: './home.component.html',
  styleUrls  : [ './home.component.css' ]
} )
export class HomeComponent implements OnInit {
  listaCarrito : any[];
  listaLibros : any[];
  
  constructor ( private _librosService : LibrosService ) {
    this.listaLibros = this._librosService.getLibros ();
    console.log ( this.listaLibros );
  }
  
  ngOnInit () {
  }
  
  public agregarCarrito ( libro : any ) {
    console.log ( libro );
    // this.listaCarrito.push ( libro );
    // console.log ( this.listaCarrito );
  }
  
  adicionarLibro ( noLibro : any, libro : any ) {
    console.log ( parseInt ( noLibro ) );
  }
}
