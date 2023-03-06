package kopo.poly.controller;

import kopo.poly.dto.HospitalDTO;
import kopo.poly.service.IHospitalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "map")
@Slf4j
public class MapController {

    private final IHospitalService hospitalService;

    @GetMapping(value = "/Map")
    String testMap (HttpServletRequest request, ModelMap model) throws Exception{
        log.info(this.getClass().getName() + ".testMap Start!!");

        log.info(this.getClass().getName() + ".testMap End!!");
        return "MapPage";
    }
}
