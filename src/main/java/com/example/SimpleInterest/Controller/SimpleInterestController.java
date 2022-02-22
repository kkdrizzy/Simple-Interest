package com.example.SimpleInterest.Controller;

import com.example.SimpleInterest.Exception.InterestVariableNotFound;
import com.example.SimpleInterest.Exception.InterestVariableSetZero;
import com.example.SimpleInterest.Exception.MissingInterestVariable;
import com.example.SimpleInterest.ModelDAO.InterestVariable;
import com.example.SimpleInterest.Service.SimpleInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SimpleInterestController {

    @Autowired
    SimpleInterestService simpleInterestService;

    @PostMapping("/calculate")
    public Long calculateSimpleInterest(@RequestBody InterestVariable interestVariable) throws InterestVariableSetZero, MissingInterestVariable {
        return simpleInterestService.calculateSimpleInterest(interestVariable);
    }

    @GetMapping("/simple-interest/{id}")
    public InterestVariable saveInterestVariable(@PathVariable("id") Long id) throws InterestVariableNotFound {
        return simpleInterestService.getInterestVariableClass(id);
    }
}
