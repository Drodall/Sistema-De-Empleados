package co.co.zonatelematica.empleados.repositorios;

import co.co.zonatelematica.empleados.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

}
