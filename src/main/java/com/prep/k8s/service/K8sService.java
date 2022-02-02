package com.prep.k8s.service;

import com.prep.k8s.entity.K8sModel;
import com.prep.k8s.repository.K8sRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class K8sService {
    private K8sRepository k8sRepository;

    public K8sService(K8sRepository k8sRepository) {
        this.k8sRepository = k8sRepository;
    }

    public String getMessage(Long id) {
        Optional<K8sModel> result = k8sRepository.findById(id);
        if (result.isPresent()) {
            return result.get().getMessage();
        }
        return "not found";
    }
}
