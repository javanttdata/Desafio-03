package trilha.back.financys.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.DTO.LancamentosDTO;
import trilha.back.financys.entities.Lancamentos;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("lancamentos")
public class LancamentosController {

    private final List<Lancamentos> list = new ArrayList<Lancamentos>();

    @PostMapping
    @ResponseStatus(HttpStatus.FOUND)
    public LancamentosDTO create(@RequestBody Lancamentos lancamentos){
        list.add(lancamentos);
        return new LancamentosDTO(list.indexOf(lancamentos));
    }

    @GetMapping
    public List<Lancamentos> read (){
        Comparator<Lancamentos> comparaPelaData = (l1, l2) -> l1.getDate().compareTo(l2.getDate());
        list.sort(comparaPelaData);
        return list;
    }
}
