import java.time.LocalDate;
import java.time.LocalTime;

public class Lacteos extends Producto{
    public Lacteos() {
    }

    @Override
    public void comprar() {
    }

    @Override
    public void verificarExistencia() {
    }

    @Override
    public void obtenerTipoProducto() {
    }

    public void fechaRevision(){
        System.out.println("La fecha de revision del producto " + LocalDate.now()+ " y la hora "+LocalTime.now() );
    }

    public static void main(String[] args) {
        Lacteos l=new Lacteos();
        l.fechaRevision();
    }
}
