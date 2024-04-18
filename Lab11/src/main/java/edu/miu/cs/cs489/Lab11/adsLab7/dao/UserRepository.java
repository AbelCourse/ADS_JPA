package edu.miu.cs.cs489.Lab11.adsLab7.dao;

import edu.miu.cs.cs489.Lab11.adsLab7.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
