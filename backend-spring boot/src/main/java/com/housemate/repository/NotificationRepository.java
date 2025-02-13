package com.housemate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housemate.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
