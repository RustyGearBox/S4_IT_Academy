package cat.itacademy.s04.t02.n02.s04t02n02.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cat.itacademy.s04.t02.n02.s04t02n02.exception.custom.FruitAlreadyExistException;
import cat.itacademy.s04.t02.n02.s04t02n02.exception.custom.FruitNotFoundException;
import cat.itacademy.s04.t02.n02.s04t02n02.model.Fruit;
import cat.itacademy.s04.t02.n02.s04t02n02.repository.FruitRepository;


@Service
public class FruitService implements IFruitService{

    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public Fruit addFruit(Fruit fruit) {
        if (fruitRepository.findByName(fruit.getName()).isPresent()) {
            throw new FruitAlreadyExistException("A fruit with the name " + fruit.getName() + " already exists");
        }
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        Optional<Fruit> existingFruit = fruitRepository.findByName(fruit.getName());
        if (existingFruit.isPresent()) {
            existingFruit.get().setQuantityKg(fruit.getQuantityKg());
            return fruitRepository.save(fruit);
        } else {
            throw new FruitNotFoundException("The fruit with id " + fruit.getId() + " does not exist");
        }
    }

    @Override
    public void deleteFruit(int id) {
        if (fruitRepository.existsById(id)) {
            fruitRepository.deleteById(id);
        } else {
            throw new FruitNotFoundException("The fruit with id " + id + " does not exist");
        }
    }

    @Override
    public Fruit getFruitById(int id) {
        if (!fruitRepository.existsById(id)) {
            throw new FruitNotFoundException("The fruit with id " + id + " does not exist");
        }
        return fruitRepository.findById(id);
    }
    

    @Override
    public List<Fruit> getAllFruits() {
        if (fruitRepository.findAll().isEmpty()) {
            throw new FruitNotFoundException("There are no fruits in the database");
        }
        return fruitRepository.findAll();
    }
    
}
