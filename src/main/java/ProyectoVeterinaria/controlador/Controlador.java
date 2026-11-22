/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.controlador;

import ProyectoVeterinaria.modelo.Dueño;
import ProyectoVeterinaria.modelo.Recepcionista;
import ProyectoVeterinaria.modelo.Registro;
import ProyectoVeterinaria.modelo.Veterinario;
import ProyectoVeterinaria.vista.VistaVeterinaria;
import javax.swing.JOptionPane;
import ProyectoVeterinaria.modelo.Vacuna;
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
                throw new IllegalArgumentException("ERROR: debe de llenar todos los campos");
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
                throw new IllegalArgumentException("ERROR: debe de llenar todos los campos");
                
            String correoDueño=this.vistaVeterinaria.getTxtCorreoDueño();
            String nombreDueño=this.vistaVeterinaria.getTxtNombreDueño();
            String telefonoDueño=this.vistaVeterinaria.getTxtTelefonoDueño();
            String documentoDueño=this.vistaVeterinaria.getTxtDocumentoDueño();
            
            
            Dueño dueño=new Dueño(nombreDueño,documentoDueño,correoDueño, telefonoDueño);
            this.registro.añadirDueño(dueño);
            this.vistaVeterinaria.getCbDueñoMascota().removeAllItems();
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
                    throw new IllegalArgumentException("ERROR: debe de llenar todos los campos");
                }

                String nombreVacuna = this.vistaVeterinaria.getTxtVacuna().getText();
                double precioVacuna = Double.parseDouble(this.vistaVeterinaria.getTxtPrecioVacuna().getText());

                Vacuna vacuna = new Vacuna(precioVacuna, nombreVacuna);
                this.registro.añadirVacuna(vacuna);

                DefaultListModel<String> modeloLista = new DefaultListModel<>();
                for (Vacuna v : registro.getVacunas()) {
                    modeloLista.addElement(v.getNombreVacuna()+ " - $" + (int) v.getValorVacuna());
                }
                this.vistaVeterinaria.getLstVacunasDisponibles().setModel(modeloLista);

                this.vistaVeterinaria.getTxtVacuna().setText("");
                this.vistaVeterinaria.getTxtPrecioVacuna().setText("");

                JOptionPane.showMessageDialog(null, "VACUNA " + vacuna.getNombreVacuna().toUpperCase() + " FUE AGREGADA CORRECTAMENTE");

            } catch (NumberFormatException errorNumero) {
                JOptionPane.showMessageDialog(null, "ERROR: el precio debe ser un número válido");
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        });
        
       
        
        
        
        
        
    }
}
