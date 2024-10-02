package fpoly.java5.Controller;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CookieService {
    @Autowired
    HttpServletRequest request;
    public Cookie createCookie(String name, String value , int days){
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(days*24*60*60);
        cookie.setPath("/");
        return cookie;
    }
    public Cookie getCookie(String name){
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if(cookie.getName().equals(name)){
                return cookie;
                return null;
            }
        }
    }
}
