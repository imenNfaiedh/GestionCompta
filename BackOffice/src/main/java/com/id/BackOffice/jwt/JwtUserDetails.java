package   com.id.BackOffice.jwt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
public class JwtUserDetails implements UserDetails {

  private static final long serialVersionUID = 5155720064139820502L;
  @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  private   Long id;
  private   String username;
  private   String password;
 private    String firstName;
  private   String lastName ;
  
  private String  email ;
  private String role;
  //private final Collection<? extends GrantedAuthority> authorities;

  public JwtUserDetails(Long id, String username, String password, String role,String firstName, String lastName,  String  email  ) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email ;

  //  List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
  //  authorities.add(new SimpleGrantedAuthority(role));

   // this.authorities = authorities;
  }
  
  public JwtUserDetails() {
	  
	  }

  
  public Long getId() {
    return id;
  }
  
  

  public void setId(Long id) {
	this.id = id;
}

public void setUsername(String username) {
	this.username = username;
}

@Override
  public String getUsername() {
    return username;
  }

  @JsonIgnore
  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @JsonIgnore
  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @JsonIgnore
  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  
  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

public void setPassword(String password) {
	this.password = password;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}
  
  

}


