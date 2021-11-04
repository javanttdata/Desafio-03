package trilha.back.financys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.DTO.CategoryDTO;
import trilha.back.financys.entities.Category;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value="Desafio 3 Cybertron")
@CrossOrigin(origins ="*")
public class CategoryController {
    private List<Category> list = new ArrayList<Category>();


    @PostMapping("/categorias")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value="Cria uma Categoria")
    public CategoryDTO create(@RequestBody Category category) {
        list.add(category);
        return new CategoryDTO(list.indexOf(category));
    }

    @GetMapping("/categorias")
    @ApiOperation(value="Retorna a lista de Categorias")
    public List<Category> read (Category category){
        return list;
    }

}
