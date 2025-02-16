package cat.itacademy.s04.t02.n01.s04t02n01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.s04.t02.n01.s04t02n01.model.Fruit;
import cat.itacademy.s04.t02.n01.s04t02n01.model.DTO.FruitDTO;
import cat.itacademy.s04.t02.n01.s04t02n01.service.FruitService;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    
    @Autowired
    private FruitService fruitService;

    @PostMapping
    public ResponseEntity<Fruit> addFruit(@RequestBody FruitDTO fruitDTO){
        Fruit fruit = new Fruit(null, fruitDTO.getName(), fruitDTO.getQuantity());
        return ResponseEntity.ok(fruitService.addFruit(fruit));
    }
    
    @PutMapping
    public ResponseEntity<Fruit> updateFruit(@RequestBody FruitDTO fruitDTO){
        Fruit fruit = new Fruit(null, fruitDTO.getName(), fruitDTO.getQuantity());
        return ResponseEntity.ok(fruitService.updateFruit(fruit));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable int id){
        fruitService.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fruit> getFruitById(@PathVariable int id){
        return ResponseEntity.ok(fruitService.getFruitById(id));
    }

    @GetMapping
    public ResponseEntity<List<Fruit>> getAllFruit(){
        return ResponseEntity.ok(fruitService.getAllFruits());
    }

}
