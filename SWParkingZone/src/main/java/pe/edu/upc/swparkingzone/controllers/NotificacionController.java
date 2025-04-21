package pe.edu.upc.swparkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.swparkingzone.dtos.NotificacionDTO;
import pe.edu.upc.swparkingzone.entities.Notificacion;
import pe.edu.upc.swparkingzone.servicesinterfaces.INotificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionController {
    @Autowired
    private INotificacionService nS;

    @GetMapping
    public List<NotificacionDTO> Listar(){
        return nS.list().stream().map(t->{
            ModelMapper m = new ModelMapper();
            return m.map(t, NotificacionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody NotificacionDTO dto){
        ModelMapper m = new ModelMapper();
        Notificacion n= m.map(dto, Notificacion.class);
        nS.insert(n);
    }
    @GetMapping("/{id}")
    public NotificacionDTO buscarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        NotificacionDTO dto = m.map(nS, NotificacionDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody NotificacionDTO dto){
        ModelMapper m = new ModelMapper();
        Notificacion n= m.map(dto, Notificacion.class);
        nS.update(n);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        nS.delete(id);
    }

}
