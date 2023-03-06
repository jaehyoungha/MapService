package kopo.poly.service;

import kopo.poly.dto.HospitalDTO;
import kopo.poly.repository.Entity.HospitalEntity;

import java.util.List;

public interface IHospitalService {

    List<HospitalDTO> getLongitudeAndLatitude();

    List<HospitalDTO> getHospitalList(String code);
}
