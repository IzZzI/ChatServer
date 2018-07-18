package cn.snowman.chat.repository;

import cn.snowman.chat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUsernameAndPassword(String username, String password);

}
