package Clase90DisenoDClases;
/*=================================DISE;O DE CLASES=================
 * Es la relacion entre varias clases que tienen contacto entre si.
 * es un sistema multiproposito, 
 * -Las clases se relacionan por UML(universal model lenguaje) que define como deben de interactuar los OBJETOS 
 * [relacion de agregacion]=Esta relacion indica que una clase Ejemplo: la clase de tipo Orden, contiene varios productos(hace resumen
 * de los productos que se van a vender en particular),  
 * package com.gm.ventas-------------------------------------------------------------------
 *                                                                                         |
 *                      Orden(clase)                                                       + ventas    (clasee)
 *                                                                                            main(String []):void
 *                -iDOrden:int
 *                -productos[]:Producto                    (atributos)
 *                ______________________________________________________         
 *                +Orden()
 *                +agregar (producto:producto ):booolean
 *                +calcularTotal():double                   (metodos)
 *                +mostrarOrden():void
 *                ||||||||||||||||||||||||||||||||||||||||||||||||||||||||
 *                     Producto(clase)
 *                     
 *                 -idProducto:int
 *                 -nombre:String                          (atributos)
 *                 -precio:double
 *                 _______________________
 *                 +Producto()
 *                 +Producto(String, String)
 *                 +getNombre():String
 *                 +getPrecio():double
 *                 +setNombre(String):void
 *                 +setPrecio(double):void
 *                 +toString():String
 *                 
 * 
 * */
public class DisenoClases {

}
