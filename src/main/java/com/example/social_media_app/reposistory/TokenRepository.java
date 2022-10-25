package com.example.social_media_app.reposistory;

import com.example.social_media_app.Model.AuthenticationToken;
import com.example.social_media_app.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<AuthenticationToken,Integer> {
    AuthenticationToken findByUser(User user);


}
