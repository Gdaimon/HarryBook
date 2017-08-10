import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable ()
export class LibrosService {
  
  url : string;
  listLibros : any[];
  
  constructor ( private _http : Http ) {
    // this.url = 'http://apirest-apirest.7e14.starter-us-west-2.openshiftapps.com/APIharry/api/';
    this.crearLibros ();
  }
  
  
  public getLibros () {
    // console.log ( `${this.url}libros` );
    // return this._http.get ( `${this.url}libros` );
    return this.listLibros;
  }
  
  public crearLibros () {
    this.listLibros = [
      {
        cantidad: 10,
        codigo  : 1,
        img     : 'https://imagessl2.casadellibro.com/a/l/t0/62/9788498382662.jpg',
        nombre  : 'Harry Potter y la Piedra Filosofal',
        precio  : 50,
        pedido  : 0
      },
      {
        cantidad: 5,
        codigo  : 2,
        img     : 'https://imagessl7.casadellibro.com/a/l/t0/57/9788478884957.jpg',
        nombre  : 'Harry Potter y la cámara secreta',
        precio  : 27,
        pedido  : 0
      },
      {
        cantidad: 0,
        codigo  : 3,
        img     : 'https://imagessl0.casadellibro.com/a/l/t0/90/9788478885190.jpg',
        nombre  : 'Harry Potter y el prisionero de Azkaban',
        precio  : 44,
        pedido  : 0
      },
      {
        cantidad: 3,
        codigo  : 4,
        img     : 'https://imagessl6.casadellibro.com/a/l/t0/56/9788478886456.jpg',
        nombre  : 'Harry Potter y el cáliz de fuego',
        precio  : 10,
        pedido  : 0
      },
      {
        cantidad: 17,
        codigo  : 5,
        img     : 'http://salamandra.info/sites/default/files/books/images/hires/hp_y_la_orden_del_fenix_-_imprimir_300dpi.jpg',
        nombre  : 'Harry Potter y la Orden del Fénix',
        precio  : 65,
        pedido  : 0
      },
      {
        cantidad: 0,
        codigo  : 6,
        img     : 'http://salamandra.info/sites/default/files/books/images/hires/hp_y_el_misterio_del_principe-imprimir_300_dpi.jpg',
        nombre  : 'Harry Potter y el misterio del príncipe',
        precio  : 12,
        pedido  : 0
      },
      {
        cantidad: 22,
        codigo  : 7,
        img     : 'https://imagessl5.casadellibro.com/a/l/t0/05/9788498381405.jpg',
        nombre  : 'Harry Potter y las Reliquias de la Muerte',
        precio  : 43,
        pedido  : 0
      },
      {
        cantidad: 9,
        codigo  : 8,
        img     : 'https://imagessl4.casadellibro.com/a/l/t0/44/9788498387544.jpg',
        nombre  : 'Harry Potter y el legado maldito',
        precio  : 23,
        pedido  : 0
      }
    ];
  }
  
  
}
