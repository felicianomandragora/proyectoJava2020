/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico_final;

/**
 *
 * @author Mariana
 */
public class EmpleadoFT extends Empleado implements ICantante{
    private String telefono;
    private String direccion;
    private TipoEmpleado tipoEmpleado;

     public EmpleadoFT(String telefono, String direccion, String tipoEmpleado) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoEmpleado = new TipoEmpleado();
        this.tipoEmpleado.setTipoEmpleado(tipoEmpleado); 
    }
     
    @Override
    public String Cantar(){
        throw new Error("Not implemented yet");
    }
    
    public int calcularSalarioBruto() {
        throw new Error("Not implemented yet");
    } 
    
    public int calcularSalarioNeto() {
        throw new Error("Not implemented yet");
    } 
    
     
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoEmpleado() {
        return this.tipoEmpleado.getTipoEmpleado();
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado.setTipoEmpleado(tipoEmpleado);
    }         
}
