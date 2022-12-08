package br.com.chiaradia.service.impl;

import br.com.chiaradia.repotitory.WorkerRepository;
import br.com.chiaradia.repotitory.entities.Worker;
import br.com.chiaradia.service.WorkerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerServiceImpl implements WorkerService {

    private WorkerRepository workerRepository;

    public WorkerServiceImpl(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public List<Worker> findAllWorkers() {
        return workerRepository.findAll();
    }

    public Optional<Worker> findById(Long id) {
        return workerRepository.findById(id);
    }
}
