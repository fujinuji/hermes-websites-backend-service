package ro.societateahermes.backendservice.controller;


import org.springframework.http.ResponseEntity;
import ro.societateahermes.backendservice.entities.dto.CDMemberDTO;

import java.util.List;

public interface CDMemberControllerInterface {
    ResponseEntity<String> saveCDMember(CDMemberDTO member);

    void deleteCDMember(Long CDMemberID);

    void updateCDMember(CDMemberDTO cdMemberDTO);

    List<CDMemberDTO> getAllCDMembers();
}
