package dao;

import model.Domicilio;
import model.Odontologo;
import model.Paciente;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.List;

public class OdontologoDAOH2 implements iDao<Odontologo> {
    private static final Logger logger= Logger.getLogger(OdontologoDAOH2.class);
    private static final String SQL_SELECT_ONE="SELECT * FROM ODONTOLOGOS WHERE ID=?";

    @Override
    public Odontologo guardar(Odontologo odontologo) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:~/clinicaOdontologica","sa","sa");
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO odontologo (matricula, nombre, apellido) VALUES (?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, odontologo.getMatricula());
        statement.setString(2, odontologo.getNombre());
        statement.setString(3, odontologo.getApellido());
        statement.executeUpdate();

        ResultSet generatedKeys = statement.getGeneratedKeys();
        if (generatedKeys.next()) {
            odontologo.setID((int) generatedKeys.getLong(1));
        }

        statement.close();
        connection.close();
        logger.info("Odontólogo guardado: " + odontologo);
        return odontologo;
    }

    @Override
    public Odontologo buscarPorId(Integer id) {
        logger.info("iniciando la operacion de buscado de un odontologo con id : "+id);
        Connection connection= null;
        Odontologo odontologo= null;
        try{
            connection= BD.getConnection();
            Statement statement= connection.createStatement();
            PreparedStatement psSElectOne= connection.prepareStatement(SQL_SELECT_ONE);
            psSElectOne.setInt(1,id);
            ResultSet rs= psSElectOne.executeQuery();

        }catch (Exception e){
            logger.error(e.getMessage());
        }

        return odontologo;
    }

    @Override
    public void eliminar(Integer id) throws SQLException {

    }

    @Override
    public void actualizar(Odontologo odontologo) throws SQLException {

    }

    @Override
    public List<Odontologo> buscarTodos() {
        return List.of();
    }

}
