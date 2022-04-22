package com.lanpikj.invoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_invoice")
@Getter
@Setter
public class Invoice {
	@Id // 主键id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 主键生成策略
	@Column(name = "id") // 数据库字段名
	private Long id;
    /**
     * 发票代码
     */
	private String invoiceCode;
	/**
	 *  发票号码
	 */
	private String invoiceNum;
	/**
	 *  开票日期
	 */
	private String invoiceDate;
	/**
	 *  发票金额
	 */
	private Float totalAmount;
	/**
	 * 校验码
	 */
	private String checkCode;
	/**
	 * 发票类型
	 */
	@Enumerated
	private InvoiceType invoiceType;
	/**
	 * 开票内容
	 */
	private String  billingContent;
	/**
	 * 开票公司名称
	 */
	private String billingCompanyName ;
	/**
	 * 报销日期
	 */
	private String reimbursementDate ;
	/**
	 * 报销人
	 */
	private String reimbursementPerson ;
	/**
	 * 备注 
	 */
	private String remarks ;
	/**
	 * 序号
	 */
	private String serialNumber ;
}
