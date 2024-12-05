package https.github.com.rodrigoaustincascao.agregadorinvestimentos.repository;

import https.github.com.rodrigoaustincascao.agregadorinvestimentos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository  extends JpaRepository<User, UUID> {
}
