package pe.edu.upc.swparkingzone.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
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
    private IReservaService vS;

    @GetMapping
    public List<ReservaDTO> list(){
        return vS.list().stream().map(a->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(a, ReservaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ReservaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Reserva reserva = modelMapper.map(dto, Reserva.class);
        vS.insert(reserva);
    }
    @GetMapping("/{id}")
    public ReservaDTO buscarId(@PathVariable("id") int id){
        ModelMapper modelMapper = new ModelMapper();
        ReservaDTO dto = modelMapper.map(vS, ReservaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ReservaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Reserva rv = modelMapper.map(dto, Reserva.class);
        vS.update(rv);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        vS.delete(id);
    }
}
