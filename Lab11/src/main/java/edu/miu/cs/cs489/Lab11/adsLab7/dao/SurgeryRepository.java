package edu.miu.cs.cs489.Lab11.adsLab7.dao;

import edu.miu.cs.cs489.Lab11.adsLab7.models.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery, Long> {
}
