/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;


import Clases.ArbolBinario;
import Clases.ArchivosIniciales;
import static Clases.DatosMateriales.ArbolMateriales;
import static Clases.DatosMateriales.ContadorNodos;
import static Clases.DatosMateriales.RegistrarNodos;
import Clases.Nodo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.lang.Object;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author josei
 */
public class RegistroBinario extends javax.swing.JFrame {

    /**
     * Creates new form RegistroBinario
     */
    public RegistroBinario() {
        ObtenerArbol();
        File ArchivoBinario = new File("C:\\MEIA\\Materiales2.txt");
        File DescriptorArchivoBinario = new File("C:\\MEIA\\des_Materiales2.txt");
        Date fecha = new Date();
        if (!ArchivoBinario.exists())
        {
            try {
                ArchivoBinario.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(RegistroBinario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (!DescriptorArchivoBinario.exists())
        {
            try {
                FileWriter writer = new FileWriter(DescriptorArchivoBinario, true); 
            writer.write("Nombre:Materiales 2 Bitacora\n");
            writer.write("F_creacion:"+fecha.toString()+"\n");
            writer.write("F_modificacion:"+fecha.toString()+"\n");
            writer.write("cantidad_total:0\n");
            writer.write("cantidad_activos:0\n");
            writer.write("cantidad_inactivos:0\n");
            writer.close();
            } catch (IOException ex) {
                Logger.getLogger(RegistroBinario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btCargarImagen = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        tfTipo = new javax.swing.JTextField();
        tfImagen = new javax.swing.JTextField();
        tfTiempo = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        cbAnio = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tfUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registrar Material");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Imagen:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Degradación:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Usuario:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Creación:");

        btCargarImagen.setText("Buscar Imagen");
        btCargarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCargarImagenMouseClicked(evt);
            }
        });

        tfNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfImagen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfTiempo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cbDia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Día");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Mes");

        cbMes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cbAnio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", " ", " " }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Año");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        tfUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(33, 33, 33)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(tfTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btCargarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(cbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCargarImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(cbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCargarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCargarImagenMouseClicked
        //Cargar la foto de perfil
        JFileChooser dialogo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Foto de perfil", "jpg");
        File ficheroImagen;
        String rutaArchivo;
        dialogo.setFileFilter(filtro);
        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();
            CopiarImagenes(ficheroImagen);
            tfImagen.setText(ImagenCopiada.getPath());
        }
    }//GEN-LAST:event_btCargarImagenMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       File Materiales2 = new File ("C:/MEIA/Materiales2.txt");
       Materiales2.delete();
       try 
       {
            Materiales2.createNewFile();
       } catch (IOException ex) 
       {
           Logger.getLogger(ArbolBinario.class.getName()).log(Level.SEVERE, null, ex);
       }
        String Nombre = tfNombre.getText();
       String Tipo = tfTipo.getText();
       String Imagen = tfImagen.getText();
       String Tiempo = tfTiempo.getText();
       String Usuario = tfUsuario.getText();
       String Dia= String.valueOf(cbDia.getSelectedItem());
       String Mes = String.valueOf(cbMes.getSelectedItem());
       String Año = String.valueOf(cbAnio.getSelectedItem());
       String Fecha = Dia + "/" + Mes + "/" + Año;
       ContadorNodos++;
       String Cadena = ContadorNodos+"|"+Nombre+"|"+Tipo+"|"+Imagen+"|"+Tiempo+"|"+Usuario+"|"+Fecha;
       ArbolMateriales.AgregarNodo(Cadena);
       //ArbolBinario ArbolMateriales = new ArbolBinario();
       //ArbolMateriales.AgregarNodo(Nombre, Tipo, Imagen, Tiempo, Usuario, Fecha);
       //EscribirArbolEnArchivo(ArbolMateriales.raiz);
       JOptionPane.showMessageDialog(null, "Registro completado");
       RegistrarNodos.clear();
       ArbolMateriales.PreOrden();
       ArbolMateriales.Raiz = null;
       EscribirArchivo();
       ActualizarDescriptor();
       this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroBinario().setVisible(true);
            }
        });
    }
    String HijoIzq;
    String HijoDer;
    File ImagenCopiada;
    public void CopiarImagenes(File origen) {
        //Copiar la imagen a la carpeta MEIA
        String ruta_destino = "C:\\MEIA\\fotografia";
        File ruta = new File(ruta_destino);       
        File nuevo = new File(ruta_destino + "\\" + origen.getName());
        try {
            Files.copy(Paths.get(origen.getAbsolutePath()), Paths.get(nuevo.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
            ImagenCopiada = new File(ruta_destino + "\\" + origen.getName());
        } catch (Exception e) {
        }
    }
    public void ObtenerArbol()
    {
        ContadorNodos=0;
        ArbolMateriales.Raiz = null;
        String linealeida1;
        try { //Se busca al usuario ingresado en el archivo de texto
                FileReader BitacoraMateriales = new FileReader("C:/MEIA/Materiales2.txt");
                BufferedReader MaterialesBitacora = new BufferedReader(BitacoraMateriales);
                while (((linealeida1 = MaterialesBitacora.readLine()) != null)) 
                {   
                    ContadorNodos++;
                    String[]Separar = linealeida1.split("\\|");
                    String RegistroPrevio = Separar[0]+"|"+Separar[3]+"|"+Separar[4]+"|"+Separar[5]+"|"+Separar[6]+"|"+Separar[7]+"|"+Separar[8]+"|"+Separar[9];
                    ArbolMateriales.AgregarNodo(RegistroPrevio);
                }
                MaterialesBitacora.close();
                BitacoraMateriales.close();                     
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }
    public void EscribirArchivo()
    {
        Collections.sort(RegistrarNodos);
        try {
            FileWriter GuardarNodo = new FileWriter("C:/MEIA/Materiales2.txt", true);
            for(String Linea: RegistrarNodos)
            {
                GuardarNodo.write(Linea);
            }
            GuardarNodo.close();
        } catch (IOException ex) {
            Logger.getLogger(RegistroBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
        int prueba =1;
    }
    public void ActualizarDescriptor()
    {
        ArrayList<String> CantidadRegistros = new ArrayList<String>();
        int A=0, I=0, T=0;
        String linealeida1;
        try { //Se busca al usuario ingresado en el archivo de texto
                FileReader BitacoraMateriales = new FileReader("C:/MEIA/Materiales2.txt");
                BufferedReader MaterialesBitacora = new BufferedReader(BitacoraMateriales);
                while (((linealeida1 = MaterialesBitacora.readLine()) != null)) 
                {   
                    String[]Separar = linealeida1.split("\\|");
                    if (Separar[9].equals("1"))
                    {
                        A++;
                    }
                    else
                    {
                        I++;
                    }
                }
                MaterialesBitacora.close();
                BitacoraMateriales.close();
                T=A+I;           
                /////////////////////////////////////////////////////////////////////////////////////
                FileReader Materiales2Descriptor = new FileReader("C:/MEIA/des_Materiales2.txt");
                BufferedReader Materiales2Lector = new BufferedReader(Materiales2Descriptor);
                while (((linealeida1 = Materiales2Lector.readLine()) != null)) 
                {   
                    CantidadRegistros.add(linealeida1);
                }
                Materiales2Lector.close();
                Materiales2Descriptor.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        Calendar FechaTransaccion = Calendar.getInstance();
        int Anio = FechaTransaccion.get(Calendar.YEAR);
        int Mes = FechaTransaccion.get(Calendar.MONTH);
        int Dia = FechaTransaccion.get(Calendar.DAY_OF_MONTH);
        String Modificar = String.valueOf(Dia +"/"+Mes+"/"+ Anio);
        CantidadRegistros.set(2, ("F_modificación: " + Modificar));
        CantidadRegistros.set(3, ("cantidad_total: " + T));
        CantidadRegistros.set(4, ("cantidad_activos: " + A));
        CantidadRegistros.set(5, ("cantidad_inactivos: " + I));
        File DescriptorMateriales = new File("C:/MEIA/des_Materiales2.txt");
        DescriptorMateriales.delete();
        try {
            DescriptorMateriales.createNewFile();
            FileWriter ActualizarArchivoBin = new FileWriter(DescriptorMateriales, true);
            for(String linea : CantidadRegistros)
            {
                ActualizarArchivoBin.write(linea+"\n");
            }
            ActualizarArchivoBin.close();
        } catch (IOException ex) {
            Logger.getLogger(RegistroBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCargarImagen;
    private javax.swing.JComboBox<String> cbAnio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfImagen;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTiempo;
    private javax.swing.JTextField tfTipo;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
