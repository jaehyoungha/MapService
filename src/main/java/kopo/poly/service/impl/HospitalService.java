package kopo.poly.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import kopo.poly.dto.HospitalDTO;
import kopo.poly.repository.Entity.HospitalEntity;
import kopo.poly.repository.HospitalRepository;
import kopo.poly.service.IHospitalService;
import kopo.poly.util.CmmUtil;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class HospitalService implements IHospitalService {

    private final HospitalRepository hospitalRepository;

    @Override
    public List<HospitalDTO> getLongitudeAndLatitude() {
        log.info(this.getClass().getName() + ".getLongitudeAndLatitude Start!!");

        // 병원 위도경도 전부 조회
        List<HospitalEntity> hList = hospitalRepository.findAll();

        // 엔티티의 값에 맞게 DTO에 넣어주기
        List<HospitalDTO> nList = new ObjectMapper().convertValue(hList,
                new TypeReference<List<HospitalDTO>>() {
                });

        log.info(this.getClass().getName() + ".getLongitudeAndLatitude End!!");
        return nList;
    }

    @Override
    public List<HospitalDTO> getHospitalList(String code) {
        log.info(this.getClass().getName() + ".getHospitalList Start!!");


        List<HospitalEntity> rList = hospitalRepository.findByGucode(code);

        // 엔티티의 값에 맞게 DTO에 넣어주기
        List<HospitalDTO> nList = new ObjectMapper().convertValue(rList,
                new TypeReference<List<HospitalDTO>>() {
                });

        log.info(this.getClass().getName() + ".getHospitalList End!!");

        return nList;
    }
}
