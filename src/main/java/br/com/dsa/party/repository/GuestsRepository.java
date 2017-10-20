package br.com.dsa.party.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dsa.party.model.Guest;

public interface GuestsRepository extends JpaRepository<Guest, Long> {

}
