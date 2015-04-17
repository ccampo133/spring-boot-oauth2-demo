package oauth2demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class DemoController {

    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String getUser(final Principal principal) {
        return "Hello user " + principal.getName() + "!";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String getAdmin(final Principal principal) {
        return "Hello admin " + principal.getName() + "!";
    }
}
