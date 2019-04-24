package com.zz.ztreedemo.repository;

import com.zz.ztreedemo.entity.ProMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProMenuRepository extends JpaRepository<ProMenu,Long> {
    @Transactional
    @Modifying
    @Query(value = "delete from ProMenu m where m.id in(:str)")
    public void DeleteSelected(@Param("str") List<String> str);
}
