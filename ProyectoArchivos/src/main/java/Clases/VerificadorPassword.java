/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author josei
 */
public class VerificadorPassword {
    public static String[] Resultados = new String[8];
    public static String[] Puntos = new String[8];
    public int Verificar (String Contrasena)
    {
        String Contras = Contrasena;
        int Calculo=0, CantidadMayus =0, CantidadNum=0, CantidadLetras =0, CantidadEspeciales=0;
        //Archivo resultado       
            File resultado = new File("C:\\MEIA\\resultado.txt");
            try {
                FileReader fr = new FileReader(resultado);
                BufferedReader br = new BufferedReader(fr);
                int Contador=0;
                String linea;
                while((linea = br.readLine()) != null)
                {
                    String [] Valores = linea.split(",");
                    Resultados[Contador] = Valores[0];
                    Resultados[Contador+1] = Valores[1];
                    Contador+=2;
                }
                System.out.println(linea);
                fr.close();
                }
            catch(Exception e) {
                System.out.println("Excepcion leyendo fichero "+ resultado + ": " + e);
            }
            //Archivo puntuacion       
            File puntuacion = new File("C:\\MEIA\\puntuacion.txt");
            try {
                FileReader fr = new FileReader(puntuacion);
                BufferedReader br = new BufferedReader(fr);
                int Contador=0;
                String linea;
                while((linea = br.readLine()) != null)
                {
                    Puntos[Contador] = linea;
                    Contador++;
                }
                System.out.println(linea);

                fr.close();
                }
            catch(Exception e) {
                System.out.println("Excepcion leyendo fichero "+ puntuacion + ": " + e);
            }
            String Snum1,Snum2,Snum3,Snum4,Snum5,Snum6,Snum7,Snum8;
        Snum1 = Puntos[0];
        Snum2 = Puntos[1];
        Snum3 = Puntos[2];
        Snum4 = Puntos[3];
        Snum5 = Puntos[4];
        Snum6 = Puntos[5];
        Snum7 = Puntos[6];
        Snum8 = Puntos[7];
        int num1,num2,num3,num4,num5,num6,num7,num8;
        num1 = Integer.parseInt(Snum1);
        num2 = Integer.parseInt(Snum2);
        num3 = Integer.parseInt(Snum3);
        num4 = Integer.parseInt(Snum4);
        num5 = Integer.parseInt(Snum5);
        num6 = Integer.parseInt(Snum6);
        num7 = Integer.parseInt(Snum7);
        num8 = Integer.parseInt(Snum8);
        //Separar rangos líneas del archivo resultado
        String Sres1,Sres2,Sres3,Sres4,Sres5,Sres6,Sres7,Sres8;
        Sres1 = Resultados[0];
        Sres2 = Resultados[1];
        Sres3 = Resultados[2];
        Sres4 = Resultados[3];
        Sres5 = Resultados[4];
        Sres6 = Resultados[5];
        Sres7 = Resultados[6];
        Sres8 = Resultados[7];
        int res1,res2,res3,res4,res5,res6,res7,res8;
        res1 = Integer.parseInt(Sres1);
        res2 = Integer.parseInt(Sres2);
        res3 = Integer.parseInt(Sres3);
        res4 = Integer.parseInt(Sres4);
        res5 = Integer.parseInt(Sres5);
        res6 = Integer.parseInt(Sres6);
        res7 = Integer.parseInt(Sres7);
        res8 = Integer.parseInt(Sres8);
        char[] CaracteresContrasena = Contrasena.toCharArray();
        for (char Caracter: CaracteresContrasena)
        {
            if (Character.isUpperCase(Caracter))
            {
                CantidadMayus++;
            }
            if (Character.isDigit(Caracter))
            {
                CantidadNum++;
            }
            if(Character.isLetter(Caracter))
            {
                CantidadLetras++;
            }
            if(!Character.isLetter(Caracter)&& !Character.isDigit(Caracter))
            {
                CantidadEspeciales++;
            }
        }
        if(Contrasena.length()< num1 )
        {
            JOptionPane.showMessageDialog(null, "La contraseña no puede tener menos de " + num1 + " caracteres");
            return 0;
        }
        else
        {
            int largo = Contrasena.length();
            Calculo = num2 * largo;
            Calculo = Calculo +(num3*CantidadMayus);
            Calculo = Calculo +(CantidadLetras + num4);
            Calculo = Calculo +(CantidadNum + num5);
            Calculo = Calculo + CantidadEspeciales * largo + num6;
            if (CantidadNum == 0)
            {
                Calculo = Calculo - num7;
            }
            if(CantidadLetras==0)
            {
                Calculo = Calculo - num8;
            }
            if (Calculo >= res1 && Calculo <= res2)
            {
                JOptionPane.showMessageDialog(null, "Contraseña insegura, cambie la contraseña");                
                return 0;
            }
            if (Calculo >= res3 && Calculo < res4)
            {
                JOptionPane.showMessageDialog(null, "Contraseña poco segura");
                return 0;
            }
            if (Calculo >= res5 && Calculo <= res6)
            {
                JOptionPane.showMessageDialog(null, "Contraseña segura");
                return 1;
            }
            if (Calculo >= res7 && Calculo <= res8)
            {
                JOptionPane.showMessageDialog(null, "Contraseña muy segura");
                return 1;
            }
            if (Calculo > res8)
            {
                JOptionPane.showMessageDialog(null, "Contraseña es muy segura");
                return 1;
            }   
        }
        return 0;
    }
}
