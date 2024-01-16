package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.model.instalaciones.Acuatico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAcuaticoRepitory extends JpaRepository<Acuatico, Integer> {
    boolean existsByComedero_Id(int id);
}