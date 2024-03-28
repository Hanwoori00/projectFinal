package com.example.projectFinal.repository;

import com.example.projectFinal.entity.UserMissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserMissionRepository extends JpaRepository<UserMissionEntity, Integer> {

    List<UserMissionEntity> findByUserIdAndUsed(String userId, boolean used);
}
