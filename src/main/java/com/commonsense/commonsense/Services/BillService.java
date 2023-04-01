package com.commonsense.commonsense.Services;

import com.commonsense.commonsense.models.Bill;

import java.util.List;

public interface BillService  {

    public abstract Bill createBill(Bill bill);

    public abstract Bill updateBill(Long id);

    public abstract Bill deleteBill(Long id);

    public abstract Bill getBillById(Long id);

    public abstract List<Bill> getAllBills();



}
