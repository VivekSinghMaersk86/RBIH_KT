package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.example.demo.DTO.TMSResponceDTO;
import com.example.demo.DTO.TMSRequestDTO;
import java.util.Scanner;

@RestController
public class TMSController {

    @GetMapping("/")
    public String geturt() {
        return "Vivek";
    }

    // produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    @GetMapping("/TNSOutput")
    public TMSResponceDTO generateTNService(@RequestHeader("districtCode") String districtCode,
                                            @RequestHeader("talukCode") String talukCode,
                                            @RequestHeader("villCode") String villCode,
                                            @RequestHeader("surveyNo") String surveyNo,
                                            @RequestHeader("subdivNo") String subdivNo,
                                            @RequestHeader("lgd") boolean lgd) throws Exception {

        // List<ESignResponse>  YardResponseByENList1 = ESService.findByYardName(YardName);

        TMSResponceDTO TmsResEntity = new TMSResponceDTO();

        if(villCode.equals("642914")) {
            TmsResEntity.setOwnNum(101);
            TmsResEntity.setOwner("Jailalita");
            TmsResEntity.setRelation("Mother");
            return TmsResEntity;
        }else if (subdivNo.equals("1234")){
            TmsResEntity.setOwnNum(102);
            TmsResEntity.setOwner("PremSingh");
            TmsResEntity.setRelation("Father");
            return TmsResEntity;

        }else {
            return null;
        }
    }
}
