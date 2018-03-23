package com.service.ccproject.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-23T16:04:03.001Z")

@RestSchema(schemaId = "ccproject")
@RequestMapping(path = "/ccproject", produces = MediaType.APPLICATION_JSON)
public class CcprojectImpl {

    @Autowired
    private CcprojectDelegate userCcprojectDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCcprojectDelegate.helloworld(name);
    }

}
