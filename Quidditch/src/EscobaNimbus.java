import java.util.Calendar;

public class EscobaNimbus implements Escoba {

    private Integer valorArbitrario;
    private Double porcentajeSalud;

    public Double velocidadEscoba() {
        return 80- Calendar.getInstance().get(Calendar.YEAR)*porcentajeSalud;
    }

    public Integer getValorArbritrario(){
        return valorArbitrario;
    }



}
