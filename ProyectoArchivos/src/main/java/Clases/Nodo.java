/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author josei
 */
public class Nodo {
    public String Nombre;
    public String Tipo;
    public String Imagen;
    public String Degradacion;
    public String Usuario;
    public String Creacion;
    public String Estatus;
    public Nodo HIzquierdo;
    public Nodo HDerecho;
    Nodo(String nombre, String tipo, String imagen, String tiempo, String usuario, String fecha)
    {
        this.Nombre = nombre;
        this.Tipo = tipo;
        this.Imagen = imagen;
        this.Degradacion = tiempo;
        this.Usuario = usuario;
        this.Creacion = fecha;
        this.Estatus = "1";
    }
}
