/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static Clases.DatosMateriales.Indice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author josei
 */
public class BuscarDonacion extends javax.swing.JFrame {

    /**
     * Creates new form BuscarDonacion
     */
    public BuscarDonacion() {
        initComponents();
        String linealeida1="";
        ArrayList<String> Donadores = new ArrayList<String>();
        ArrayList<String> Opciones = new ArrayList<String>();
        try { //Se busca al usuario ingresado en el archivo de texto
                FileReader BitacoraMateriales = new FileReader("C:/MEIA/materiales_bitacora.txt");
                BufferedReader MaterialesBitacora = new BufferedReader(BitacoraMateriales);
                while (((linealeida1 = MaterialesBitacora.readLine()) != null)) 
                {   
                    String [] ExtraerMaterial = linealeida1.split("\\|");
                    Opciones.add(ExtraerMaterial[0]);
                }
                MaterialesBitacora.close();
                BitacoraMateriales.close();
                FileReader Materiales = new FileReader("C:/MEIA/materiales.txt");
                BufferedReader Materialestxt = new BufferedReader(Materiales);
                while (((linealeida1 = Materialestxt.readLine()) != null)) 
                {   
                    String [] ExtraerMaterial = linealeida1.split("\\|");
                    Opciones.add(ExtraerMaterial[0]);
                }
                Materialestxt.close();
                Materiales.close();
                ////////////////////////////////////////////////////////////////////
                FileReader DonadoresRegistro = new FileReader("C:/MEIA/bitacora.txt");
                BufferedReader DonadoresBitacora = new BufferedReader(DonadoresRegistro);
                while (((linealeida1 = DonadoresBitacora.readLine()) != null)) 
                {   
                    String [] NombreDonador = linealeida1.split("\\|");
                    Donadores.add(NombreDonador[0]);
                }
                DonadoresBitacora.close();
                DonadoresRegistro.close();
                FileReader DonadoresArchivo = new FileReader("C:/MEIA/usuario.txt");
                BufferedReader DonadoresLector = new BufferedReader(DonadoresArchivo);
                while (((linealeida1 = DonadoresLector.readLine()) != null)) 
                {   
                    String [] NombreDonador = linealeida1.split("\\|");
                    Donadores.add(NombreDonador[0]);
                }
                DonadoresLector.close();
                DonadoresArchivo.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        for(String mat : Opciones)
        {
            this.cbMaterial.addItem(mat);
        }
        for(String Don : Donadores)
        {
            this.cbDonador.addItem(Don);
        }
        tfDia.setValue(Integer.class);
    }
public String BuscarDonacion(String usuario, String material, String fecha)
    {
        String resultado = null;
        String llaveBuscar = usuario + "," + material + "," + fecha;
        File index = new File("C:\\MEIA\\DonacionIndex.txt");
        if (index.exists()){
            try {
                FileReader indexfr = new FileReader(index);
                BufferedReader indexbr = new BufferedReader(indexfr);
                String linea = indexbr.readLine();
                String llaveLeida = "";
                while (linea!=null){
                    llaveLeida = linea.split("\\,")[0] + "," + linea.split("\\,")[1] + "," + linea.split("\\,")[2];
                    if (llaveLeida.equals(llaveBuscar)){
                        resultado = linea.split("\\,")[3];
                        linea = null;
                    }else{
                        linea = indexbr.readLine();
                    }
                }
                indexfr.close();
                indexbr.close();
            } catch (IOException ex) {
                Logger.getLogger(PanelAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultado;
    }



public void ResultadoBusqueda(String usuario, String material, String fecha)
{
    String resultado = BuscarDonacion(usuario, material, fecha);
    if (resultado!=null){
        // guardar Resultado en variable global
        JOptionPane.showMessageDialog(null, "Donacion encontrada en direccion:" + resultado);
        Indice = resultado;
        VerDonacion don = new VerDonacion();
        don.setVisible(true);
    } else{
        JOptionPane.showMessageDialog(null, "No se ha encontrado ninguna doncaicon con esos datos.");
    }
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
        cbMaterial = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        cbYear = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfDia = new javax.swing.JFormattedTextField();
        cbDonador = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Material:");

        jLabel3.setText("Fecha:");

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));

        jButton1.setText("Buscar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbDonador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbDonador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String usuario = String.valueOf(cbDonador.getSelectedItem());
        String material = cbMaterial.getSelectedItem().toString();
        String fecha = tfDia.getText() + "/" + cbMes.getSelectedItem() + "/" + cbYear.getSelectedItem();
        ResultadoBusqueda(usuario,material,fecha);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        EliminarDonacion();
        EliminarDonacionIndex();
        ActualizarDescriptores();
        ActualizarDescriptorIndexDonacion();
    }//GEN-LAST:event_jButton2MouseClicked

     public void ActualizarDescriptores()
    {
        int Bloque = 1;
        int registros = 0;
        String inicioDesc = "C:\\MEIA\\DonacionDescriptor_";
        String inicioFile = "C:\\MEIA\\Donacion_";
        String ext = ".txt";
        String rutaDesc = inicioDesc+Bloque+ext;
        String rutaFile = inicioFile+Bloque+ext;
        File fD = new File(rutaDesc);
        File fF = new File(rutaFile);
        FileReader filefr = null;
        BufferedReader filebr = null;
        FileWriter descfw = null;
        BufferedWriter descbw = null;
        String lineaFile = "";
        String adminuser = "";
        while(fF.exists()){
            try {
                filefr = new FileReader(rutaFile);
                filebr = new BufferedReader(filefr);
                lineaFile = filebr.readLine();
                while(lineaFile!=null){
                    registros++;
                    lineaFile = filebr.readLine();
                }
                filefr.close();
                filebr.close();
                if (fD.exists()) {
                    fD.delete();
                }
                fD.createNewFile();
                descfw = new FileWriter(rutaDesc);
                descbw = new BufferedWriter(descfw);
                String nombreArchivo = "Nombre del archivo:Donacion_"+Bloque+ext;
                String usuarioCreador = "Usuario creador:";
                File usuarios = new File("C:\\MEIA\\usuario.txt");
                if (usuarios.exists()) {
                    FileReader usuariofr = new FileReader(usuarios);
                    BufferedReader usuariosbr = new BufferedReader(usuariofr);
                    String tempUser = usuariosbr.readLine();
                    if (tempUser!=null){
                        usuarioCreador += tempUser.split("\\|")[0];
                    }else{
                        File bitacora = new File("C:\\MEIA\\bitacora.txt");
                        if (bitacora.exists()){
                            FileReader bitacorafr = new FileReader(bitacora);
                            BufferedReader bitacorabr = new BufferedReader(bitacorafr);
                            tempUser = bitacorabr.readLine();
                            if (tempUser!=null){
                            usuarioCreador += tempUser.split("\\|")[0];
                            }
                            bitacorabr.close();
                        }
                    }
                    usuariofr.close();
                    usuariosbr.close();
                }
                Date fdate = new Date();
                String fecha = "Fecha de creacion:"+ fdate.getDay() +"/"+ fdate.getMonth() +"/2019";
                String cantidadregistros = "Cantidad de registros:" + registros;
                String cantidadregistrosactivos = "Cantidad de registros activos:" + registros;
                String cantidadregistrosinactivos = "Cantidad de registros inactivos:" + 0;
                String maxporbloquedato = "Maximos por bloque:" + 3;
                descbw.write(nombreArchivo);
                descbw.newLine();
                descbw.write(usuarioCreador);
                descbw.newLine();
                descbw.write(fecha);
                descbw.newLine();
                descbw.write(cantidadregistros);
                descbw.newLine();
                descbw.write(cantidadregistrosactivos);
                descbw.newLine();
                descbw.write(cantidadregistrosinactivos);
                descbw.newLine();
                descbw.write(maxporbloquedato);
                descbw.newLine();
                //descfw.close();
                descbw.close();
            } catch (IOException ex) {
                Logger.getLogger(HacerDonación.class.getName()).log(Level.SEVERE, null, ex);
            }
            Bloque++;
            registros = 0;
            rutaDesc = inicioDesc+Bloque+ext;
            rutaFile = inicioFile+Bloque+ext;
            fD = new File(rutaDesc);
            fF = new File(rutaFile);
        }
    }
    
    public void ActualizarDescriptorIndexDonacion()
    {
        File index = new File("C:\\MEIA\\DonacionIndex.txt");
        File desci = new File("C:\\MEIA\\DonacionIndexDesc.txt");
        if (index.exists()){
            try {
                if (desci.exists()){
                    desci.delete();
                }
                desci.createNewFile();
                FileWriter descifw = new FileWriter(desci);
                BufferedWriter descibw = new BufferedWriter(descifw);
                String usuarioCreador = "Usuario creador:";
                File usuarios = new File("C:\\MEIA\\usuario.txt");
                if (usuarios.exists()) {
                    FileReader usuariofr = new FileReader(usuarios);
                    BufferedReader usuariosbr = new BufferedReader(usuariofr);
                    String tempUser = usuariosbr.readLine();
                    if (tempUser!=null){
                        usuarioCreador += tempUser.split("\\|")[0];
                    }else{
                        File bitacora = new File("C:\\MEIA\\bitacora.txt");
                        if (bitacora.exists()){
                            FileReader bitacorafr = new FileReader(bitacora);
                            BufferedReader bitacorabr = new BufferedReader(bitacorafr);
                            tempUser = bitacorabr.readLine();
                            if (tempUser!=null){
                            usuarioCreador += tempUser.split("\\|")[0];
                            }
                            bitacorabr.close();
                        }
                    }
                    usuariofr.close();
                    usuariosbr.close();
                }
                FileReader indexfr = new FileReader(index);
                BufferedReader indexbr = new BufferedReader(indexfr);
                String temp = indexbr.readLine();
                int registros = 0;
                while (temp!=null){
                    registros++;
                    temp = indexbr.readLine();
                }
                indexfr.close();
                indexbr.close();
                Date fdate = new Date();
                descibw.write("Nombre del Archivo:DonacionIndex.txt");
                descibw.newLine();
                descibw.write(usuarioCreador);
                descibw.newLine();
                descibw.write("Fecha creacion:" + fdate.getDay() + "/" + fdate.getMonth() + "/2019");
                descibw.newLine();
                descibw.write("Total registros:" + registros);
                descibw.newLine();
                descibw.write("Registros activos:" + registros);
                descibw.newLine();
                descibw.write("Registros inactivos:" + 0);
                descibw.newLine();
                descibw.close();
            } catch (IOException ex) {
                Logger.getLogger(HacerDonación.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    public void EliminarDonacion()
    {
        String usuario = String.valueOf(cbDonador.getSelectedItem());
        String material = cbMaterial.getSelectedItem().toString();
        String fecha = tfDia.getText() + "/" + cbMes.getSelectedItem() + "/" + cbYear.getSelectedItem();
        String direccion =  BuscarDonacion(usuario, material, fecha);
        if (direccion != null) {
            String bloque = direccion.split("\\.")[0];
            int linea = Integer.parseInt(direccion.split("\\.")[1]);
            String ruta = "C:\\MEIA\\Donacion_" + bloque + ".txt";
            File f = new File(ruta);
            if (f.exists()){
                try {
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);
                    String lectura = br.readLine();
                    ArrayList<String> lista = new ArrayList<>();
                    int contador = 1;
                    while (lectura!=null){
                        if (contador != linea){
                            lista.add(lectura);
                        }
                        contador++;
                        lectura = br.readLine();
                    }
                    fr.close();
                    br.close();
                    f.delete();
                    f.createNewFile();
                    FileWriter fw = new FileWriter(f);
                    BufferedWriter bw = new BufferedWriter(fw);
                    for(String x:lista){
                        bw.write(x);
                        bw.newLine();
                    }
                    bw.close();
        } catch (IOException ex) {
            Logger.getLogger(VerDonacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        } else{
            //error donacion no encontrada para eliminar
        }
    }
    
    public void EliminarDonacionIndex()
    {
        String usuario = String.valueOf(cbDonador.getSelectedItem());
        String material = cbMaterial.getSelectedItem().toString();
        String fecha = tfDia.getText() + "/" + cbMes.getSelectedItem() + "/" + cbYear.getSelectedItem();
        String direccion =  BuscarDonacion(usuario, material, fecha);
        int linea = Integer.parseInt(direccion.split("\\.")[1]);
        String ruta = "C:\\MEIA\\DonacionIndex.txt";
        File f = new File(ruta);
        if (f.exists()){
            try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String lectura = br.readLine();
            ArrayList<String> lista = new ArrayList<>();
            while (lectura!=null){
                if (!lectura.contains(direccion)){
                    lista.add(lectura);
                }
                lectura = br.readLine();
            }
            fr.close();
            br.close();
            f.delete();
            f.createNewFile();
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String x:lista){
                bw.write(x);
                bw.newLine();
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(VerDonacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
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
            java.util.logging.Logger.getLogger(BuscarDonacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarDonacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarDonacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarDonacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarDonacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbDonador;
    private javax.swing.JComboBox<String> cbMaterial;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JFormattedTextField tfDia;
    // End of variables declaration//GEN-END:variables
}
