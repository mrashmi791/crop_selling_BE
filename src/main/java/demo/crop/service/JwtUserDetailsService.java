package demo.crop.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    Logger logger = LoggerFactory.getLogger(JwtUserDetailsService.class);


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		logger.info("reached  : {}", username);
		if("Rashmi".equals(username)) {
			return new User("Rashmi","$2a$04$UVXwpZXJSSA2.lPbua7oyuSWjODhFPZ.C1lS1CMeVGJADL/AghaC6",new ArrayList());
		} else {
			throw new UsernameNotFoundException("user not found");
		}
		
	}

}
