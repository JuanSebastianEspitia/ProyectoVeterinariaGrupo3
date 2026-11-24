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
    totalMascota=this.getValorBase();
        return totalMascota;
}
    public void registrarVacuna(String vacuna){
        Vacuna v=new Vacuna(0,vacuna);
        registroVacunas.add(v);
    }
    public String getRaza() {
        return raza;
    }

    public String getRegistroVacunas() {
        String mensaje="";
        if(this.registroVacunas.isEmpty())
            mensaje="NINGUNA";
        for(Vacuna v:this.registroVacunas){
            mensaje+="\n -"+v.getNombreVacuna();
        }
        return mensaje;
    }
    
}


