package br.com.chiaradia.service;

import br.com.chiaradia.repotitory.entities.Worker;

import java.util.List;
import java.util.Optional;

public interface WorkerService {
    List<Worker> findAllWorkers();
    Optional<Worker> findById(Long id);
}
