package com.commonsense.commonsense.Services;

import com.commonsense.commonsense.models.Committee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommitteeService extends JpaRepository<Committee, Long> {

}
