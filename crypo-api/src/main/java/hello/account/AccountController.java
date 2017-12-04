package hello.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
public class AccountController {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @CrossOrigin
    @RequestMapping(value = "/account/login", method = RequestMethod.GET)
    public @ResponseBody
    Account information(HttpServletRequest request) {
        String userName = request.getUserPrincipal().getName();
        return accountRepository.findByUsername(userName);
    }

}
