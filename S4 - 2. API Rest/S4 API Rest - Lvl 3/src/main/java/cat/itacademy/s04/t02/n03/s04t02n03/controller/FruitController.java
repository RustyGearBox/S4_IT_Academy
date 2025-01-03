package cat.itacademy.s04.t02.n03.s04t02n03.controller;

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

import cat.itacademy.s04.t02.n03.s04t02n03.model.Fruit;
import cat.itacademy.s04.t02.n03.s04t02n03.service.FruitService;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    
    @Autowired
    private FruitService fruitService;

    @PostMapping("/add")
    private ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit){
        return ResponseEntity.ok(fruitService.addFruit(fruit));
    }
    
    @PutMapping("/update")
    private ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit){
        return ResponseEntity.ok(fruitService.updateFruit(fruit));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> deleteFruit(@PathVariable int id){
        fruitService.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/fruit/getAll")
    private ResponseEntity<List<Fruit>> getAllFruit(){
        return ResponseEntity.ok(fruitService.getAllFruits());
    }

}