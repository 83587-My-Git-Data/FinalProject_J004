package com.childadoption.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.childadoption.entities.Slot;
import java.lang.Long;
import java.util.Optional;

public interface SlotDao extends JpaRepository<Slot, Long>{
	Optional<Slot> findBySlotId(Long slotId);
}
