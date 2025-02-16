package cat.itacademy.s04.t02.n02.s04t02n02.service;

import java.util.List;

import cat.itacademy.s04.t02.n02.s04t02n02.model.Fruit;

public interface IFruitService {
    
    Fruit addFruit(Fruit fruit);
    Fruit updateFruit(Fruit fruit);
    void deleteFruit(int id);
    List<Fruit> getAllFruits();
    Fruit getFruitById(int id);
    
}
