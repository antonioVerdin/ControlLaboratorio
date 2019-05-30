package prubalaboratorio.demo.Model;

import lombok.Data;

@Data
public class PrestamoEquipoModel {

    private int idSolicitante;
    private int idEquipo;
    private String fecha;
    private int idEstado;

    public PrestamoEquipoModel(){

    }
}
