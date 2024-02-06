package com.anadunning.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anadunning.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
