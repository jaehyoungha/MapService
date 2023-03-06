package kopo.poly.controller;

import kopo.poly.dto.HospitalDTO;
import kopo.poly.service.IHospitalService;
import kopo.poly.util.CmmUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONArray;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
@Slf4j
public class RestController {

    private final IHospitalService hospitalService;

//    @GetMapping(value = "HospitalAddr")
//    List<HospitalDTO> getLongitudeAndLatitude(HttpServletRequest request, ModelMap model) throws Exception {
//
//        log.info(this.getClass().getName()+ ".HospitalAddr Start!!");
//        // 리스트 가져오기
//        List<HospitalDTO> hList = hospitalService.getLongitudeAndLatitude();
//
//        log.info("위도 경도 리스트" + hList.get(3).getHospitalName());
//        if (hList == null) {
//            hList = new ArrayList<HospitalDTO>();
//        }
//
//        // 모델로 보내기
//        model.addAttribute("HospitalList",hList);
//
//        log.info(this.getClass().getName()+ ".HospitalAddr Start!!");
//        return hList;
//    }

    @PostMapping(value = "searchHospital")
    List<HospitalDTO> getHospitalList (HttpServletRequest request, ModelMap model,
                                       @RequestParam(value = "gucode", required = false) String code) throws Exception {
        log.info(this.getClass().getName() + ".searchHospital Start!!");

        log.info("행정구 코드는 : " + code);


        List<HospitalDTO> rList = hospitalService.getHospitalList(code);
        log.info("가져온 리스트 첫번쨰 병원 명 : " + rList.get(0).getHospitalName());


        model.addAttribute("HospitalList", rList);
        log.info(this.getClass().getName() + ".searchHospital End!!");
        return rList;
    }
}
