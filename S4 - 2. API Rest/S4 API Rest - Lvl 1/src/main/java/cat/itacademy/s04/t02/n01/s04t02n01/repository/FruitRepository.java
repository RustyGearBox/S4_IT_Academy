package cat.itacademy.s04.t02.n01.s04t02n01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cat.itacademy.s04.t02.n01.s04t02n01.model.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}