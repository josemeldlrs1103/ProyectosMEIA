/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author josei
 */
public class ArchivosIniciales {
    public void Creacion()
    {
        //bitacora y respectivo descriptor
        File Bitacora = new File("C:\\MEIA\\bitacora.txt");
        File Descriptor_Bitacora = new File("C:\\MEIA\\desc_bitacora.txt");
        //Backup y respectivo descriptor
        File BitacoraBackUp = new File("C:\\MEIA\\bitacora_backup.txt");
        File Descriptor_BitacoraBackUp = new File("C:\\MEIA\\desc_bitacora_backup.txt");
        //Usuario y respectivo descriptor
        File Usuario = new File("C:\\MEIA\\usuario.txt");
        File Descriptor_Usuario = new File("C:\\MEIA\\desc_usuario.txt");
        //CREACION DE ARCHIVOS PUNTUACION Y RESULTADO
        File puntuacion = new File("C:\\MEIA\\puntuacion.txt");
        File resultado = new File("C:\\MEIA\\resultado.txt");
        //creacion de la carpteta de imagenes
        File Imagenes = new File("C:\\MEIA\\fotografia");
        if (!Imagenes.exists()) {
                Imagenes.mkdir();//Creacion de la carpeta contenedoras de las imágenes
        }
        //Creacion de los archivos normales
        try {
            Bitacora.createNewFile();
            BitacoraBackUp.createNewFile();
            Usuario.createNewFile();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //Creacion de los descriptores
        try {
            Date fecha = new Date();
            //Descriptor bitacora
            FileWriter writer = new FileWriter(Descriptor_Bitacora, true); 
            writer.write("Nombre:Bitacora\n");
            writer.write("F_creacion:"+fecha.toString()+"\n");
            writer.write("Usuario_Creacion:\n");
            writer.write("F_modificacion:"+fecha.toString()+"\n");
            writer.write("Max_organizacion:5\n");
            writer.write("cantidad_total:0\n");
            writer.write("cantidad_activos:0\n");
            writer.write("cantidad_inactivos:0\n");
            writer.close();
            //Creacion del descriptor backup si no existe
            FileWriter writerBackup = new FileWriter(Descriptor_BitacoraBackUp, true);
            writerBackup.write("Nombre:Backup\n");
            writerBackup.write("F_creacion:"+fecha.toString()+"\n");
            writerBackup.write("Usuario_Creacion:\n");
            writerBackup.write("F_modificacion:"+fecha.toString()+"\n");
            writerBackup.write("ubicacion:\n");
            writerBackup.write("ubicacion_origen:C:\\MEIA\n");
            writerBackup.close();
            //Creacion del descriptor usuarios si no existe
            FileWriter writerUsuarios = new  FileWriter(Descriptor_Usuario, true);
            writerUsuarios.write("Nombre:usuario\n");
            writerUsuarios.write("F_creacion:"+fecha.toString()+"\n");
            writerUsuarios.write("Usuario_Creacion:\n");
            writerUsuarios.write("F_modificacion:"+fecha.toString()+"\n"); 
            writerUsuarios.write("cantidad_total:0\n");
            writerUsuarios.write("cantidad_activos:0\n");
            writerUsuarios.write("cantidad_inactivos:0\n");
            writerUsuarios.close();
            //Archivo puntuación para evaluación de contraseña
            FileWriter writerPuntuacion = new  FileWriter(puntuacion, true);
            writerPuntuacion.write("6\n");
            writerPuntuacion.write("3\n");
            writerPuntuacion.write("2\n");
            writerPuntuacion.write("1\n");
            writerPuntuacion.write("2\n");
            writerPuntuacion.write("4\n");
            writerPuntuacion.write("6\n");
            writerPuntuacion.write("3");
            writerPuntuacion.close();
            //Archivo resultados para evaluación de contraseña
            FileWriter writerResultado = new  FileWriter(resultado, true);
            writerResultado.write("0,20\n");
            writerResultado.write("21,30\n");
            writerResultado.write("31,45\n");
            writerResultado.write("46,100");
            writerResultado.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    }
}
