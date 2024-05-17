package service;

import dao.OdontologoDAOH2;
import dao.iDao;
import model.Odontologo;

import java.sql.SQLException;

public class OdontologoService {
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService() {
        odontologoiDao= new OdontologoDAOH2();
    }
    public Odontologo guardarOdontologo(Odontologo odontologo) throws SQLException {
        return odontologoiDao.guardar(odontologo);
    }
    public Odontologo buscarPorID(Integer id){
        return odontologoiDao.buscarPorId(id);
    }

}
