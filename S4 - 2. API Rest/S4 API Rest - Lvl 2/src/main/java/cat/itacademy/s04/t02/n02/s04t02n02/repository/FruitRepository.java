package cat.itacademy.s04.t02.n02.s04t02n02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cat.itacademy.s04.t02.n02.s04t02n02.model.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Integer>{   
}