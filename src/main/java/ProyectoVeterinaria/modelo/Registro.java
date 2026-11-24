/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Registro {
  private List<Recepcionista> recepcionistas;
    private List<Dueño> dueños;
    private List<Veterinario> veterinarios;
    private List<Vacuna> vacunas;
    private List<Cita> citas;
    private List<ConsultaMedica> consultas;

    public Registro() {
        this.recepcionistas=new ArrayList<>();
        this.dueños=new ArrayList<>();
        this.veterinarios=new ArrayList<>();
        this.vacunas=new ArrayList<>();
        this.citas=new ArrayList<>();
        this.consultas = new ArrayList<>();
    }
    
    public List<ConsultaMedica> getConsultas(){
        return consultas;
    }
    
    public void añadirConsulta(ConsultaMedica consulta) 
    { 
        this.consultas.add(consulta);
    }

    public List<Recepcionista> getRecepcionistas() {
        return recepcionistas;
    }

    public List<Dueño> getDueños() {
        return dueños;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public List<Vacuna> getVacunas() {
        return vacunas;
    }

    public List<Cita> getCitas() {
        return citas;
    }
    
    public void añadirVeterinario(Veterinario veterinario){
        this.veterinarios.add(veterinario);
    }
    
    public void añadirDueño(Dueño dueño){
        this.dueños.add(dueño);
    }
    
    public void añadirRecepcionista(Recepcionista recepcionista){
        this.recepcionistas.add(recepcionista);
    }
    
    public void añadirVacuna(Vacuna vacuna){
        this.vacunas.add(vacuna);
    }
    
    public void añadirCita(Cita cita){
        this.citas.add(cita);
    }

    public List<Cita> getCitasPendientes() {  
        List<Cita> pendientes = new ArrayList<>();
            for (Cita c : citas) {
            if (!c.isAtendida()) pendientes.add(c);
            }
        return pendientes;
    }
    
    public List<ConsultaMedica> getConsultasSinFacturar() {
        List<ConsultaMedica> sinFacturar = new ArrayList<>();
            for (ConsultaMedica c : consultas) {
            if (!c.isFacturada()) sinFacturar.add(c);
            }
        return sinFacturar;
    }
   }

