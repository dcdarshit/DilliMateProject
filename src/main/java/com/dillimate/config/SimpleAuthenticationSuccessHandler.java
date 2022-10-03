package com.dillimate.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.dillimate.entities.User;
import com.dillimate.service.UserService;

@Component
public class SimpleAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		java.util.Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		authorities.forEach(authority -> {
			if(authority.getAuthority().equals("ROLE_USER")) {
				try {
					String uname = authentication.getName();
				    User user = userService.findByEmail(uname);
					redirectStrategy.sendRedirect(request, response, "/user/dashboard/USER/" + user.getId());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if(authority.getAuthority().equals("ROLE_ADMIN")) {
				try {
					String uname = authentication.getName();
				    User user = userService.findByEmail(uname);
					redirectStrategy.sendRedirect(request, response, "/admin/dashboard/ADMIN/" + user.getId());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				 throw new IllegalStateException();
	        }
		});
	}
				

}
