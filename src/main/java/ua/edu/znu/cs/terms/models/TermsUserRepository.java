package ua.edu.znu.cs.terms.models;

import org.springframework.data.repository.CrudRepository;
import ua.edu.znu.cs.terms.entities.TermsUser;

public interface TermsUserRepository  extends CrudRepository<TermsUser, Integer> {
    
}
