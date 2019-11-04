/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author josei
 */
public class Backup {
    public void MakeBackup(String RutaSalida,String Usuario)
    {
        BitacoraRespaldos(RutaSalida,Usuario);
        File original = new File("C:\\MEIA");        
        File copia = new  File(RutaSalida+"\\MEIA_BACKUP");
        copiar_directorios(original, copia);
        JOptionPane.showMessageDialog(null, "BackUp Finalizado ubicación: "+ copia.toString());
    }
    public static void copiar_archivos(File original, File copia)
    {
        try {
            InputStream entrada = new FileInputStream(original);
            OutputStream salida = new FileOutputStream(copia);
            byte[] buffer = new byte[1024];
            int datos;
            while ((datos = entrada.read(buffer)) > 0) 
            {
                salida.write(buffer, 0, datos);                
            }
            entrada.close();
            salida.close();
            System.out.println("Copiando" + original.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void copiar_directorios(File original, File copia)
    {
        if (original.isDirectory()) {
            if (!copia.exists()) {
                copia.mkdir();
                System.out.println("Creando directorio"+ copia.toString());
            }
            String [] archivos = original.list();
            for (int x = 0; x < archivos.length; x++) {
                copiar_directorios(new File(original, archivos[x]), new File(copia, archivos[x]));
            }
        } else
        {
            copiar_archivos(original, copia);
        }
    }
    public static void BitacoraRespaldos (String RutaAbs, String Usuario)
    {
        Calendar FechaTransaccion = Calendar.getInstance();
        int Anio = FechaTransaccion.get(Calendar.YEAR);
        int Mes = FechaTransaccion.get(Calendar.MONTH);
        int Dia = FechaTransaccion.get(Calendar.DAY_OF_MONTH);
        int Hora = FechaTransaccion.get(Calendar.HOUR_OF_DAY);
        int Minuto = FechaTransaccion.get(Calendar.MINUTE);
        int Segundo = FechaTransaccion.get(Calendar.SECOND);
        String FechaBack = String.valueOf(Dia +"/"+Mes+"/"+ Anio+" "+Hora+":"+Minuto+":"+Segundo);
        String Registro = RutaAbs + "|" + Usuario + "|" + FechaBack;
        File Fichero = new File ("C:/MEIA/bitacora_backup.txt");
        try {
            String linealeida ="";
            ArrayList<String> CopiasHechas = new ArrayList<String>();
            FileReader Copias = new FileReader("C:/MEIA/bitacora_backup.txt");
            BufferedReader FechaCopias = new BufferedReader(Copias);
            while((linealeida = FechaCopias.readLine())!= null)
            {
                CopiasHechas.add(linealeida);
            }
            FechaCopias.close();
            Copias.close();
            Fichero.delete();
            Fichero.createNewFile();
            FileWriter RBackUp = new FileWriter(Fichero, true);
            RBackUp.write(Registro+"\n");
            for(String RCopia : CopiasHechas)
            {
                RBackUp.write(RCopia+"\n");
            }
            RBackUp.close(); 
        } catch (IOException ex) {
            Logger.getLogger(Backup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
