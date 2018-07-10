package br.com.lelo.springcloud.mydash.controller;

import br.com.lelo.springcloud.mydash.model.SaleItemDto;
import br.com.lelo.springcloud.mydash.services.DashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dash")
public class DashController {

    @Autowired
    private DashService service;

    @GetMapping("sale")
    public ResponseEntity<List<SaleItemDto>> message() {
        return ResponseEntity.ok(service.getList());
    }
}
