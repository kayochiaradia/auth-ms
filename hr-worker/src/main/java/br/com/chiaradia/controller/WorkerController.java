package br.com.chiaradia.controller;

import br.com.chiaradia.repotitory.entities.Worker;
import br.com.chiaradia.service.WorkerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    private WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        return ResponseEntity.ok().body(workerService.findAllWorkers());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findByWorkerId(@PathVariable Long id) {
        Optional<Worker> worker = workerService.findById(id);

        if(worker.isPresent())
            return ResponseEntity.ok().body(worker.get());

        return ResponseEntity.notFound().build();
    }
}
