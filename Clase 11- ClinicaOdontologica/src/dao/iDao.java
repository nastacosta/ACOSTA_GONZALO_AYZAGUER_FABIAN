package dao;

import java.sql.SQLException;
import java.util.List;

public interface iDao<T> {
    //todo el crud
    T guardar(T t) throws SQLException;
    T buscarPorId(Integer id);
    void eliminar(Integer id) throws SQLException;
    void actualizar(T t) throws SQLException;

    List<T> buscarTodos();

}