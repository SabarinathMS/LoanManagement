package com.app.lma.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.lma.model.JwtUser;
import com.app.lma.repository.UserRepository;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {
	/*
	 * @Autowired UserRepository userRepository;
	 */	

    public String generate(JwtUser jwtUser) {


        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUserName());
        
//        if(userRepository.findById(jwtUser.getId()) != null ) {
        claims.put("userId", String.valueOf(jwtUser.getId()));
        claims.put("role", jwtUser.getRole());

        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "youtube")
                .compact();
    }
}
