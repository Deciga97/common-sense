package com.commonsense.commonsense.Services;

import com.commonsense.commonsense.models.Donation;

import java.util.List;

public interface DonationService {
    public abstract Donation createDonation(Donation donation);
    public abstract Donation updateDonation(Long id, Donation donation);
    public abstract void deleteDonation(Long id);
    public abstract Donation getDonationById(Long id);
    public abstract List<Donation> getAllDonations();
}
