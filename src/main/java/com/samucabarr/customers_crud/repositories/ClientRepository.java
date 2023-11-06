package com.samucabarr.customers_crud.repositories;

import com.samucabarr.customers_crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
