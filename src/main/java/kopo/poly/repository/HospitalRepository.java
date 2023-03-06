package kopo.poly.repository;

import kopo.poly.repository.Entity.HospitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalEntity, Long> {

        List<HospitalEntity> findAll();

        List<HospitalEntity> findByGucode(String code);
}
