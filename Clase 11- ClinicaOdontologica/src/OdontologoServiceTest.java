import dao.BD;
import model.Odontologo;
import model.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.OdontologoService;
import service.OdontologoService;

public class OdontologoServiceTest {
    @Test
    public void buscarOdontologoPorID(){
        BD.crearTablas();
        OdontologoService odontologoService= new OdontologoService();
        Integer id= 1;
        Odontologo odontologo= odontologoService.buscarPorID(id);
        Assertions.assertTrue(odontologo!=null);
    }
}
