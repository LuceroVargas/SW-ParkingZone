package pe.edu.upc.swparkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.swparkingzone.dtos.ReservaDTO;
import pe.edu.upc.swparkingzone.entities.Reserva;
import pe.edu.upc.swparkingzone.servicesinterfaces.IReservaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private IReservaService rS;
    @GetMapping
    public List<ReservaDTO> listar(){
        return rS.list().stream().map( v->{
            ModelMapper m = new ModelMapper();
            return m.map(v, ReservaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        Reserva reserva = m.map(dto, Reserva.class);
        rS.insert(reserva);
    }

    @GetMapping("/{id}")
    public ReservaDTO buscarId(@PathVariable("id")int id) {
        ModelMapper m = new ModelMapper();
        ReservaDTO dto = m.map(rS, ReservaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        Reserva reserva = m.map(dto, Reserva.class);
        rS.update(reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")int id) {
        rS.delete(id);
    }
}
