package br.dev.diego.mcc.repositories;

import br.dev.diego.mcc.entities.Retiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetiroRepository extends JpaRepository<Retiro, Long> {

}
