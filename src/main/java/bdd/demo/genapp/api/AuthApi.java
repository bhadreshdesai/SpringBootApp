package bdd.demo.genapp.api;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/public")
public class AuthApi {
    final Logger LOG = LoggerFactory.getLogger(this.getClass());
    
    @PostMapping("register")
    public UserView register(@RequestBody @Valid CreateUserRequest request) {
        LOG.info("info post register called");
        LOG.debug("debug post register called");
        UserView userView = new UserView();
        userView.setUsername(request.getUsername());
        userView.setFullName(request.getFullName());
        return userView;
    }
}
