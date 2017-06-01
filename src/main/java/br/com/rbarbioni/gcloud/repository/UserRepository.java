package br.com.rbarbioni.gcloud.repository;

import br.com.rbarbioni.gcloud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by renan on 01/06/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {}
