package pe.edu.cibertec.Practica02.Response;

import pe.edu.cibertec.Practica02.Entity.Vehiculo;

public record VehiculoFindResponse(String code, String error, Iterable<Vehiculo> vehiculos) {
}
