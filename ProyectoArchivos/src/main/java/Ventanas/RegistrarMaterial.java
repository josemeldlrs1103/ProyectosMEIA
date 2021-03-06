/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static Clases.DatosUsuario.DatosList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author josei
 */
public class RegistrarMaterial extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarMaterial
     */
    public RegistrarMaterial() {
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
        jLabel6 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfTipo = new javax.swing.JTextField();
        tfImagen = new javax.swing.JTextField();
        tfTiempo = new javax.swing.JTextField();
        btCargarImagen = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Registrar Material");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Imagen:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Degradación:");

        tfNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfImagen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfTiempo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btCargarImagen.setText("Buscar Imagen");
        btCargarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCargarImagenMouseClicked(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btCargarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCargarImagen))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void btGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGuardarMouseClicked
        String lineaRegistrada;
        boolean MaterialExiste=false;
        try 
    { //Se busca al usuario ingresado en el archivo de texto
        FileReader Existencia1 = new FileReader("C:/MEIA/materiales_bitacora.txt");
        BufferedReader Material1 = new BufferedReader(Existencia1);
        while ((lineaRegistrada = Material1.readLine())!= null)
        {
            if (lineaRegistrada.contains(tfNombre.getText()))
            {
                MaterialExiste =true;
            }
        }
        Material1.close();
        Existencia1.close();
        if(!MaterialExiste)
        {
            FileReader Existencia2 = new FileReader("C:/MEIA/materiales.txt");
        BufferedReader Material2 = new BufferedReader(Existencia2);
        while ((lineaRegistrada = Material2.readLine())!= null)
        {
            if (lineaRegistrada.contains(tfNombre.getText()))
            {
                MaterialExiste =true;
            }
        }
        Material2.close();
        Existencia2.close();
        }
    } catch (Exception e) 
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        if(!MaterialExiste)
        {
            String Usuario = DatosList[0];
        Calendar FechaTransaccion = Calendar.getInstance();
        int Anio = FechaTransaccion.get(Calendar.YEAR);
        int Mes = FechaTransaccion.get(Calendar.MONTH);
        int Dia = FechaTransaccion.get(Calendar.DAY_OF_MONTH);
        String FechaRegistro = String.valueOf(Dia +"/"+Mes+"/"+ Anio);
        String InfoMaterial = tfNombre.getText() +"|"+ tfTipo.getText() +"|"+ tfImagen.getText() +"|"+ tfTiempo.getText()+"|"+Usuario+"|"+FechaRegistro+"|"+"1";
        File Registro = new File ("C:/MEIA/materiales_bitacora.txt");
                try {
                    FileWriter Registrar = new FileWriter(Registro, true);
                    Registrar.write(InfoMaterial+ "\n");
                    Registrar.close();JOptionPane.showMessageDialog(null, "Se ha registrado el material exitosamente");
                    this.setVisible(false);
                } catch (IOException ex) {
                    Logger.getLogger(CrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
        Reorganizar();
        ActualizarDescriptores();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El material ya existe");
        }
    }//GEN-LAST:event_btGuardarMouseClicked

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
            java.util.logging.Logger.getLogger(RegistrarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarMaterial().setVisible(true);
            }
        });
    }
    public static String MaterialNuevo;
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
public void Reorganizar ()
{
    String linealeida1,linealeida2;
    int numerolinea=0;
    ArrayList<String> MaterialesReorganizar = new ArrayList<String>();
    //Reorganización materiales-matarialesbitacora
    File BitacoraM = new File ("C:/MEIA/materiales_bitacora.txt");
    File MaterialesA = new File ("C:/MEIA/materiales.txt");
    ArrayList<String> lineasleidas2 = new ArrayList<String>();
    try { //Se busca al usuario ingresado en el archivo de texto
                FileReader Bitacoratxt = new FileReader("C:/MEIA/materiales_bitacora.txt");
                BufferedReader UsuarioBitacora = new BufferedReader(Bitacoratxt);
                while (((linealeida1 = UsuarioBitacora.readLine()) != null)) 
                {   
                    if (numerolinea < 3)
                    {
                        lineasleidas2.add(linealeida1);
                        numerolinea++;
                    }
                    else
                    {
                        MaterialNuevo = linealeida1;
                        numerolinea++;
                    }
                }
                UsuarioBitacora.close();
                Bitacoratxt.close();
                if ((numerolinea) == 4)
                {
                    BitacoraM.delete();
                    BitacoraM.createNewFile();
                    if (MaterialNuevo != null)
                    {
                        FileWriter GuardarNuevoMaterial = new FileWriter (BitacoraM, true);
                        GuardarNuevoMaterial.write(MaterialNuevo+"\n");
                        GuardarNuevoMaterial.close();
                    }
                    FileReader Usuariotxt = new FileReader("C:/MEIA/materiales.txt");
                    BufferedReader UsuarioFile = new BufferedReader(Usuariotxt);
                    while((linealeida2 = UsuarioFile.readLine())!= null)
                        {
                            lineasleidas2.add(linealeida2);
                        }
                    UsuarioFile.close();
                    Usuariotxt.close();
                    Collections.sort(lineasleidas2,String.CASE_INSENSITIVE_ORDER);
                    MaterialesA.delete();
                    MaterialesA.createNewFile();
                    FileWriter GuardarCambio = new FileWriter (MaterialesA, true);
                    for(var linea : lineasleidas2)
                    {
                        String [] VerificarEstado = linea.split("\\|");
                        if (VerificarEstado[6].equals("1"))
                        {
                            GuardarCambio.write(linea +"\n");
                        }
                    }
                    GuardarCambio.close();
                } 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    
}
public void ActualizarDescriptores()
{
    //Variables que se usan para la actualización de desc_bitacora
    int TotalR=0, TotalA = 0, TotalI=0;
    ArrayList<String> LineaDescriptor = new ArrayList<String>();
    File DescriptorBitacora = new File("C:/MEIA/desc_materialesbitacora.txt");
    String linealeida3 ="";
    try 
    { //Se busca al usuario ingresado en el archivo de texto
        FileReader Bitacora = new FileReader("C:/MEIA/materiales_bitacora.txt");
        BufferedReader BufferBitacora = new BufferedReader(Bitacora);
        while ((linealeida3 = BufferBitacora.readLine())!= null)
        {
            String[] VerificarEstado = linealeida3.split("\\|");
            if (VerificarEstado[6].equals("1"))
            {
                TotalA ++;
            }
            else
            {
                TotalI ++;
            }
        }
        BufferBitacora.close();
        Bitacora.close();
        TotalR = TotalA + TotalI;
        FileReader Descriptor = new FileReader("C:/MEIA/desc_materialesbitacora.txt");
        BufferedReader BufferDescriptor = new BufferedReader(Descriptor);
        while ((linealeida3 = BufferDescriptor.readLine())!= null)
        {
            LineaDescriptor.add(linealeida3);      
        }
        Calendar FechaTransaccion = Calendar.getInstance();
        int Anio = FechaTransaccion.get(Calendar.YEAR);
        int Mes = FechaTransaccion.get(Calendar.MONTH);
        int Dia = FechaTransaccion.get(Calendar.DAY_OF_MONTH);
        String Modificar = String.valueOf(Dia +"/"+Mes+"/"+ Anio);
        LineaDescriptor.set(2, ("F_modificación: " + Modificar));
        LineaDescriptor.set(4, ("cantidad_total: " + TotalR));
        LineaDescriptor.set(5, ("cantidad_activos: " + TotalA));
        LineaDescriptor.set(6, ("cantidad_inactivos: " + TotalI));
        BufferDescriptor.close();
        Descriptor.close();
        DescriptorBitacora.delete();
        DescriptorBitacora.createNewFile();
        FileWriter ModificarDescriptorBitacora = new FileWriter(DescriptorBitacora, true);
        for(String lineadesc : LineaDescriptor)
        {
            ModificarDescriptorBitacora.write(lineadesc + "\n");
        }
        ModificarDescriptorBitacora.close();
           
    } catch (Exception e) 
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
    //Variables que se usan para la actualización de desc_usuario
    int TotalRA=0, TotalAA = 0, TotalIA=0;
    ArrayList<String> RegistrosArchivo = new ArrayList<String>();
    File DescriptorArchivo = new File("C:/MEIA/desc_materiales.txt");
    String linealeida4 ="";
    try 
    { //Se busca al usuario ingresado en el archivo de texto
        FileReader Archivo = new FileReader("C:/MEIA/materiales.txt");
        BufferedReader BufferArchivo = new BufferedReader(Archivo);
        while ((linealeida4 = BufferArchivo.readLine())!= null)
        {
            String[] VerificarEstado = linealeida4.split("\\|");
            if (VerificarEstado[6].equals("1"))
            {
                TotalAA ++;
            }
            else
            {
                TotalIA ++;
            }
        }
        BufferArchivo.close();
        Archivo.close();
        TotalRA = TotalAA + TotalIA;
        FileReader DescriptorAr = new FileReader("C:/MEIA/desc_materiales.txt");
        BufferedReader BufferDescriptorAr = new BufferedReader(DescriptorAr);
        while ((linealeida4 = BufferDescriptorAr.readLine())!= null)
        {
            RegistrosArchivo.add(linealeida4);      
        }
        Calendar FechaTransaccion = Calendar.getInstance();
        int Anio = FechaTransaccion.get(Calendar.YEAR);
        int Mes = FechaTransaccion.get(Calendar.MONTH);
        int Dia = FechaTransaccion.get(Calendar.DAY_OF_MONTH);
        String Modificar = String.valueOf(Dia +"/"+Mes+"/"+ Anio);
        RegistrosArchivo.set(2, ("F_modificación: " + Modificar));
        RegistrosArchivo.set(3, ("cantiad_total: " + TotalRA));
        RegistrosArchivo.set(4, ("Cantidad_activos: " + TotalAA));
        RegistrosArchivo.set(5, ("Cantidad_inactivos: " + TotalIA));
        BufferDescriptorAr.close();
        DescriptorAr.close();
        DescriptorArchivo.delete();
        DescriptorArchivo.createNewFile();
        FileWriter ModificarDescriptorArchivo = new FileWriter(DescriptorArchivo, true);
        for(String lineadesc : RegistrosArchivo)
        {
            ModificarDescriptorArchivo.write(lineadesc + "\n");
        }
        
        ModificarDescriptorArchivo.close();           
    } catch (Exception e) 
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCargarImagen;
    private javax.swing.JButton btGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfImagen;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTiempo;
    private javax.swing.JTextField tfTipo;
    // End of variables declaration//GEN-END:variables
}
