package eu.epfc.holiday.repositories;

import eu.epfc.holiday.entities.DayOff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayOffRepository extends JpaRepository<DayOff, Long> {
}
