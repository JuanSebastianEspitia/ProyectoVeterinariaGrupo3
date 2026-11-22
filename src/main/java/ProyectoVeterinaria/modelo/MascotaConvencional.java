/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maikol
 */
public class MascotaConvencional extends Mascota {
    private String raza;
    private List<Vacuna> registroVacunas;

    public MascotaConvencional(String raza, String nombre, String edad, String peso, String genero) {
        super(nombre, edad, peso, genero);
        this.raza = raza;
        this.registroVacunas=new ArrayList<>();
    }

    @Override
    public float calcularPago() {
    float totalMascota;
    totalMascota=this.getValorBase() + this.getHistorialClinico().obtenerConsultas().getLast().calcularValorBiologico();
        return totalMascota;
}
    public void registrarVacuna(Vacuna vacuna){
        registroVacunas.add(vacuna);
    }
    public String getRaza() {
        return raza;
    }

    public List<Vacuna> getRegistroVacunas() {
        return registroVacunas;
    }
    
}

