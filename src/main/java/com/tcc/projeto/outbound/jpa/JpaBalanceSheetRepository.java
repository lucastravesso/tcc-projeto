package com.tcc.projeto.outbound.jpa;

import com.tcc.projeto.core.domain.entity.BalanceSheet;
import com.tcc.projeto.core.domain.entity.Entry;
import com.tcc.projeto.core.domain.repository.BalanceSheetRepository;
import com.tcc.projeto.core.domain.repository.EntryRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface JpaBalanceSheetRepository extends JpaRepository<BalanceSheet, UUID>, BalanceSheetRepository {

    @Query(value = "SELECT b FROM UserBalanceSheet b WHERE b.idUser = :idUser")
    List<BalanceSheet> listByUserId(UUID idUser);
}
