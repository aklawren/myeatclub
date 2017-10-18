package com.gearlaunch.myeatclub.model;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.util.Date;
import java.util.List;

/**
 */
public class MenuItem {

	public enum MenuType {
		Breakfast, Lunch, Dinner, Snacks
	}

	public enum MenuItemStatus {
		DRAFT, AVAILABLE, UNAVAILABLE, SOLD_OUT
	}

	private Long id;

	private String name;

	private MenuType menuType;

	private BigDecimal price;

	private List<DayOfWeek> daysAvailable;

	private Date created;

	private Date updated;

	private MenuItemStatus status;

	private boolean isGlutenFree;

	private boolean isVegan;

	private boolean isDairyFree;

	public MenuItem(final Long id, final String name, final MenuType menuType, final BigDecimal price,
					final List<DayOfWeek> daysAvailable, final Date created, final Date updated,
					final MenuItemStatus status, final boolean isGlutenFree, final boolean isVegan, boolean isDairyFree) {
		this.id = id;
		this.name = name;
		this.menuType = menuType;
		this.price = price;
		this.daysAvailable = daysAvailable;
		this.created = created;
		this.updated = updated;
		this.status = status;
		this.isGlutenFree = isGlutenFree;
		this.isVegan = isVegan;
		this.isDairyFree = isDairyFree;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MenuType getMenuType() {
		return menuType;
	}

	public void setMenuType(MenuType menuType) {
		this.menuType = menuType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<DayOfWeek> getDaysAvailable() {
		return daysAvailable;
	}

	public void setDaysAvailable(List<DayOfWeek> daysAvailable) {
		this.daysAvailable = daysAvailable;
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

	public MenuItemStatus getStatus() {
		return status;
	}

	public void setStatus(MenuItemStatus status) {
		this.status = status;
	}

	public boolean isGlutenFree() {
		return isGlutenFree;
	}

	public void setGlutenFree(boolean glutenFree) {
		isGlutenFree = glutenFree;
	}

	public boolean isVegan() {
		return isVegan;
	}

	public void setVegan(boolean vegan) {
		isVegan = vegan;
	}

	public boolean isDairyFree() {
		return isDairyFree;
	}

	public void setDairyFree(boolean dairyFree) {
		isDairyFree = dairyFree;
	}
}
