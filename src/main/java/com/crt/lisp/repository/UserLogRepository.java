/**
 * 
 */
package com.crt.lisp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.UserLogEntity;


@Repository
public interface UserLogRepository extends JpaRepository<UserLogEntity, Integer> {

}
