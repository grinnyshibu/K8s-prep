package com.prep.k8s.controller;

import com.prep.k8s.service.K8sService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8sController {

    private K8sService k8sService;

    public K8sController(K8sService k8sService) {
        this.k8sService = k8sService;
    }

    @GetMapping("hello-world/{id}")
    public ResponseEntity<String> getMessage(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(k8sService.getMessage(id));
    }
}
