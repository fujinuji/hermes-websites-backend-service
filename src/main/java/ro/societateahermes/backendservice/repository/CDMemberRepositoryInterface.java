package ro.societateahermes.backendservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.societateahermes.backendservice.entities.CDMember;


public interface CDMemberRepositoryInterface extends JpaRepository<CDMember, Long> {

}
