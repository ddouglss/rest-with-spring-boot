package br.com.ddouglss.controllers;

import br.com.ddouglss.service.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonServices service;

}
