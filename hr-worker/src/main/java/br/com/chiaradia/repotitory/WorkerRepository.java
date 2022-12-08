package br.com.chiaradia.repotitory;

import br.com.chiaradia.repotitory.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
