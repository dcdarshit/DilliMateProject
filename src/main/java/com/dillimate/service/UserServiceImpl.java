package com.dillimate.service;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dillimate.entities.Role;
import com.dillimate.entities.User;
import com.dillimate.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	

	@Autowired
    private UserRepository userRepository;

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    public Optional<User> findById(Long id) {
    	return userRepository.findById(id);
    }

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(
        		user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
	}

//	@Override
//	public User save(UserRegistrationDto registration, MultipartFile file) throws IOException {
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        User user = new User();
//        user.setFirstName(registration.getFirstName());
//        user.setLastName(registration.getLastName());
//        user.setEmail(registration.getEmail());
//        user.setPassword(passwordEncoder.encode(registration.getPassword()));
//        user.setCreateDate(new Date());
//        user.setProfilePic(file.getBytes());
//        user.setRoles(Arrays.asList(new Role("ROLE_USER")));
//        return userRepository.save(user);
//	}
	
	@Override
	public User save(User user){
        return userRepository.save(user);
	}
	
	private Collection < ? extends GrantedAuthority > mapRolesToAuthorities(Collection <Role> roles) {
        return roles.stream()
            .map(role -> new SimpleGrantedAuthority(role.getName()))
            .collect(Collectors.toList());
    }

}
