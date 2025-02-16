package cat.itacademy.s04.t02.n02.s04t02n02.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cat.itacademy.s04.t02.n02.s04t02n02.model.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {
    Optional<Fruit> findByName(String name);
    Fruit findById(int id);
}
