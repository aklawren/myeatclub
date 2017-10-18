package com.gearlaunch.myeatclub.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 */
public class Payment {

	private Long id;

	private String referenceNumber;

	private String trackingNumber;

	private BigDecimal amount;

	private Date created;

	private Date updated;

	public Payment(final Long id, final String referenceNumber, final String trackingNumber, final BigDecimal amount, final Date created, final Date updated) {
		this.id = id;
		this.referenceNumber = referenceNumber;
		this.trackingNumber = trackingNumber;
		this.amount = amount;
		this.created = created;
		this.updated = updated;
	}

	public Long getId() {
		return id;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
}
