package com.reto2.reto2.repositorio;

import java.util.List;
import java.util.Optional;

import com.reto2.reto2.interfaz.InterfaceOrder;
import com.reto2.reto2.modelo.Order;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Brayand Fuyo
 */
@Repository
public class OrderRepository {
    @Autowired
    private InterfaceOrder orderCrudRepository;

    // @Autowired
    // private MongoTemplate mongoTemplate;

    public List<Order> getAll() {
        return (List<Order>) orderCrudRepository.findAll();
    }
    
    public Optional<Order> getOrder(int id) {
        return orderCrudRepository.findById(id);
    }
    
    //prueba
    public List<Order> getZona(String zona) {
        return orderCrudRepository.findByZone(zona);
    }

    public Order create(Order order) {
        return orderCrudRepository.save(order);
    }

    public void update(Order order) {
        orderCrudRepository.save(order);
    }

    public void delete(Order order) {
        orderCrudRepository.delete(order);
    }

    // public List<Order> findByZoneList(String zona){
    //     return orderCrudRepository.findByZone(zona);
    // }
    
    public Optional<Order> lastUserId(){
        return orderCrudRepository.findTopByOrderByIdDesc();
    }
}
