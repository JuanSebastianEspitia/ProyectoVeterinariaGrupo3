/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.controlador;

import ProyectoVeterinaria.modelo.Cita;
import ProyectoVeterinaria.modelo.Dueño;
import ProyectoVeterinaria.modelo.Mascota;
import ProyectoVeterinaria.modelo.MascotaConvencional;
import ProyectoVeterinaria.modelo.MascotaExotica;
import ProyectoVeterinaria.modelo.Recepcionista;
import ProyectoVeterinaria.modelo.Registro;
import ProyectoVeterinaria.modelo.Veterinario;
import ProyectoVeterinaria.vista.VistaVeterinaria;
import javax.swing.JOptionPane;
import ProyectoVeterinaria.modelo.Vacuna;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.Date;
import javax.swing.DefaultListModel;
        
        
        
/**
 *
 * @author JUAN SEBASTIAN
 */
public class Controlador {
    private VistaVeterinaria vistaVeterinaria;
    
    private Registro registro;

    public Controlador(VistaVeterinaria vistaVeterinaria, Registro registro) {
        this.vistaVeterinaria=vistaVeterinaria;
        
        this.registro=registro;
    }
    
    public void iniciar(){
        
        this.vistaVeterinaria.addAgregarActionListenerRegistrarRecepcionista(e->{
            try{
            if(this.vistaVeterinaria.getTxtCorreoRecepcionista().isEmpty()||
               this.vistaVeterinaria.getTxtNombreRecepcionista().isEmpty()||
               this.vistaVeterinaria.getTxtTelefonoRecepcionista().isEmpty()||
               this.vistaVeterinaria.getTxtDocumentoRecepcionista().isEmpty()||
               this.vistaVeterinaria.getTxtSueldoRecepcionista().isEmpty())
                throw new IllegalArgumentException("ERROR: debe de llenar todos los campos");
                
            String correoRecepcionista=this.vistaVeterinaria.getTxtCorreoRecepcionista();
            String nombreRecepcionista=this.vistaVeterinaria.getTxtNombreRecepcionista();
            String telefonoRecepcionista=this.vistaVeterinaria.getTxtTelefonoRecepcionista();
            String documentoRecepcionista=this.vistaVeterinaria.getTxtDocumentoRecepcionista();
            float sueldoRecepcionista=Float.parseFloat(this.vistaVeterinaria.getTxtSueldoRecepcionista()) ;
            
            
            Recepcionista recepcionista=new Recepcionista(sueldoRecepcionista,nombreRecepcionista,documentoRecepcionista,correoRecepcionista, telefonoRecepcionista);
            this.registro.añadirRecepcionista(recepcionista);
            this.vistaVeterinaria.getCbRecepcionista().removeAllItems();
            for(Recepcionista re: registro.getRecepcionistas()){
                this.vistaVeterinaria.getCbRecepcionista().addItem(re.getNombre()+"-"+re.getCorreo()+"-"+re.getTelefono()+"-"+re.getDocumento());
            }
            this.vistaVeterinaria.setTxtCorreoRecepcionista("");
            this.vistaVeterinaria.setTxtDocumentoRecepcionista("");
            this.vistaVeterinaria.setTxtNombreRecepcionista("");
            this.vistaVeterinaria.setTxtSueldoRecepcionista("");
            this.vistaVeterinaria.setTxtTelefonoRecepcionista("");
            JOptionPane.showMessageDialog(null, "RECEPCIONISTA "+recepcionista.getNombre().toUpperCase()+" FUE AGREGADO CORRECTAMENTE");
        } catch(NumberFormatException errorNumero){
            JOptionPane.showMessageDialog(null, "ERROR: el sueldo debe ser un número válido");
        }
          catch(IllegalArgumentException ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
        });
        
        
        this.vistaVeterinaria.addAgregarActionListenerRegistrarVeterinario(e->{
            try{
            if(this.vistaVeterinaria.getTxtCorreoVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtNombreVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtTelefonoVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtDocumentoVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtSueldoVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtTarjetaProfesionalVeterinario().isEmpty()||
               this.vistaVeterinaria.getTxtEspecialidadVeterinario().isEmpty())
                throw new IllegalArgumentException("ERROR: debe de completar todos los campos");
            else{    
            String correoVeterinario=this.vistaVeterinaria.getTxtCorreoVeterinario();
            String nombreVeterinario=this.vistaVeterinaria.getTxtNombreVeterinario();
            String telefonoVeterinario=this.vistaVeterinaria.getTxtTelefonoVeterinario();
            String documentoVeterinario=this.vistaVeterinaria.getTxtDocumentoVeterinario();
            float sueldoVeterinario=Float.parseFloat(this.vistaVeterinaria.getTxtSueldoVeterinario()) ;
            String tarjetaProfesional=this.vistaVeterinaria.getTxtTarjetaProfesionalVeterinario();
            String especialidadVeterinario=this.vistaVeterinaria.getTxtEspecialidadVeterinario();
            
            
            
            Veterinario veterinario=new Veterinario(especialidadVeterinario,tarjetaProfesional,nombreVeterinario,documentoVeterinario,correoVeterinario,telefonoVeterinario,sueldoVeterinario);
            this.registro.añadirVeterinario(veterinario);
            this.vistaVeterinaria.getCbVeterinario().removeAllItems();
            for(Veterinario ve: registro.getVeterinarios()){
                this.vistaVeterinaria.getCbVeterinario().addItem(ve.getNombre()+"-"+ve.getCorreo()+"-"+ve.getTelefono()+"-"+ve.getDocumento()+"-"+ve.getTarjetaProfesional()+"-"+ve.getEspecialidad());
            }
            this.vistaVeterinaria.setTxtCorreoVeterinario("");
            this.vistaVeterinaria.setTxtDocumentoVeterinario("");
            this.vistaVeterinaria.setTxtNombreVeterinario("");
            this.vistaVeterinaria.setTxtSueldoVeterinario("");
            this.vistaVeterinaria.setTxtTelefonoVeterinario("");
            this.vistaVeterinaria.setTxtTarjetaProfesionalVeterinario("");
            this.vistaVeterinaria.setTxtEspecialidadVeterinario("");
            JOptionPane.showMessageDialog(null, "VETERINARIO "+veterinario.getNombre().toUpperCase()+" DE TARJETA "+veterinario.getTarjetaProfesional().toUpperCase()+"\n Y ESPECIALIDAD "
                    +veterinario.getEspecialidad().toUpperCase() +" FUE AGREGADO CORRECTAMENTE");
            
            }
        } catch(NumberFormatException errorNumero){
            JOptionPane.showMessageDialog(null, "ERROR: el sueldo debe ser un número válido");
        }
          catch(IllegalArgumentException ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
            
            
        });
        
        
        
        this.vistaVeterinaria.addAgregarActionListenerRegistrarDueño(e->{
            try{
            if(this.vistaVeterinaria.getTxtCorreoDueño().isEmpty()||
               this.vistaVeterinaria.getTxtNombreDueño().isEmpty()||
               this.vistaVeterinaria.getTxtTelefonoDueño().isEmpty()||
               this.vistaVeterinaria.getTxtDocumentoDueño().isEmpty())
                throw new IllegalArgumentException("ERROR: debe de completar todos los campos");
                
            String correoDueño=this.vistaVeterinaria.getTxtCorreoDueño();
            String nombreDueño=this.vistaVeterinaria.getTxtNombreDueño();
            String telefonoDueño=this.vistaVeterinaria.getTxtTelefonoDueño();
            String documentoDueño=this.vistaVeterinaria.getTxtDocumentoDueño();
            
            
            Dueño dueño=new Dueño(nombreDueño,documentoDueño,correoDueño, telefonoDueño);
            this.registro.añadirDueño(dueño);
            this.vistaVeterinaria.getCbDueñoMascota().removeAllItems();
            this.vistaVeterinaria.getCbDueñoHorario().removeAllItems();
            this.vistaVeterinaria.getCbDueñoHistorialClinico().removeAllItems();
            for(Dueño d: registro.getDueños()){
                this.vistaVeterinaria.getCbDueñoMascota().addItem(d.getNombre()+"-"+d.getCorreo()+"-"+d.getTelefono()+"-"+d.getDocumento());
                this.vistaVeterinaria.getCbDueñoHorario().addItem(d.getNombre()+"-"+d.getCorreo()+"-"+d.getTelefono()+"-"+d.getDocumento());
                this.vistaVeterinaria.getCbDueñoHistorialClinico().addItem(d.getNombre()+"-"+d.getCorreo()+"-"+d.getTelefono()+"-"+d.getDocumento());
            }
            this.vistaVeterinaria.setTxtCorreoDueño("");
            this.vistaVeterinaria.setTxtDocumentoDueño("");
            this.vistaVeterinaria.setTxtNombreDueño("");
            this.vistaVeterinaria.setTxtTelefonoDueño("");
            JOptionPane.showMessageDialog(null, "DUEÑO "+dueño.getNombre().toUpperCase()+" FUE AGREGADO CORRECTAMENTE");
        
        }
          catch(IllegalArgumentException ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
        });
        
        this.vistaVeterinaria.addAgregarActionListenerRegistrarvacuna(e -> {
            try {
                if (this.vistaVeterinaria.getTxtVacuna().getText().isEmpty() ||
                    this.vistaVeterinaria.getTxtPrecioVacuna().getText().isEmpty()) {
                    throw new IllegalArgumentException("ERROR: debe de completar todos los campos");
                }

                String nombreVacuna = this.vistaVeterinaria.getTxtVacuna().getText();
                double precioVacuna = Double.parseDouble(this.vistaVeterinaria.getTxtPrecioVacuna().getText());

                Vacuna vacuna = new Vacuna(precioVacuna, nombreVacuna);
                this.registro.añadirVacuna(vacuna);

                DefaultListModel<String> modeloLista = new DefaultListModel<>();
                DefaultListModel<String> modeloListaVacunasAplicadas = new DefaultListModel<>();
                for (Vacuna v : registro.getVacunas()) {
                    modeloLista.addElement(v.getNombreVacuna()+ " - $" + (int) v.getValorVacuna());
                    modeloListaVacunasAplicadas.addElement(v.getNombreVacuna()+ " - $" + (int) v.getValorVacuna());
                }
                this.vistaVeterinaria.getLstVacunasDisponibles().setModel(modeloLista);
                this.vistaVeterinaria.getLstVacunasAplicadas().setModel(modeloListaVacunasAplicadas);

                this.vistaVeterinaria.getTxtVacuna().setText("");
                this.vistaVeterinaria.getTxtPrecioVacuna().setText("");

                JOptionPane.showMessageDialog(null, "VACUNA " + vacuna.getNombreVacuna().toUpperCase() + " FUE AGREGADA CORRECTAMENTE");

            } catch (NumberFormatException errorNumero) {
                JOptionPane.showMessageDialog(null, "ERROR: el precio debe ser un número válido");
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        });
        
        this.vistaVeterinaria.addActionListenerTipoMascota(e -> {
            String tipo = this.vistaVeterinaria.getCbTipoMascota().getSelectedItem().toString();
                if (tipo.equalsIgnoreCase("convencional")) {
            this.vistaVeterinaria.habilitarConvencional();
            }else {
            this.vistaVeterinaria.habilitarExotica();
    }
});
        this.vistaVeterinaria.addActionListenerDueñoHorario(e->{
    this.vistaVeterinaria.getCbMascotaHorario().removeAllItems();
    int indiceDueñoHorario=this.vistaVeterinaria.getCbDueñoHorario().getSelectedIndex();
    if(indiceDueñoHorario>=0){
        for(Mascota m: this.registro.getDueños().get(indiceDueñoHorario).getMascotas()){
            this.vistaVeterinaria.getCbMascotaHorario().addItem(m.getNombre());
        }
    }
});

        this.vistaVeterinaria.addActionListenerDueñoHistorialClinico(e->{
    this.vistaVeterinaria.getCbMascotaHistorialClinico().removeAllItems();
    int indiceDueñoHistorial=this.vistaVeterinaria.getCbDueñoHistorialClinico().getSelectedIndex();
    if(indiceDueñoHistorial>=0){
        for(Mascota m: this.registro.getDueños().get(indiceDueñoHistorial).getMascotas()){
            this.vistaVeterinaria.getCbMascotaHistorialClinico().addItem(m.getNombre());
        }
    }
});
        this.vistaVeterinaria.addAgregarActionListenerRegistrarMascota(e -> {
    try {
        int indiceDueño = this.vistaVeterinaria.getCbDueñoMascota().getSelectedIndex();
        if (indiceDueño < 0)
            throw new IllegalArgumentException("ERROR: primero debe registrar y seleccionar un dueño");
        
        boolean esConvencional=this.vistaVeterinaria.getCbTipoMascota().getSelectedItem().toString().equalsIgnoreCase("CONVENCIONAL");
        
        if(this.vistaVeterinaria.getTxtNombreMascota().isEmpty()||
       this.vistaVeterinaria.getTxtEdadMascota().isEmpty()||
       this.vistaVeterinaria.getTxtPesoMascota().isEmpty()||
       (esConvencional && this.vistaVeterinaria.getTxtRazaMascota().isEmpty())||
       (!esConvencional && this.vistaVeterinaria.getTxtCitesMascota().isEmpty()))
        throw new IllegalArgumentException("ERROR: debe de completar todos los campos");

        String nombre=this.vistaVeterinaria.getTxtNombreMascota();
        String edad=this.vistaVeterinaria.getTxtEdadMascota();
        String peso=this.vistaVeterinaria.getTxtPesoMascota();
        String genero=this.vistaVeterinaria.getCbGeneroMascota().getSelectedItem().toString();

        
        Mascota mascota;
        String tipo = this.vistaVeterinaria.getCbTipoMascota().getSelectedItem().toString();

        if (tipo.equalsIgnoreCase("convencional")) {
            String raza = this.vistaVeterinaria.getTxtRazaMascota();
            
            mascota = new MascotaConvencional(raza, nombre, edad, peso, genero);
        } else {
            String cites = this.vistaVeterinaria.getTxtCitesMascota();
            mascota = new MascotaExotica(cites, nombre, edad, peso, genero);
        }
        
        Dueño dueño = this.registro.getDueños().get(indiceDueño);
        dueño.agregarMascota(mascota);
            this.vistaVeterinaria.getCbMascotaHorario().removeAllItems();
            int indiceDueñoHorario=this.vistaVeterinaria.getCbDueñoHorario().getSelectedIndex();
        if(indiceDueñoHorario>=0){
            for(Mascota m: this.registro.getDueños().get(indiceDueñoHorario).getMascotas()){
            this.vistaVeterinaria.getCbMascotaHorario().addItem(m.getNombre());
    }
}

            this.vistaVeterinaria.getCbMascotaHistorialClinico().removeAllItems();
            int indiceDueñoHistorial=this.vistaVeterinaria.getCbDueñoHistorialClinico().getSelectedIndex();
        if(indiceDueñoHistorial>=0){
            for(Mascota m: this.registro.getDueños().get(indiceDueñoHistorial).getMascotas()){
            this.vistaVeterinaria.getCbMascotaHistorialClinico().addItem(m.getNombre());
    }
}
        this.vistaVeterinaria.setTxtNombreMascota("");
        this.vistaVeterinaria.setTxtEdadMascota("");
        this.vistaVeterinaria.setTxtPesoMascota("");
        this.vistaVeterinaria.setTxtRazaMascota("");
        this.vistaVeterinaria.setTxtCitesMascota("");
        this.vistaVeterinaria.setTxtaVacunasMascota("");

        JOptionPane.showMessageDialog(null, "MASCOTA " + nombre.toUpperCase()+ " FUE AGREGADA AL DUEÑO " + dueño.getNombre().toUpperCase());

    } catch (NumberFormatException errorNumero) {
        JOptionPane.showMessageDialog(null, "ERROR: la edad y el peso deben ser números válidos");
    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
        });
        
    
        this.vistaVeterinaria.addActionListenerAgendarCita(e->{
            try{
                if (registro.getVeterinarios().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"ERROR: No hay veterinarios registrados. "+ "No es posible agendar una cita.");
                }else{
                   Date fechaSpinner=(Date) this.vistaVeterinaria.getSpnFechaCita().getValue();
                   LocalDate fecha=fechaSpinner.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                   
                   String hora=this.vistaVeterinaria.getCbHoraCita().getSelectedItem().toString();
                   
                   Dueño dueño=null;
                   Mascota mascota=null;
                   
                   for(Dueño d: registro.getDueños()){
                       if(this.vistaVeterinaria.getCbDueñoHorario().getSelectedItem().toString().toLowerCase().contains(d.getDocumento().toLowerCase()))
                       for(Mascota m: d.getMascotas()){
                       if(this.vistaVeterinaria.getCbMascotaHorario().getSelectedItem().toString().toLowerCase().contains(m.getNombre().toLowerCase()))
                           dueño=d;
                           mascota=m;
                           break;
                           }
                   }
                   Cita cita=new Cita(fecha,hora,mascota,dueño);
                   
                   registro.añadirCita(cita);
                   registro.getCitas().sort(Comparator.comparing(Cita::getFecha).thenComparing(Cita::getHora));
                   this.vistaVeterinaria.getCbCita().removeAllItems();
                   for(Cita c: registro.getCitas()){
                       this.vistaVeterinaria.getCbCita().addItem(c.getFecha()+" "+c.getHora()+"- DUEÑO: "+c.getDueño().getNombre()+"- MASCOTA: "+c.getMascota().getNombre());
                   }
                   JOptionPane.showMessageDialog(null, "SE AGENDO UNA CITA PARA LA MASCOTA " +cita.getMascota().getNombre() + 
                           "\n DE DUEÑO: "+cita.getDueño().getNombre()+"\n PARA LA FECHA "+cita.getFecha()+" Y HORA"+cita.getHora());
                }
            }catch(NumberFormatException err){
                
            }catch(IllegalArgumentException error){
                
            }
        });
        
        
        
    }
}
