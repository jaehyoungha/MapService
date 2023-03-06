package kopo.poly.repository.Entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "HOSPITAL")
@DynamicUpdate
@DynamicInsert
@Builder
@Entity
public class HospitalEntity {

        @Id // 시퀀스
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column (name =  "HOSPITAL_SEQ")
        private Long hospitalSeq;

        @NonNull // 병원기관명
        @Column(name = "HOSPITAL_NAME", nullable = false)
        private String hospitalName;

        @NonNull // 병원 주소
        @Column(name = "HOSPITAL_ADDR")
        private String hospitalAddr;

        @NonNull
        @Column(name = "HOSPITAL_CLASSIFICATION", nullable = false)
        private String hospitalClassification;

        @NonNull // 대표 번호
        @Column(name = "HOSPITAL_TEL", nullable = false)
        private String hospitalTel;

        //월요일 오픈
        @Column(name = "MONDAY_O")
        private String mondayO;

        //화요일 오픈
        @Column(name = "TUESDAY_O")
        private String tuesdayO;

        //수요일 오픈
        @Column(name = "WEDNESDAY_O")
        private String wednesdayO;

        //목요일 오픈
        @Column(name = "THURSDAY_O")
        private String thursdayO;

        //금요일 오픈
        @Column(name = "FRIDAY_O")
        private String fridayO;

        //토요일 오픈
        @Column(name = "SATURDAY_O")
        private String saturdayO;

        //일요일 오픈
        @Column(name = "SUNDAY_O")
        private String sundayO;

        //공휴일 오픈
        @Column(name = "HOLIDAY_O")
        private String HolidayO;

        //월요일 마감
        @Column(name = "MONDAY_C")
        private String mondayC;

        //화요일 마감
        @Column(name = "TUESDAY_C")
        private String tuesdayC;

        //수요일 마감
        @Column(name = "WEDNESDAY_C")
        private String wednesdayC;

        //목요일 마감
        @Column(name = "THURSDAY_C")
        private String thursdayC;

        //금요일 마감
        @Column(name = "FRIDAY_C")
        private String fridayC;

        //토요일 마감
        @Column(name = "SATURDAY_C")
        private String saturdayC;

        //일요일 마감
        @Column(name = "SUNDAY_C")
        private String sundayC;

        //공휴일 마감
        @Column(name = "HOLIDAY_C")
        private String HolidayC;

        @NonNull // 위도
        @Column(name = "LATITUDE")
        private String latitude;

        @NonNull // 경도
        @Column(name = "LONGITUDE")
        private String longitude;

        @NonNull // 행정구역 코드
        @Column(name = "GU_CODE")
        private String gucode;

    }

