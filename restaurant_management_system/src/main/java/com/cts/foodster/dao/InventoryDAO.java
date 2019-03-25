package com.cts.foodster.dao;

import java.util.List;

import com.cts.foodster.bean.Inventory;

public interface InventoryDAO {
public String addInventory(Inventory inventory);
public List<Inventory> getAllInventory();
public String deleteInventory(Inventory inventory);
public Inventory getInventory(String id);
public List<Inventory> searchInventory(String name);
public List<Inventory> sortInventory(String order);
public String editInventory(Inventory inventory);
}
