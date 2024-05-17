package pe.edu.cibertec.Practica02.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.Practica02.Entity.Vehiculo;
import pe.edu.cibertec.Practica02.Repository.VehicleRepository;
import pe.edu.cibertec.Practica02.Response.VehiculoFindResponse;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")


public class VehiculoService {

    @Autowired
    VehicleRepository vehicleRepository;



    @GetMapping("/find")
    public VehiculoFindResponse findvehiculo(@RequestParam(value = "id",defaultValue = "0")Integer id){


        Iterable<Vehiculo> vehiculos=null;

        if (id>0){
            vehiculos=vehicleRepository.findAllById(List.of(id));
        }
        else {
            vehiculos=vehicleRepository.findAll();
        }


        return new VehiculoFindResponse("01",null,vehiculos);

    }



}
