package com.ifrn.lojacarro;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
