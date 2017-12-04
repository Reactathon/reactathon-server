package hello.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class CrypoCurrencyController {

    private final CrypoCurrencyRepository crypoCurrencyRepository;

    @Autowired
    public CrypoCurrencyController(CrypoCurrencyRepository crypoCurrencyRepository) {
        this.crypoCurrencyRepository = crypoCurrencyRepository;
    }



    // return the 5 latest transactions
    @RequestMapping(value = "/currencies", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<CryptoCurrency> getLastTransactions(HttpServletRequest request) {


        String userName = request.getUserPrincipal().getName();
        System.out.println("Within Crypo and the username is: " + userName);

        CryptoCurrency cc1 = new CryptoCurrency();
        cc1.setCurrencyName("BitCoin");
        CryptoCurrency cc2 = new CryptoCurrency();
        cc2.setCurrencyName("LiteCoin");
        Iterable<CryptoCurrency> currencies = crypoCurrencyRepository.findAll();
        System.out.println("currencies" + currencies);
        return currencies;
    }
}
