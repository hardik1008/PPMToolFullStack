package com.Hardik.PPMTool.repositories;

import com.Hardik.PPMTool.entity.project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<project, Long> {





}
