package com.prep.k8s.repository;

import com.prep.k8s.entity.K8sModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface K8sRepository extends JpaRepository<K8sModel, Long> {
}
