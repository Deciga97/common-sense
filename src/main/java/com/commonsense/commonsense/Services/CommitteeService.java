package com.commonsense.commonsense.Services;

import com.commonsense.commonsense.models.Committee;

import java.util.List;

public interface CommitteeService {
    List<Committee> getAllCommittees();
    Committee getCommitteeById(Long id);
    Committee createCommittee(Committee committee);
    Committee updateCommittee(Long id, Committee committee);
    void deleteCommittee(Long id);
}
