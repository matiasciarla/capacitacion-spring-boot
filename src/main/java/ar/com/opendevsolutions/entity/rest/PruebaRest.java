package ar.com.opendevsolutions.entity.rest;

import ar.com.opendevsolutions.entity.service.PruebaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
@Api(value="/personas",produces ="application/json")
public class PruebaRest {

    @Autowired
    PruebaService pruebaService;

    @ApiOperation(value = "Prueba",response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })

    @GetMapping(value = "/", produces = "application/json")
    public List<Map<String, Object>> get(@RequestParam(value = "name", required = false) String name,
                                         @RequestParam(value = "lastname", required = false) String lastname
                                         ){
        System.out.println(name+" "+lastname);
        return this.pruebaService.get();
    }

    @ApiOperation(value = "Prueba",response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })

    @GetMapping(value = "/{id}", produces = "application/json")
    public List<Map<String,Object>> getById(@PathVariable(value="id") Integer id){
        //System.out.println("id");
        //System.out.println(id);
        return this.pruebaService.getById(id);
    }

    /*
    public void insert(){

    }

    public void update(){

    }

    public void delete(){

    }
    */

}
