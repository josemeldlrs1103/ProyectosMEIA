/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.DatosMateriales.ContadorNodos;
import static Clases.DatosMateriales.RegistrarNodos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josei
 */
public class ArbolBinario 
{
    public Nodo Raiz;
	public boolean AgregarNodo(String Cadena) {
		if (Raiz == null) {
			Raiz = new Nodo(Cadena);
			return true;
		}
		else 
			return Raiz.Insertar(Cadena);
	}
	
	public boolean Buscar(String Cadena) {
		if (Raiz == null) 
			return false;
		else 
			return Raiz.BuscarNodo(Cadena);
	}
	public void PreOrden() {
		if (Raiz != null) {
			System.out.println("Preorden:");
			Raiz.Preorden();
		}
	}
	private class Nodo {
		private Nodo HijoIzq;
		private Nodo HijoDer;
                private int Indice;
		private String Nombre;
                private String Tipo;
                private String Imagen;
                private String Tiempo;
                private String Usuario;
                private String Creacion;
                private String Estado;
		private Nodo(String Cadena) {
			String[] Campos = Cadena.split("\\|");
                        Indice = Integer.parseInt(Campos[0]);
			Nombre = Campos[1]; 
                        Tipo = Campos[2]; 
                        Imagen = Campos[3]; 
                        Tiempo = Campos[4];
                        Usuario = Campos[5]; 
                        Creacion = Campos[6];
                        Estado = "1";
			HijoIzq = null;
			HijoDer = null;
		}
		private boolean Insertar(String Cadena) {
			boolean Agregado = false;
                        String[] Campos = Cadena.split("\\|");
			if (this == null) 
                        {         
			    Indice = Integer.parseInt(Campos[0]);
			    Nombre = Campos[1]; 
                            Tipo = Campos[2]; 
                            Imagen = Campos[3]; 
                            Tiempo = Campos[4];
                            Usuario = Campos[5]; 
                            Creacion = Campos[6];
                            Estado = "1";
			}
			else {
				if (Campos[1].compareToIgnoreCase(this.Nombre) < 0 ) {
					if (this.HijoIzq == null) {
						this.HijoIzq = new Nodo(Cadena);
						return true;
					}
					else 
						Agregado = this.HijoIzq.Insertar(Cadena);
				}
				else if (Campos[1].compareToIgnoreCase(this.Nombre) > 0) {
					if (this.HijoDer == null) {
						this.HijoDer = new Nodo(Cadena);
						return true;
					}
					else
						Agregado = this.HijoDer.Insertar(Cadena);
				}
			}
			return Agregado;
		}
		private boolean BuscarNodo(String Cadena) {
			boolean Encontrado = false;
			String[] Campos = Cadena.split("\\|");
                        if (this == null) 
				return false;
			else {
				if (Campos[0] == this.Nombre)
					return true;                        
				else if (Campos[0].compareTo(this.Nombre) < 0  && this.HijoIzq != null)
					Encontrado = this.HijoIzq.BuscarNodo(Cadena);
				else if (Campos[0].compareTo(this.Nombre) > 0 && this.HijoDer != null)
					Encontrado = this.HijoDer.BuscarNodo(Cadena);
			}
			return Encontrado;
		}
		private void Preorden() 
                {
                    File Materiales2 = new File ("C:/MEIA/Materiales2.txt");
                    
                        if (this != null) 
                    {
                        String MaterialIzq;
                        String MaterialDer;
                        if (this.HijoIzq==null)
                        {
                            MaterialIzq = "-1";
                        }
                        else
                        {
                            MaterialIzq = this.HijoIzq.Nombre;
                        }
                        if (this.HijoDer == null)
                        {
                            MaterialDer = "-1";
                        }
                        else
                        {
                            MaterialDer = this.HijoDer.Nombre;
                        }
                        //FileWriter EscribirNodo = new FileWriter (Materiales2, true);
                        //EscribirNodo.write(MaterialIzq+"|"+MaterialDer+"|"+this.Nombre+"|"+this.Tipo+"|"+this.Imagen+"|"+this.Tiempo+"|"+this.Usuario+"|"+this.Creacion+"|"+this.Estado+"\n");
			//EscribirNodo.close();
                        RegistrarNodos.add(this.Indice+"|"+MaterialIzq+"|"+MaterialDer+"|"+this.Nombre+"|"+this.Tipo+"|"+this.Imagen+"|"+this.Tiempo+"|"+this.Usuario+"|"+this.Creacion+"|"+this.Estado+"\n");
                        
                        
                        if (this.HijoIzq != null)
                        {
                            this.HijoIzq.Preorden();
                        }
                        if (this.HijoDer != null)
                        {
                            this.HijoDer.Preorden();
			}
                    }
		}
	}
}
