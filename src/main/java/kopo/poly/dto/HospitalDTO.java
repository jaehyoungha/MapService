package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HospitalDTO {

    private long hospitalSeq; // 시퀀스
    private String hospitalName; // 병원기관명
    private String hospitalAddr; // 병원주소
    private String hospitalClassification; // 병원분류명
    private String hospitalTel; // 대표번호
    private String mondayO; // 월요일 오픈
    private String tuesdayO; // 화요일 오픈
    private String wednesdayO; // 수요일 오픈
    private String thursdayO; // 목요일 오픈
    private String fridayO; // 금요일 오픈
    private String saturdayO; // 토요일 오픈
    private String sundayO; // 일요일 오픈
    private String holidayO; // 공휴일 오픈
    private String mondayC; // 월요일 마감
    private String tuesdayC; // 화요일 마감
    private String wednesdayC; // 수요일 마감
    private String thursdayC; // 목요일 마감
    private String fridayC; // 금요일 마감
    private String saturdayC; // 토요일 마감
    private String sundayC; // 일요일 마감
    private String holidayC; // 공휴일 마감
    private String latitude; // 위도
    private String longitude; // 경도
    private String gucode; // 행정구별 코드
}
