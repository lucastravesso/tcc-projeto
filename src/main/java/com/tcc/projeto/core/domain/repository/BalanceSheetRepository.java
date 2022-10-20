package com.tcc.projeto.core.domain.repository;

import com.tcc.projeto.core.domain.entity.BalanceSheet;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BalanceSheetRepository extends CrudRepository<BalanceSheet, UUID> {
}
