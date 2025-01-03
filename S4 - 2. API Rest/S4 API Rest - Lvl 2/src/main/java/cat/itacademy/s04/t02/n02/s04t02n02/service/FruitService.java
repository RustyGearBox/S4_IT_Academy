package cat.itacademy.s04.t02.n02.s04t02n02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.s04.t02.n02.s04t02n02.model.Fruit;
import cat.itacademy.s04.t02.n02.s04t02n02.repository.FruitRepository;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public Fruit addFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public void deleteFruit(int id) {
        fruitRepository.deleteById(id);
    }

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }
    
}