package com.thc.THC.repository;

import com.thc.THC.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface THCRepository extends JpaRepository<Location, Long> {
}
