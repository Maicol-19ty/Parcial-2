package CRUD;

import java.io.IOException;
import java.util.List;

public interface ICentroComercial {
    CentroComercialDTO findById(int id);
    List<CentroComercialDTO> findAll() throws IOException, ClassNotFoundException;
    void save(CentroComercialDTO centro) throws IOException;
    void update(CentroComercialDTO centro) throws IOException;
    void delete(CentroComercialDTO centro) throws IOException;
}
