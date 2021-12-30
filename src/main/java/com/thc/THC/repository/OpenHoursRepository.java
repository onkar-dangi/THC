package com.thc.THC.repository;

import com.thc.THC.models.OpenHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenHoursRepository extends JpaRepository<OpenHours, Long> {
}
