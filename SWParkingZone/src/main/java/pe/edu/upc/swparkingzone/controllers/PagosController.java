package pe.edu.upc.swparkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.swparkingzone.dtos.PagosDTO;
import pe.edu.upc.swparkingzone.entities.Pagos;
import pe.edu.upc.swparkingzone.servicesinterfaces.IPagosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagosController {
    @Autowired
    private IPagosService pS;

    @GetMapping
    public List<PagosDTO> listar() {
        return pS.list().stream().map(y -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(y, PagosDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody PagosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Pagos p = modelMapper.map(dto, Pagos.class);
        pS.insert(p);
    }

    @GetMapping("/{idPago}")
    public PagosDTO buscarId(@PathVariable("idPago") int idPago) {
        ModelMapper modelMapper = new ModelMapper();
        PagosDTO dto = modelMapper.map(pS.listId(idPago), PagosDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody PagosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Pagos p = modelMapper.map(dto, Pagos.class);
        pS.update(p);
    }

    @DeleteMapping("/{idPago}")
    public void eliminar(@PathVariable("idPago") int idPago) {pS.delete(idPago);
    }
}
