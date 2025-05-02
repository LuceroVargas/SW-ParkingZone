package pe.edu.upc.swparkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.swparkingzone.dtos.ReclamoDTO;
import pe.edu.upc.swparkingzone.entities.Reclamo;
import pe.edu.upc.swparkingzone.servicesinterfaces.IReclamoService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reclamos")
public class ReclamoController {
    @Autowired
    private IReclamoService mS;

    @GetMapping
    public List<ReclamoDTO> list(){
        return mS.list().stream().map(l->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(l, ReclamoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ReclamoDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Reclamo rc=modelMapper.map(dto, Reclamo.class);
        mS.insert(rc);
    }
    @GetMapping("/{id}")
    public ReclamoDTO buscarId(@PathVariable("id") int id){
        ModelMapper modelMapper = new ModelMapper();
        ReclamoDTO dto = modelMapper.map(mS, ReclamoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ReclamoDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Reclamo rc=modelMapper.map(dto, Reclamo.class);
        mS.update(rc);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        mS.delete(id);
    }
}
