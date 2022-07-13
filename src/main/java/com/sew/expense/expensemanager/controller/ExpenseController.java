package com.sew.expense.expensemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

  @GetMapping("/expense/{a}/{b}")
  public int totalExpense(@PathVariable int a, @PathVariable int b) {
    return a + b;
  }
}
