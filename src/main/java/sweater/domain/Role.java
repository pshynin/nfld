package sweater.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by pshynin on Nov, 2018
 */
public enum Role implements GrantedAuthority {
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}