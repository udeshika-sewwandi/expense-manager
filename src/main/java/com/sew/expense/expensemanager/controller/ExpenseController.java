package com.sew.expense.expensemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

  /**
   * Returns the sum of the given integers.
   * @param a first integer
   * @param b second integer
   * @return Returns the sum of the given integers.
   */
  @GetMapping("/expense/{a}/{b}")
  public int totalExpense(@PathVariable int a, @PathVariable int b) {
    return a + b;
  }
}
