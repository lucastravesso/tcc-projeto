package com.tcc.projeto.outbound.jpa;

import com.tcc.projeto.core.domain.entity.BalanceSheet;
import com.tcc.projeto.core.domain.entity.UserBalanceSheet;
import com.tcc.projeto.core.domain.repository.UserBalanceSheetRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaUserBalanceSheetRepository extends JpaRepository<UserBalanceSheet, UUID>, UserBalanceSheetRepository {

}
