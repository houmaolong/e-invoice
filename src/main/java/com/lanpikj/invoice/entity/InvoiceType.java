package com.lanpikj.invoice.entity;

import lombok.Getter;

@Getter
public enum InvoiceType {
	/*
	 * 增值税专用发票：special_vat_invoice 
	 * 增值税电子专用发票：elec_special_vat_invoice
	 * 增值税普通发票：normal_invoice 
	 * 增值税普通发票（电子）：elec_normal_invoice
	 * 增值税普通发票（卷式）：roll_normal_invoice 
	 * 通行费增值税电子普通发票：toll_elec_normal_invoice
	 * 区块链电子发票（目前仅支持深圳地区）：blockchain_invoice 
	 * 全电发票（专用发票）：elec_invoice_special
	 * 全电发票（普通发票）：elec_invoice_normal 
	 * 货运运输业增值税专用发票：special_freight_transport_invoice
	 * 机动车销售发票：motor_vehicle_invoice 
	 * 二手车销售发票：used_vehicle_invoice
	 */
	SPECIAL_VAT_INVOICE("增值税专用发票"), 
	ELEC_SPECIAL_VAT_INVOICE("增值税电子专用发票"),
	ELEC_NORMAL_INVOICE("增值税普通发票（电子）"),
	ROLL_NORMAL_INVOICE("增值税普通发票（卷式）"),
	TOLL_ELEC_NORMAL_INVOICE("通行费增值税电子普通发票"),
	BLOCKCHAIN_INVOICE("区块链电子发票（目前仅支持深圳地区）"),
	ELEC_INVOICE_SPECIAL("全电发票（专用发票）"),
	ELEC_INVOICE_NORMAL("全电发票（普通发票）"),
	SPECIAL_FREIGHT_TRANSPORT_INVOICE("货运运输业增值税专用发票"),
	MOTOR_VEHICLE_INVOICE("机动车销售发票"),
	USED_VEHICLE_INVOICE("二手车销售发票");
	private  String typeDesc;
  
    private InvoiceType(String typeDesc) {
        this.typeDesc = typeDesc;
    }
}
