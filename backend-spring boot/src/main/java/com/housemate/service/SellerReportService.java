package com.housemate.service;

import java.util.List;
import java.util.Optional;

import com.housemate.model.Seller;
import com.housemate.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
