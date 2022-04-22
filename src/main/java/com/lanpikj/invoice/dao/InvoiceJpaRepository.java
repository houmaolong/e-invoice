package com.lanpikj.invoice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lanpikj.invoice.entity.Invoice;

public interface InvoiceJpaRepository extends JpaRepository<Invoice, Long> {

}
