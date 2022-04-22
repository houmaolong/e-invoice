package com.lanpikj.invoice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lanpikj.invoice.dao.InvoiceJpaRepository;
import com.lanpikj.invoice.entity.Invoice;

@SpringBootTest
class EnvoiceApplicationTests {
	
	@Autowired
    private InvoiceJpaRepository invoiceJpaRepository;

	@Test
    public void testSave(){
		Invoice invoice=new Invoice();
		invoice.setInvoiceDate("20220422");
		invoiceJpaRepository.save(invoice);
	}
}
