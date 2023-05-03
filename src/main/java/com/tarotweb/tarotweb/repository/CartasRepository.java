package com.tarotweb.tarotweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarotweb.tarotweb.entity.CartasEntity;

@Repository
public interface CartasRepository extends JpaRepository<CartasEntity, Long> {

}
