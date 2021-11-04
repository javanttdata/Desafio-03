package trilha.back.financys.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.DTO.LancamentosDTO;
import trilha.back.financys.entities.Lancamentos;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value="Desafio 3 Cybertron")
@CrossOrigin(origins ="*")
public class LancamentosController {

    private final List<Lancamentos> list = new ArrayList<Lancamentos>();

    @PostMapping("/lancamentos")
    @ResponseStatus(HttpStatus.FOUND)
    @ApiOperation(value="Cria um Lancamento")
    public LancamentosDTO create(@RequestBody Lancamentos lancamentos){
        list.add(lancamentos);
        return new LancamentosDTO(list.indexOf(lancamentos));
    }

    @GetMapping("/lancamentos")
    @ApiOperation(value="Lista os Lancamentos por ordem de data")
    public List<Lancamentos> read (){
        Comparator<Lancamentos> comparaPelaData = (l1, l2) -> l1.getDataLancamento().compareTo(l2.getDataLancamento());
        list.sort(comparaPelaData);
        return list;
    }
}
