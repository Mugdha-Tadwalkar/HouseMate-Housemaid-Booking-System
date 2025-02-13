package com.housemate.service;

import java.util.List;

import com.housemate.model.Home;
import com.housemate.model.HomeCategory;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
