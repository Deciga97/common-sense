package com.commonsense.commonsense.Services;

import com.commonsense.commonsense.models.Bill;

import java.util.List;

public interface BillService {

    Bill createBill(Bill bill);

    Bill updateBill(Long id, Bill updatedBill);

    void deleteBill(Long id);

    Bill getBillById(Long id);

    List<Bill> getAllBills();

}
