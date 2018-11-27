package com.qa.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.accounts.persistence.domain.AccountNum;

@Repository
public interface AccountRepository extends JpaRepository<AccountNum, String> {
}
