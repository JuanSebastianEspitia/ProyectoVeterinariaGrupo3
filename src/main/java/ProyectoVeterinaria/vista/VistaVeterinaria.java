/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoVeterinaria.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class VistaVeterinaria extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaVeterinaria.class.getName());

    private DefaultListModel<String> vacunasDisponibles=new DefaultListModel<>();
    private DefaultListModel<String> vacunasAplicadas=new DefaultListModel<>();
    
    
    public VistaVeterinaria() {
        initComponents();
        this.cbHoraCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
    "08:00","08:30","09:00","09:30","10:00","10:30","11:00","11:30","12:00",
    "12:30","13:00","13:30","14:00","14:30","15:00","15:30","16:00","16:30","17:00","17:30" }));
        this.txtaDiagnostico.setLineWrap(true);
        this.txtaDiagnostico.setWrapStyleWord(true);
        this.txtaVacunasMascota.setLineWrap(true);
        this.txtaVacunasMascota.setWrapStyleWord(true);
        this.lstVacunasDisponibles.setModel(vacunasDisponibles);
        this.lstVacunasAplicadas.setModel(vacunasAplicadas);
        
        //Inhabilitar campos automaticamente
        this.txtVacuna.setEnabled(true);
       this.txtCitesMascota.setEnabled(false);
       this.txtRazaMascota.setEnabled(true);
       
        
    }

    
    //HABILITAR CAMPOS
    
    public void habilitarConvencional(){
        this.txtaVacunasMascota.setEnabled(true);
        this.txtRazaMascota.setEnabled(true);
        this.txtCitesMascota.setEnabled(false);
        this.txtCitesMascota.setText("");
    }
    
    public void habilitarExotica(){
        this.txtCitesMascota.setEnabled(true);
        this.txtRazaMascota.setEnabled(false);
        this.txtRazaMascota.setText("");
        this.txtaVacunasMascota.setEnabled(false);
        this.txtaVacunasMascota.setText("");
    }
    
    
    //VARIABLES DEL PANEL EMPLEADOS

    public String getTxtCorreoRecepcionista() {
        return txtCorreoRecepcionista.getText();
    }

    public void setTxtCorreoRecepcionista(String txtCorreoRecepcionista) {
        this.txtCorreoRecepcionista.setText(txtCorreoRecepcionista);
    }

    public String getTxtCorreoVeterinario() {
        return txtCorreoVeterinario.getText();
    }

    public void setTxtCorreoVeterinario(String txtCorreoVeterinario) {
        this.txtCorreoVeterinario.setText(txtCorreoVeterinario);
    }

    public String getTxtDocumentoRecepcionista() {
        return txtDocumentoRecepcionista.getText();
    }

    public void setTxtDocumentoRecepcionista(String txtDocumentoRecepcionista) {
        this.txtDocumentoRecepcionista.setText(txtDocumentoRecepcionista);
    }

    public String getTxtDocumentoVeterinario() {
        return txtDocumentoVeterinario.getText();
    }

    public void setTxtDocumentoVeterinario(String txtDocumentoVeterinario) {
        this.txtDocumentoVeterinario.setText(txtDocumentoVeterinario);
    }

    public String getTxtEspecialidadVeterinario() {
        return txtEspecialidadVeterinario.getText();
    }

    public void setTxtEspecialidadVeterinario(String txtEspecialidadVeterinario) {
        this.txtEspecialidadVeterinario.setText(txtEspecialidadVeterinario);
    }

    public String getTxtNombreRecepcionista() {
        return txtNombreRecepcionista.getText();
    }

    public void setTxtNombreRecepcionista(String txtNombreRecepcionista) {
        this.txtNombreRecepcionista.setText(txtNombreRecepcionista);
    }

    public String getTxtNombreVeterinario() {
        return txtNombreVeterinario.getText();
    }

    public void setTxtNombreVeterinario(String txtNombreVeterinario) {
        this.txtNombreVeterinario.setText(txtNombreVeterinario);
    }

    public String getTxtSueldoRecepcionista() {
        return txtSueldoRecepcionista.getText();
    }

    public void setTxtSueldoRecepcionista(String txtSueldoRecepcionista) {
        this.txtSueldoRecepcionista.setText(txtSueldoRecepcionista);
    }

    public String getTxtSueldoVeterinario() {
        return txtSueldoVeterinario.getText();
    }

    public void setTxtSueldoVeterinario(String txtSueldoVeterinario) {
        this.txtSueldoVeterinario.setText(txtSueldoVeterinario);
    }

    public String getTxtTarjetaProfesionalVeterinario() {
        return txtTarjetaProfesionalVeterinario.getText();
    }

    public void setTxtTarjetaProfesionalVeterinario(String txtTarjetaProfesionalVeterinario) {
        this.txtTarjetaProfesionalVeterinario.setText(txtTarjetaProfesionalVeterinario);
    }

    public String getTxtTelefonoRecepcionista() {
        return txtTelefonoRecepcionista.getText();
    }

    public void setTxtTelefonoRecepcionista(String txtTelefonoRecepcionista) {
        this.txtTelefonoRecepcionista.setText(txtTelefonoRecepcionista);
    }

    public String getTxtTelefonoVeterinario() {
        return txtTelefonoVeterinario.getText();
    }

    public void setTxtTelefonoVeterinario(String txtTelefonoVeterinario) {
        this.txtTelefonoVeterinario.setText(txtTelefonoVeterinario);
    }
    
    public void addAgregarActionListenerRegistrarRecepcionista(ActionListener listener){
        this.btnRegistrarRecepcionista.addActionListener(listener);
    }
    
    public void addAgregarActionListenerRegistrarVeterinario(ActionListener listener){
        this.btnRegistrarVeterinario.addActionListener(listener);
    }
    
    
    //VARIABLES DEL PANEL DUEÑOS Y MASCOTAS

    public String getTxtCitesMascota() {
        return txtCitesMascota.getText();
    }

    public void setTxtCitesMascota(String txtCitesMascota) {
        this.txtCitesMascota.setText(txtCitesMascota);
    }

    public String getTxtCorreoDueño() {
        return txtCorreoDueño.getText();
    }

    public void setTxtCorreoDueño(String txtCorreoDueño) {
        this.txtCorreoDueño.setText(txtCorreoDueño);
    }

    public String getTxtDocumentoDueño() {
        return txtDocumentoDueño.getText();
    }

    public void setTxtDocumentoDueño(String txtDocumentoDueño) {
        this.txtDocumentoDueño.setText(txtDocumentoDueño);
    }

    public String getTxtEdadMascota() {
        return txtEdadMascota.getText();
    }

    public void setTxtEdadMascota(String txtEdadMascota) {
        this.txtEdadMascota.setText(txtEdadMascota);
    }

    public String getTxtNombreDueño() {
        return txtNombreDueño.getText();
    }

    public void setTxtNombreDueño(String txtNombreDueño) {
        this.txtNombreDueño.setText(txtNombreDueño);
    }

    public String getTxtNombreMascota() {
        return txtNombreMascota.getText();
    }

    public void setTxtNombreMascota(String txtNombreMascota) {
        this.txtNombreMascota.setText(txtNombreMascota);
    }

    public String getTxtPesoMascota() {
        return txtPesoMascota.getText();
    }

    public void setTxtPesoMascota(String txtPesoMascota) {
        this.txtPesoMascota.setText(txtPesoMascota);
    }

    public String getTxtRazaMascota() {
        return txtRazaMascota.getText();
    }

    public void setTxtRazaMascota(String txtRazaMascota) {
        this.txtRazaMascota.setText(txtRazaMascota);
    }

    public String getTxtTelefonoDueño() {
        return txtTelefonoDueño.getText();
    }

    public void setTxtTelefonoDueño(String txtTelefonoDueño) {
        this.txtTelefonoDueño.setText(txtTelefonoDueño);
    }

    public String getTxtaVacunasMascota() {
        return txtaVacunasMascota.getText();
    }

    public void setTxtaVacunasMascota(String txtaVacunasMascota) {
        this.txtaVacunasMascota.setText(txtaVacunasMascota);
    }

    public JComboBox<String> getCbCitasAtendidas() {
        return cbCitasAtendidas;
    }

    public JComboBox<String> getCbDueñoHorario() {
        return cbDueñoHorario;
    }
    public JComboBox<String> getCbMascotaHorario() {
        return cbMascotaHorario;
    }

    public JComboBox<String> getCbDueñoMascota() {
        return cbDueñoMascota;
    }

    public JComboBox<String> getCbGeneroMascota() {
        return cbGeneroMascota;
    }

    public JComboBox<String> getCbHoraCita() {
        return cbHoraCita;
    }

    public JComboBox<String> getCbRecepcionista() {
        return cbRecepcionista;
    }

    public JComboBox<String> getCbTipoMascota() {
        return cbTipoMascota;
    }

    public JSpinner getSpnFechaCita() {
        return spnFechaCita;
    }
    
    
    
    
    public void addActionListenerDueñoHorario(ActionListener listener){
        this.cbDueñoHorario.addActionListener(listener);
    }
    
    public void addActionListenerAgendarCita(ActionListener listener){
        this.btnRegistrarCita.addActionListener(listener);
    }
    
    
    public void addAgregarActionListenerRegistrarDueño(ActionListener listener){
        this.btnRegistrarDueño.addActionListener(listener);
    }
    
    public void addActionListenerTipoMascota(ActionListener listener){
        this.cbTipoMascota.addActionListener(listener);
    }
    public void addAgregarActionListenerRegistrarMascota(ActionListener listener){
        this.btnRegistrarMascota.addActionListener(listener);
    }
    
    
    
    
    // VARIABLES DEL PANEL VACUNAS 

    public JTextField getTxtPrecioVacuna() {
        return txtPrecioVacuna;
    }

    public JTextField getTxtVacuna() {
        return txtVacuna;
    }

    public void setTxtPrecioVacuna(JTextField txtPrecioVacuna) {
        this.txtPrecioVacuna = txtPrecioVacuna;
    }

    public void setTxtVacuna(JTextField txtVacuna) {
        this.txtVacuna = txtVacuna;
    }
    
    public void addAgregarActionListenerRegistrarvacuna(ActionListener listener){
        this.btnAgregarVacuna.addActionListener(listener);
    }
    
    
    
    
    
    
    
    
    //VARIABLES DEL PANEL DE CONSULTAS

    public JComboBox<String> getCbVeterinario() {
        return cbVeterinario;
    }

    public JComboBox<String> getCbDueñoHistorialClinico() {
        return cbDueñoHistorialClinico;
    }
    public JComboBox<String> getCbMascotaHistorialClinico() {
        return cbMascotaHistorialClinico;
    }

    public JComboBox<String> getCbCita() {
        return cbCita;
    }

    public JList<String> getLstVacunasAplicadas() {
        return lstVacunasAplicadas;
    }
    
    public JList<String> getLstVacunasDisponibles() {
        return lstVacunasDisponibles;
    }

    public void setLstVacunasDisponibles(JList<String> lstVacunasDisponibles) {
        this.lstVacunasDisponibles = lstVacunasDisponibles;
    }
    
    public void addActionListenerDueñoHistorialClinico(ActionListener listener){
        this.cbDueñoHistorialClinico.addActionListener(listener);
    }
    
    public String getTxtTratamientoAplicado() {
        return txtTratamientoAplicado.getText();
}

    public void setTxtTratamientoAplicado(String texto) {
        this.txtTratamientoAplicado.setText(texto);
    }

    public String getTxtaDiagnostico() {
        return txtaDiagnostico.getText();
    }

    public void setTxtaDiagnostico(String texto) {
        this.txtaDiagnostico.setText(texto);
    }

    public boolean isSedacionSeleccionada() {
        return chbSedacion.isSelected();
    }

    public void setSedacionSeleccionada(boolean seleccionada) {
        this.chbSedacion.setSelected(seleccionada);
    }

    public void limpiarVacunasAplicadas() {
        this.lstVacunasAplicadas.clearSelection();
    }

    public void mostrarVacunasAplicadas(boolean visible){
        this.jScrollPane3.setVisible(visible);
        this.jLabel45.setVisible(visible);
        if(!visible)
            this.lstVacunasAplicadas.clearSelection();
    }   

    public void addActionListenerCita(ActionListener listener){
        this.cbCita.addActionListener(listener);
    }
    
    public void addActionListenerGenerarConsulta(ActionListener listener){
        this.btnGenerarConsulta.addActionListener(listener);
    }

    public void addActionListenerVerHistorialClinico(ActionListener listener){
        this.btnVerHistorialClinico.addActionListener(listener);
    }

    public void addActionListenerGenerarFactura(ActionListener listener){
        this.btGenerarFactura.addActionListener(listener);
    }
    public void mostrarTexto(String titulo, String texto){
    JTextArea area = new JTextArea(texto, 20, 50);
    area.setEditable(false);
    area.setLineWrap(true);
    area.setWrapStyleWord(true);
    JOptionPane.showMessageDialog(this, new javax.swing.JScrollPane(area), titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtCorreoVeterinario = new javax.swing.JTextField();
        txtTelefonoVeterinario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSueldoVeterinario = new javax.swing.JTextField();
        txtNombreVeterinario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTarjetaProfesionalVeterinario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrarRecepcionista = new javax.swing.JButton();
        txtCorreoRecepcionista = new javax.swing.JTextField();
        btnRegistrarVeterinario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEspecialidadVeterinario = new javax.swing.JTextField();
        txtNombreRecepcionista = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSueldoRecepcionista = new javax.swing.JTextField();
        txtDocumentoRecepcionista = new javax.swing.JTextField();
        txtTelefonoRecepcionista = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDocumentoVeterinario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbGeneroMascota = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtRazaMascota = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCitesMascota = new javax.swing.JTextField();
        txtDocumentoDueño = new javax.swing.JTextField();
        btnRegistrarMascota = new javax.swing.JButton();
        txtCorreoDueño = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtTelefonoDueño = new javax.swing.JTextField();
        cbDueñoMascota = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtNombreDueño = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btnRegistrarCita = new javax.swing.JButton();
        btnRegistrarDueño = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        cbTipoMascota = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cbDueñoHorario = new javax.swing.JComboBox<>();
        txtNombreMascota = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cbMascotaHorario = new javax.swing.JComboBox<>();
        txtEdadMascota = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtPesoMascota = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cbRecepcionista = new javax.swing.JComboBox<>();
        spnFechaCita = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        cbHoraCita = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cbCitasAtendidas = new javax.swing.JComboBox<>();
        btGenerarFactura = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtaVacunasMascota = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        cbVeterinario = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        cbCita = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        txtTratamientoAplicado = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDiagnostico = new javax.swing.JTextArea();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstVacunasAplicadas = new javax.swing.JList<>();
        chbSedacion = new javax.swing.JCheckBox();
        btnVerHistorialClinico = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btnGenerarConsulta = new javax.swing.JButton();
        cbDueñoHistorialClinico = new javax.swing.JComboBox<>();
        cbMascotaHistorialClinico = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtVacuna = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtPrecioVacuna = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        btnAgregarVacuna = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstVacunasDisponibles = new javax.swing.JList<>();
        jLabel48 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 51, 0));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 248));

        txtCorreoVeterinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        txtTelefonoVeterinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel11.setText("Sueldo:  $");

        jLabel12.setText("Nombre");

        txtSueldoVeterinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        txtNombreVeterinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        txtNombreVeterinario.addActionListener(this::txtNombreVeterinarioActionPerformed);

        jLabel3.setText("Documento");

        jLabel13.setText("Tarjeta Profesional");

        jLabel4.setText("Correo");

        txtTarjetaProfesionalVeterinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel5.setText("Telefono");

        btnRegistrarRecepcionista.setBackground(new java.awt.Color(255, 51, 0));
        btnRegistrarRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarRecepcionista.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarRecepcionista.setText("REGISTRAR RECEPCIONISTA");
        btnRegistrarRecepcionista.addActionListener(this::btnRegistrarRecepcionistaActionPerformed);

        txtCorreoRecepcionista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        btnRegistrarVeterinario.setBackground(new java.awt.Color(255, 51, 0));
        btnRegistrarVeterinario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarVeterinario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVeterinario.setText("REGISTRAR VETERINARIO");
        btnRegistrarVeterinario.addActionListener(this::btnRegistrarVeterinarioActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("RECEPCIONISTA");

        jLabel1.setText("Nombre");

        jLabel14.setText("Especialidad");

        txtEspecialidadVeterinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        txtNombreRecepcionista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel6.setText("Sueldo:  $");

        txtSueldoRecepcionista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        txtDocumentoRecepcionista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        txtTelefonoRecepcionista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("VETERINARIO");

        jLabel8.setText("Documento");

        jLabel9.setText("Correo");

        jLabel10.setText("Telefono");

        txtDocumentoVeterinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreVeterinario)
                    .addComponent(txtCorreoVeterinario)
                    .addComponent(txtSueldoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(55, 55, 55)
                        .addComponent(txtDocumentoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtTarjetaProfesionalVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarRecepcionista)
                .addGap(266, 266, 266))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarVeterinario)
                .addGap(270, 270, 270))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtEspecialidadVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)
                                .addComponent(txtSueldoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(8, 8, 8)))
                                    .addGap(60, 60, 60)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombreRecepcionista)
                                        .addComponent(txtCorreoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(63, 63, 63)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)))
                                .addComponent(jLabel11)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefonoRecepcionista)
                                    .addComponent(txtDocumentoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefonoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDocumentoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefonoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSueldoRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNombreVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSueldoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtTarjetaProfesionalVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDocumentoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecialidadVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(32, 32, 32)
                .addComponent(btnRegistrarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EMPLEADOS", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 248));

        cbGeneroMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Hembra" }));
        cbGeneroMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel15.setText("Raza");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("DUEÑO(S)");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtRazaMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel17.setText("Documento");

        jLabel18.setText("Vacunas");

        jLabel19.setText("Correo");

        jLabel20.setText("ICA (CITES)");

        jLabel21.setText("Telefono");

        txtCitesMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        txtDocumentoDueño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        btnRegistrarMascota.setBackground(new java.awt.Color(255, 51, 0));
        btnRegistrarMascota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarMascota.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarMascota.setText("REGISTRAR MASCOTA");
        btnRegistrarMascota.addActionListener(this::btnRegistrarMascotaActionPerformed);

        txtCorreoDueño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        txtCorreoDueño.addActionListener(this::txtCorreoDueñoActionPerformed);

        jLabel22.setText("Dueño");

        txtTelefonoDueño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        cbDueñoMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel23.setText("Nombre");

        jLabel24.setText("Fecha de la Cita");

        txtNombreDueño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("MASCOTA(S)");

        btnRegistrarCita.setBackground(new java.awt.Color(255, 51, 0));
        btnRegistrarCita.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCita.setText("AGENDAR CITA");
        btnRegistrarCita.addActionListener(this::btnRegistrarCitaActionPerformed);

        btnRegistrarDueño.setBackground(new java.awt.Color(255, 51, 0));
        btnRegistrarDueño.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarDueño.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarDueño.setText("REGISTRAR DUEÑO");

        jLabel26.setText("Tipo de Mascota");

        cbTipoMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONVENCIONAL", "EXÓTICA" }));
        cbTipoMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        cbTipoMascota.addActionListener(this::cbTipoMascotaActionPerformed);

        jLabel27.setText("Dueño");

        jLabel28.setText("Nombre");

        cbDueñoHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        txtNombreMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel29.setText("Mascota");

        jLabel30.setText("Edad");

        cbMascotaHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        txtEdadMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel31.setText("Peso");

        txtPesoMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel32.setText("Género");

        jLabel33.setText("Recepcionista");

        cbRecepcionista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        spnFechaCita.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1795298797085L), null, java.util.Calendar.DAY_OF_MONTH));
        spnFechaCita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        spnFechaCita.setEditor(new javax.swing.JSpinner.DateEditor(spnFechaCita, "yyyy/MM/dd"));

        jLabel34.setText("Hora de la Cita");

        cbHoraCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30" }));
        cbHoraCita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("GENERAR FACTURAS");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setText("HORARIOS DE CITAS");

        jLabel37.setText("Citas Atendidas");

        cbCitasAtendidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        btGenerarFactura.setBackground(new java.awt.Color(255, 153, 0));
        btGenerarFactura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btGenerarFactura.setForeground(new java.awt.Color(255, 255, 255));
        btGenerarFactura.setText("GENERAR FACTURA");

        txtaVacunasMascota.setColumns(20);
        txtaVacunasMascota.setRows(5);
        txtaVacunasMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        jScrollPane4.setViewportView(txtaVacunasMascota);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)))
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCorreoDueño)
                                .addComponent(txtDocumentoDueño)
                                .addComponent(txtTelefonoDueño, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel35))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbCitasAtendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMascotaHorario, 0, 236, Short.MAX_VALUE)
                                    .addComponent(cbDueñoHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel24)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel29)))
                                .addGap(18, 18, 18)
                                .addComponent(spnFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRegistrarCita)
                                .addGap(97, 97, 97))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20)
                                .addComponent(jLabel32))
                            .addGap(46, 46, 46)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbGeneroMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCitesMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel28))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addGap(19, 19, 19)))
                                .addGap(61, 61, 61)
                                .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel26))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbDueñoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel15))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRazaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btGenerarFactura)
                        .addGap(78, 78, 78))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(btnRegistrarMascota)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(cbRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(txtDocumentoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(cbTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDueñoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(spnFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(cbHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(cbDueñoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(cbMascotaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarCita)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(cbCitasAtendidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btGenerarFactura)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(txtEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPesoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbGeneroMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(txtCitesMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addComponent(btnRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRazaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DUEÑOS Y MASCOTAS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 248));

        jLabel38.setText("Veterinario");

        cbVeterinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel39.setText("Cita");

        cbCita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel43.setText("Tratamiento Aplicado");

        txtTratamientoAplicado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel44.setText("Diagnóstico");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        txtaDiagnostico.setColumns(20);
        txtaDiagnostico.setRows(5);
        jScrollPane1.setViewportView(txtaDiagnostico);

        jLabel45.setText("Vacunas Aplicadas");

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jScrollPane3.setViewportView(lstVacunasAplicadas);

        chbSedacion.setText("Sedación");
        chbSedacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        chbSedacion.addActionListener(this::chbSedacionActionPerformed);

        btnVerHistorialClinico.setBackground(new java.awt.Color(255, 51, 0));
        btnVerHistorialClinico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerHistorialClinico.setForeground(new java.awt.Color(255, 255, 255));
        btnVerHistorialClinico.setText("VER HISTORIAL CLÍNICO");
        btnVerHistorialClinico.addActionListener(this::btnVerHistorialClinicoActionPerformed);

        jLabel46.setText("Dueño");

        jLabel47.setText("Mascota");

        btnGenerarConsulta.setBackground(new java.awt.Color(255, 51, 0));
        btnGenerarConsulta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarConsulta.setText("GENERAR CONSULTA");

        cbDueñoHistorialClinico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        cbMascotaHistorialClinico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbVeterinario, 0, 408, Short.MAX_VALUE)
                                    .addComponent(cbCita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTratamientoAplicado, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel44)
                        .addGap(61, 61, 61)
                        .addComponent(chbSedacion)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel45)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnVerHistorialClinico)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMascotaHistorialClinico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(18, 18, 18)
                                .addComponent(cbDueñoHistorialClinico, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerarConsulta)
                .addGap(306, 306, 306))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(cbVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(cbCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtTratamientoAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chbSedacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(cbDueñoHistorialClinico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(cbMascotaHistorialClinico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnVerHistorialClinico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(btnGenerarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONSULTA", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 248));

        jLabel40.setText("Vacuna");

        txtVacuna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        txtVacuna.addActionListener(this::txtVacunaActionPerformed);

        jLabel41.setText("Precio");

        txtPrecioVacuna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel42.setText("$");

        btnAgregarVacuna.setBackground(new java.awt.Color(255, 51, 0));
        btnAgregarVacuna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarVacuna.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVacuna.setText("AGREGAR VACUNA");
        btnAgregarVacuna.addActionListener(this::btnAgregarVacunaActionPerformed);

        lstVacunasDisponibles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        jScrollPane2.setViewportView(lstVacunasDisponibles);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setText("VACUNAS DISPONIBLES");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecioVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarVacuna))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(txtVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(txtPrecioVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42))
                        .addGap(31, 31, 31)
                        .addComponent(btnAgregarVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VACUNAS", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoMascotaActionPerformed

    private void txtCorreoDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoDueñoActionPerformed

    private void btnRegistrarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarVeterinarioActionPerformed

    private void btnRegistrarRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRecepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarRecepcionistaActionPerformed

    private void btnRegistrarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarCitaActionPerformed

    private void chbSedacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSedacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbSedacionActionPerformed

    private void btnVerHistorialClinicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistorialClinicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerHistorialClinicoActionPerformed

    private void btnRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarMascotaActionPerformed

    private void txtNombreVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreVeterinarioActionPerformed

    private void btnAgregarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVacunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarVacunaActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaVeterinaria().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGenerarFactura;
    private javax.swing.JButton btnAgregarVacuna;
    private javax.swing.JButton btnGenerarConsulta;
    private javax.swing.JButton btnRegistrarCita;
    private javax.swing.JButton btnRegistrarDueño;
    private javax.swing.JButton btnRegistrarMascota;
    private javax.swing.JButton btnRegistrarRecepcionista;
    private javax.swing.JButton btnRegistrarVeterinario;
    private javax.swing.JButton btnVerHistorialClinico;
    private javax.swing.JComboBox<String> cbCita;
    private javax.swing.JComboBox<String> cbCitasAtendidas;
    private javax.swing.JComboBox<String> cbDueñoHistorialClinico;
    private javax.swing.JComboBox<String> cbDueñoHorario;
    private javax.swing.JComboBox<String> cbDueñoMascota;
    private javax.swing.JComboBox<String> cbGeneroMascota;
    private javax.swing.JComboBox<String> cbHoraCita;
    private javax.swing.JComboBox<String> cbMascotaHistorialClinico;
    private javax.swing.JComboBox<String> cbMascotaHorario;
    private javax.swing.JComboBox<String> cbRecepcionista;
    private javax.swing.JComboBox<String> cbTipoMascota;
    private javax.swing.JComboBox<String> cbVeterinario;
    private javax.swing.JCheckBox chbSedacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> lstVacunasAplicadas;
    private javax.swing.JList<String> lstVacunasDisponibles;
    private javax.swing.JSpinner spnFechaCita;
    private javax.swing.JTextField txtCitesMascota;
    private javax.swing.JTextField txtCorreoDueño;
    private javax.swing.JTextField txtCorreoRecepcionista;
    private javax.swing.JTextField txtCorreoVeterinario;
    private javax.swing.JTextField txtDocumentoDueño;
    private javax.swing.JTextField txtDocumentoRecepcionista;
    private javax.swing.JTextField txtDocumentoVeterinario;
    private javax.swing.JTextField txtEdadMascota;
    private javax.swing.JTextField txtEspecialidadVeterinario;
    private javax.swing.JTextField txtNombreDueño;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtNombreRecepcionista;
    private javax.swing.JTextField txtNombreVeterinario;
    private javax.swing.JTextField txtPesoMascota;
    private javax.swing.JTextField txtPrecioVacuna;
    private javax.swing.JTextField txtRazaMascota;
    private javax.swing.JTextField txtSueldoRecepcionista;
    private javax.swing.JTextField txtSueldoVeterinario;
    private javax.swing.JTextField txtTarjetaProfesionalVeterinario;
    private javax.swing.JTextField txtTelefonoDueño;
    private javax.swing.JTextField txtTelefonoRecepcionista;
    private javax.swing.JTextField txtTelefonoVeterinario;
    private javax.swing.JTextField txtTratamientoAplicado;
    private javax.swing.JTextField txtVacuna;
    private javax.swing.JTextArea txtaDiagnostico;
    private javax.swing.JTextArea txtaVacunasMascota;
    // End of variables declaration//GEN-END:variables

    private void txtVacunaActionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
