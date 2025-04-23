package pe.edu.upc.swparkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.swparkingzone.dtos.NotificacionReservaDTO;
import pe.edu.upc.swparkingzone.entities.NotificacionReserva;
import pe.edu.upc.swparkingzone.servicesinterfaces.INotificacionReservaService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/notificacionesreservadas")
public class NotificacionReservaController {

    @Autowired
    private INotificacionReservaService nS;
    @GetMapping
    public List<NotificacionReservaDTO> listar(){
        return nS.list().stream().map(n->{
            ModelMapper m = new ModelMapper();
            return m.map(n, NotificacionReservaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody NotificacionReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        NotificacionReserva notificacionReserva = m.map(dto, NotificacionReserva.class);
        nS.insert(notificacionReserva);
    }

    @GetMapping("/{id}")
    public NotificacionReservaDTO buscarId(@PathVariable("id")int id ){
        ModelMapper m = new ModelMapper();
        NotificacionReservaDTO dto = m.map(nS, NotificacionReservaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody NotificacionReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        NotificacionReserva notificacionReserva = m.map(dto, NotificacionReserva.class);
        nS.update(notificacionReserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")int id) {
        nS.delete(id);
    }
}
