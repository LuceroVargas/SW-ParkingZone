package pe.edu.upc.swparkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.swparkingzone.dtos.ReclamoDTO;
import pe.edu.upc.swparkingzone.dtos.ReporteReclamosDTO;
import pe.edu.upc.swparkingzone.entities.Reclamo;
import pe.edu.upc.swparkingzone.servicesinterfaces.IReclamoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reclamos")
public class ReclamoController {

    private static final Logger logger = LoggerFactory.getLogger(ReclamoController.class);

    @Autowired
    private IReclamoService mS;

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADRCL')")
    public List<ReclamoDTO> list(){
        logger.info("Listando todos los reclamos registrados por los usuarios");
        return mS.list().stream().map(l->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(l, ReclamoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADRCL')")
    public void insertar(@RequestBody ReclamoDTO dto){
        logger.info("Insertando nuevos reclamos por parte del usuario con ID: {}", dto.getIdReclamo());
        ModelMapper modelMapper = new ModelMapper();
        Reclamo rc=modelMapper.map(dto, Reclamo.class);
        mS.insert(rc);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADRCL')")
    public ReclamoDTO buscarId(@PathVariable("id") int id){
        logger.info("Buscando reclamos con ID: {}", id);
        ModelMapper modelMapper = new ModelMapper();
        ReclamoDTO dto = modelMapper.map(mS, ReclamoDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADRCL')")
    public void modificar(@RequestBody ReclamoDTO dto){
        logger.info("Modificando reclamos con ID: {}", dto.getIdReclamo());
        ModelMapper modelMapper = new ModelMapper();
        Reclamo rc=modelMapper.map(dto, Reclamo.class);
        mS.update(rc);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADRCL')")
    public void eliminar(@PathVariable("id") int id){
        logger.info("Eliminando reclamos atendidos con ID: {}", id);
        mS.delete(id);
    }

    /*@GetMapping("/reclamos-usuarios")
    @PreAuthorize("hasAnyAuthority('ADRCL')")
    public List<ReclamoUsuarioDTO> reclamos(){
        List<String[]> fila = mS.listarReclamosUsuarios();
        List<ReclamoUsuarioDTO>  dtoLista = new ArrayList<>();

        for(String[] columna:fila){
            ReclamoUsuarioDTO dto = new ReclamoUsuarioDTO();
            dto.setUsername(columna[0]);
            dto.setApellido(columna[1]);
            dto.setTitulo(columna[2]);
            dto.setDescripcion(columna[3]);
            dto.setEstado(columna[4]);
            dto.setFecha(LocalDate.parse(columna[5]));
            dto.setHora(LocalTime.parse(columna[6]));
        }
        return dtoLista;
    }*/

    @GetMapping("/reportes-reclamos-usuarios")
    @PreAuthorize("hasAnyAuthority('ADRCL')")
    public List<ReporteReclamosDTO> reportesReclamosxUsuario(){
        logger.info("Reportes de reclamos por los usuarios");
        List<String[]> fila = mS.ReporteReclamosUsuario();
        List<ReporteReclamosDTO> dtoLista = new ArrayList<>();

        for(String[] columna: fila){
            ReporteReclamosDTO dto = new ReporteReclamosDTO();
            dto.setId_usuario(Integer.parseInt(columna[0]));
            dto.setUsername(columna[1]);
            dto.setFecha_reclamo(LocalDate.parse(columna[2]));
            dto.setCantidad_reclamos(Integer.parseInt(columna[3]));
            dto.setReclamos_con_reserva(Integer.parseInt(columna[4]));
        }
        return dtoLista;
    }
}
