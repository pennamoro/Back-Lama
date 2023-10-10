package com.example.backlama.controllers;

import com.example.backlama.models.Material;
import com.example.backlama.services.MaterialService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/material")
public class MaterialController {
    private final MaterialService materialService;
    public MaterialController(MaterialService materialService){
        this.materialService = materialService;
    }
    @GetMapping("/tipo/{id}")
    public ResponseEntity<List<Material>> visualizarMaterialLa(@PathVariable Long id){
        List<Material> materialPorTipo = materialService.bucarMaterialPorIdTipo(id);
        if(materialPorTipo != null){
        return new ResponseEntity<>(materialPorTipo, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    }
    @GetMapping("/all")
    public ResponseEntity<List<Material>> visualizarMaterial(){
        List<Material> material = materialService.mostratMaterial();
        if(material != null){
            return new ResponseEntity<>(material, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
