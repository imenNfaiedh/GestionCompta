package   com.id.BackOffice.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.id.BackOffice.repository.UserRepository;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

	
	@Autowired
	private UserRepository userRepository;
  //static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

/*  static {
    inMemoryUserList.add(new JwtUserDetails(1L, "imen",
    	  "$2a$10$.jt120p32Rm1efdFWaYnhOWrKc117tzuCMyClULsX8K5U8LcWpZKC", "ROLE_USER_2"));

    inMemoryUserList.add(new JwtUserDetails(1L, "marouene",
      	  "$2a$10$rjkyale5vpCfC5IYfubqoeCwGxeVbJW3RjXYPslr1vMSnR8umbkBK", "ROLE_USER_2"));

  }*/

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	  System.out.println("okk");
	 List<JwtUserDetails>  inMemoryUserList  = (List<JwtUserDetails>) userRepository.findAll();
	 System.out.println("okk" +inMemoryUserList.size());
	 System.out.println("okk" +inMemoryUserList);
    Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
        .filter(user -> user.getUsername().equals(username)).findFirst();

    if (!findFirst.isPresent()) {
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
    }

    return findFirst.get();
  }

}


