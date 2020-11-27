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
public class TipoEmpleado {
    private String tipoEmpleado;

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        if (!"vendedor".equals(tipoEmpleado) || !"empleado".equals(tipoEmpleado)) {
            throw new Error("Unsupported type");
        }
        this.tipoEmpleado = tipoEmpleado;
    }
    
}
