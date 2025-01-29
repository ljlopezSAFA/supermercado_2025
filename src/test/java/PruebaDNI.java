import com.sl.modelos.Cliente;
import com.sl.utilidades.UtilidadesCliente;

public class PruebaDNI {

    public static void main(String[] args) {


        Cliente cliente = new Cliente();
        cliente.setDni("12345678T");
        System.out.println(UtilidadesCliente.esDniValido(cliente));



    }
}
